package day04.ex;

import java.util.Scanner;

/*
 	문제 2 ]
 		문자를 임의로 랜덤하게 입력한 후
 		그 문자가 대문자이면 소문자로
 		소문자이면 대문자로 변환하고
 		만약 특수문자이면 그 문자 그대로 
 		출력하는 프로그램을 작성하세요.
 		(3항 연산자로 해결)
 		
 		참고 ]
 			아스키 코드는
 			
 			특수문자 - 숫자( 0 ~ 9 ) - 특수문자 - 영문대문자( A ~ Z ) - 특수문자 - 소문자( a ~ z ) - 특수문자
 			
 			참고 ]
 				문자열에서 문자를 추출하는 방법
 				
 					문자열.charAt(위치값)
 					
 				이때 위치값은 0 부터 시작한다.
 				
 					예 ]
 						"abcd" 에서 두번째 문자를 추출하려면
 						
 						"abcd".charAt(1) ==> 'b'
 						
 				'J' -> 'j'
 				
 				(char)('J' + ('a' - 'A'))
 */

import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {
		// 할일
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 메시지 출력하고
		System.out.print("문자 입력 : ");
		// 입력받아 문자열 저장하고
		String str = sc.nextLine();
		// 문자열에서 문자 추출하고
		char ch = str.charAt(0);
		
		// 판별하고 (판별결과는 변수에 담아서 처리하자)
		char result = (ch < 'A') ? (ch) : (
					(ch <= 'Z') ? (char)(ch + ('a' - 'A')/*소문자로 변환*/) : 
						(ch < 'a') ? (ch) : (
								(ch <= 'z') ? (char)(ch - ('a' - 'A')/*대문자로 변환*/) : ch
								)
					);
		
		/*
		 	A - Z - 특수문자 - a ~ z - 특수문자
		 */
		// 결과 출력하고
		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환된 문자 : " + result);
	}
}
