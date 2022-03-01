package day04.ex;

/*
 	문제 4 ]
 		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서
 		이 숫자를 년도로 하는 해는
 		윤년인지 평년인지를 판별해서 출력해주는 
 		프로그램을 작성하세요.
 		
 		참고 ]
 			윤년은 4로 나누어 떨어지고
 					100 나누어 떨어지면 안되고
 					400으로 나누어 떨어지는 해를 윤년이라 한다.
 */
public class Ex04_01 {
	public static void main(String[] args) {
		// 1000 ~ 3000 사이의 숫자를 랜덤 발생
		int year = (int) (Math.random() * (3000 - 1000 + 1) + 1000);
		// 윤년 평년 판별				
		if(year % 4 == 0) {
			if(year % 100 != 0) {
				if(year % 400 == 0) {
					System.out.println(year + " 년은 윤년입니다.");
				} else {			
					System.out.println(year + " 년은 평년입니다.");
				}
			} else {			
				System.out.println(year + " 년은 평년입니다.");
			}
		} else {			
			System.out.println(year + " 년은 평년입니다.");
		}
		// 결과 출력
	}
}
