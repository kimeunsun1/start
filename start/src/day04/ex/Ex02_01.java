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

import java.util.*;
public class Ex02_01 {
	public static void main(String[] args) {
		// 문자 임의 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		// 데이터 변수에 저장
		String result = sc.nextLine();	
		// 대소문자 판별
		char ch = result.charAt(0);
		
		if(ch < 'A') {
			System.out.println("입력된 문자는 특수문자 [ " + ch + " ] 입니다.");
		} else if(ch <= 'Z') {
			System.out.println("입력된 문자는 대문자 [ " + ch + " ] 로 소문자로 변환하면 [ " + (char) (ch + ('a' - 'A')) + " ] 입니다.");			
		} else if(ch < 'a') {
			System.out.println("입력된 문자는 특수문자 [ " + ch + " ] 입니다.");			
		} else if(ch <= 'z') {
			System.out.println("입력된 문자는 소문자 [ " + ch +" ] 로 대문자로 변환하면 [ " + (char) (ch - ('a' - 'A')) + " ] 입니다.");
		} else {
			System.out.println("입력된 문자는 영문자 외의 문자 [ " + ch + " ] 입니다.");
		}
		// 출력
	}
}
