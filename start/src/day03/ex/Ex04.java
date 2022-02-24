package day03.ex;

/*
 	1년은 365.2426 일이다.
 	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 	
 	힌트 ]
 		365.2426일은 단위가 일 단위이다.
 		하루는 24시간이다.
 		따라서 0.5일은 12시간을 의미한다.
 */

/*
public class Ex04 {
	public static void main(String[] args) {
		
		double yy = 365.2426;
		double y = yy;
		double yyy = 0.2426 * 24 * 60 * 60;
		
		// 일
		int il = (int)y;
		// y = y % 365;
		
		// 시간
		int si = (int) yyy / 60 / 60;
		 yyy = yyy % 24;
		
		// 분
		int boon = (int) yyy / 60;
		yyy = yyy % 60;
				
		// 초
		int cho = (int) yyy;
		
		System.out.println("1년은 " + yy + "일이다");
		System.out.println("이것은 "+ il + "일 " + si + "시간 " + boon + "분 " + cho + "초이다");
	}
}
*/

public class Ex04 {
	public static void main(String[] args) {
		
		double yy = 365.2426;
		double y = yy;
		double yyy = 0.2426 * 24 * 60 * 60;
		
		// 일
		int il = (int)y;
		// y %= 365;
		
		// 시간
		int si = (int) yyy / 60 / 60;
		 yyy %= 24;
		
		// 분
		int boon = (int) yyy / 60;
		yyy %= 60;
				
		// 초
		int cho = (int) yyy;
		
		System.out.println("1년은 " + yy + "일이다");
		System.out.println("이것은 "+ il + "일 " + si + "시간 " + boon + "분 " + cho + "초이다");
	}
}