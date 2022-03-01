package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 */
import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
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
	}

}
