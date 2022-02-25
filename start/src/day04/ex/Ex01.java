package day04.ex;

/*
 	문제 1 ]
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항연산자를 사용해서 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		// () ? () : ();
		// 할일
		// 1 ~ 25 의 숫자 3개를 랜덤하게 발생시키고
		int no1 = (int) (Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int) (Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int) (Math.random() * (25 - 1 + 1) + 1);
			
		// 가장 큰 수 판별
		int no = (no1 >= no2) ?  ((no1 >= no3) ? no1 : no3 ) : ((no2 >= no3) ? no2 : no3) ;
		
		// 출력
		System.out.println("숫자1 : " + no1);
		System.out.println("숫자2 : " + no2);
		System.out.println("숫자3 : " + no3);
		System.out.println("가장 큰 수 : " + no);
		
		
	}
}
