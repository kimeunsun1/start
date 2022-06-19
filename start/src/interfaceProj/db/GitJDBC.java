package interfaceProj.db;

import java.sql.*;

//	이 클래스는 오라클의 jennie 계정 전용 JDBC 작업 프로그램 

public class GitJDBC {
	// 오라클 드라이버 로딩
	public GitJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
		}
	}

	// 오라클 Connection 함수
	public Connection getCON() {
		// 반환값 변수
		Connection con = null;
		
		// 필요한 정보 준비
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jennie";
		String pw = "12345";
		
		// 커넥션 연결
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {}
		
		// 커넥션 반환
		return con;
	}
	
	// 명령 전달 도구 Statment 반환 함수
	public Statement getSTMT(Connection con) {
		// 반환값 변수
		Statement stmt = null;
		
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
			// 명령 전달 도구 준비
		} catch(Exception e) {}
		
		return stmt;
	}
	// 명령 전달 도구 PreparedStatment 반환 함수
	public PreparedStatement getPSTMT(Connection con, String sql) {
		// 반환값 변수
		PreparedStatement pstmt = null;
		
		// 명령 전달 도구 준비
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {}
		
		return pstmt;
	}
	
	// 사용하지 않는 자원 반환 함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}
}
