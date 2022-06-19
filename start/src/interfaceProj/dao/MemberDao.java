package interfaceProj.dao;

import java.sql.*;
import java.util.ArrayList;

import empProj.db.ScottJDBC;
import empProj.sql.EmpSQL;
import interfaceProj.db.*;
import interfaceProj.sql.*;
import interfaceProj.vo.MemberVO;

// 테이블 조회 작업 클래스
public class MemberDao {
	private GitJDBC db;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;

	public MemberDao() {
		// 오라클 드라이버를 로딩
		db = new GitJDBC();
		
		// 질의명령을 사용 준비
		mSQL = new MemberSQL();
	}
	
	// 회원번호를 입력받아 해당 번호의 회원 정보를 반환하는 함수
	public MemberVO getMemberInfo(int mno){
		// 반환값 변수
		MemberVO mvo = new MemberVO();
		
		// Connection
		con = db.getCON();
		
		// sql
		String sql = mSQL.getSQL(mSQL.MEMBER_INFO);
		
		// 명령 전달 함수 pstmt
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// 질의명령 완성
			pstmt.setInt(1, mno);
			// 질의명령 송신후 결과 수신
			rs = pstmt.executeQuery();
			rs.next();
			
			mno = rs.getInt("mno");
			String name = rs.getString("name");
			String id = rs.getString("id");
			String mail = rs.getString("mail");
			
			// 데이터 저장
			mvo.setMno(mno);
			mvo.setName(name);
			mvo.setId(id);
			mvo.setMail(mail);
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return mvo;
	}
}
