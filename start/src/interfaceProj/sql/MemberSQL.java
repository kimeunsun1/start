package interfaceProj.sql;

// 회원정보 질의명령 클래스
public class MemberSQL {
	// 코드변수
	public final int MEMBER_INFO	= 1000;
	
	// 질의명령 반환 함수
	public String getSQL(int code) {
		// 반환값 생성 변수
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case MEMBER_INFO:
			buff.append("SELECT ");
			buff.append("	mno, name, id, mail ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("	AND mno = ? ");
			break;
		}
		
		return buff.toString();
	}
}
