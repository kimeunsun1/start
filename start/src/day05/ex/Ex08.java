package day05.ex;

/*
	문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
 */

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		// 데이터 저장
		String no = sc.nextLine();
		// 각자리 수 합
		int i = 0;
		int r = 0;
		int a = no.length();
		for(i = 0 ; i < a ; i++) {
			r = r + (int) (no.charAt(i) - 48);
		}
		// 결과 출력
		System.out.println(no + " 의 각 자리 합은 " + r);
	}

}
