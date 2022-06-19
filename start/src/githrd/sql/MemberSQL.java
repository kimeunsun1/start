package githrd.sql;

public class MemberSQL {
	// 회원번호와 아이디를 조회해서 출력해주는 함수
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	// [] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	public final int MEM_INFO		= 1001;
	public final int MEM_1001		= 1002;
	public final int TEL_CHANGE		= 1003;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer(); 
		switch(code) {
		case MEM_INFO:
			buff.append("SELECT ");
			buff.append("    mno, id ");
			buff.append("FROM ");
			buff.append("    member ");				
			break;
		case MEM_1001:
			buff.append("SELECT ");
			buff.append("    * ");
			buff.append("FROM ");
			buff.append("    member ");				
			buff.append("WHERE ");
			buff.append("    mno = 1001 ");				
			break;
		case TEL_CHANGE:
			buff.append("UPDATE ");
			buff.append("    member ");
			buff.append("SET ");
			buff.append("    tel = '010-1212-1212' ");				
			buff.append("WHERE ");
			buff.append("    mno = 1001 ");				
			break;
	}
		return buff.toString();
	}
}
