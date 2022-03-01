package day04.ex;

/*
 	문제 1 ]
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항연산자를 사용해서 처리하세요.
 */
public class Ex01_01 {
	public static void main(String[] args) {
		// if 문
		// 1 ~ 25 의 숫자 3개 랜덤 발생
		int no1 = (int) (Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int) (Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int) (Math.random() * (25 - 1 + 1) + 1);
		// 가장 큰 수 판별
		
		if (no1 > no2) {
			if (no1 > no3) {
				System.out.println("숫자 " + no1 + " , " + no2 + " , " + no3 + " 중에서");
				System.out.println("가장 큰 수 : " + no1);
			} else if (no2 > no3) {
				System.out.println("숫자 " + no1 + " , " + no2 + " , " + no3 + " 중에서");
				System.out.println("가장 큰 수 : " + no2);				
			} else {
				System.out.println("숫자 " + no1 + " , " + no2 + " , " + no3 + " 중에서");
				System.out.println("가장 큰 수 : " + no3);								
			}
		}
		
	}
}
