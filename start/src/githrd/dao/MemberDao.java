package githrd.dao;

/*
 	이 클래스는 Member 테이블에 관련된 데이터베이스 작업만
 	전담으로 처리해주는 기능들을 모아놓은 클래스
 */

import java.sql.*;
import java.util.ArrayList;

import githrd.db.*;
import githrd.sql.*;
import githrd.vo.*;

public class MemberDao {
	// 회원번호와 아이디를 조회해서 출력해주는 함수
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	// [] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	private JenyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new JenyJDBC();
		mSQL = new MemberSQL();
//		con = db.getCon();
//		System.out.println("커넥션 꺼내오기 성공");
	}
	
	public ArrayList<MemberVO> checkMem() {
		// 할일
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		// 커넥션
		con = db.getCon();
		// 질의명령
		String sql = mSQL.getSQL(mSQL.MEM_INFO);
		// 명령전달도구
		stmt = db.getStmt(con);
		// 질의명령 보내기
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()){
			MemberVO mVO = new MemberVO();
			
			int mno = rs.getInt("mno");
			String id = rs.getString("id");
			
			mVO.setMno(mno);
			mVO.setId(id);
			
			list.add(mVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return list;
	}
	
	public MemberVO Mem1001() {
		MemberVO mVO = new MemberVO();
		// 할일
		// 커넥션
		con = db.getCon();
		// 질의명령
		String sql = mSQL.getSQL(mSQL.MEM_1001);
		// 명령전달도구
		stmt = db.getStmt(con);
		try {
		// 질의명령 보내기
			rs = stmt.executeQuery(sql);
			rs.next();
		// 데이터 꺼내기
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String mail = rs.getString("mail");
			String tel = rs.getString("tel");
			int avt = rs.getInt("avt");
			Date joinadate = rs.getDate("joinadate");

		// 꺼낸 데이터 VO에 담기
			mVO.setMno(mno);
			mVO.setName(name);
			mVO.setId(id);
			mVO.setPw(pw);
			mVO.setMail(mail);
			mVO.setTel(tel);
			mVO.setAvt(avt);
			mVO.setJoindate(joinadate);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(sql);
			db.close(con);
		}
		// 데이터 반환
		return mVO;
	}
	
	public int TEL_CHANGE() {
		// 할일
		// 반환값 변수
		int cnt = 0;
		// 커넥션
		con = db.getCon();
		// 질의명령
		String sql = mSQL.getSQL(mSQL.TEL_CHANGE);
		// 명령전달도구
		stmt = db.getStmt(con);
		// 질의명령 보내기
		try {
			cnt = stmt.executeUpdate(sql);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(stmt);
			db.close(con);
		}
		// 데이터 반환
		return cnt;
	}
	
}
