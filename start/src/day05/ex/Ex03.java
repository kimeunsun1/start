package day05.ex;

/*
 	문제 3 ]
 		문자열을 입력받아서
 		문자를 한글자씩 추출해서 출력하세요.
 		
 		참고 ]
 			문자열의 길이를 알아내는 방법
 			
 				int 변수 = 문자열.length();
 */

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		// 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		// 데이터를 저장한다.
		String s = sc.nextLine();
		// 문자열 길이를 찾는다.
		int i = 0;
//		int[] ss = ch;
		int ss = s.length();
		// 문자를 추출한다.
		for(i = 0; i < ss ; i++) {
		int ch = s.charAt(i);	
		System.out.print((char) ch + "\t");	
		}
		// 결과 출력
//		System.out.println(ch);
	}

}
