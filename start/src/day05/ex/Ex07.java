package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
		
		힌트 ]
		
			***** % 10 ==> 마지막자리만 꺼낸다.
			***** / 10 ==> *****
				<-----
 */
import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("5자리 정수 입력 : ");
		// 입력받고 기억하고
		int no = sc.nextInt(); // 합을 누적할 변수는 반복문 내에 선언하면 안된다.
		
		int sum = 0;
		
		int tmp = no;
		//반복해서 합 구하고
		for(int i = 0; i < 5; i++) {
			sum = sum + tmp % 10;
			tmp = tmp / 10;
		}
		// 결과 출력하고
		System.out.println("입력한 수 : " + no +" 의 각 자리수의 합은 " + sum + " 입니다.");
		/*
		// 5자리 숫자 입력
		Scanner sc = new Scanner(System.in);
		// 입력 메세지 생성
		System.out.print("5자리 숫자 입력 : ");
		// 데이터 저장
		int s = sc.nextInt();
		// 문자열 위치 추출
		
		// 각 자리의 수 합계
		int num = 0;				
		while(s != 0) {
			num += s % 10;
			s /= 10;
		}
		System.out.println(num);
		// 결과 출력
		 
		 */
	}

}
