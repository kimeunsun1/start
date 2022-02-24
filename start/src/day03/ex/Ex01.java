package day03.ex;

/*
 	문제 1 ]
 		두개의 숫자를 입력받은 후(가로, 세로)
 		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서
 		결과를 출력하세요.
 		
 		출력형식 ]
 		
 			가로 :  xxxxx
 			세로 :	xxxxx
 			사각형 넓이 : xxxxxx ==> 가로 X 세로
 			삼각형 넓이 : xxxxx.x ==> 밑변 X 높이 X 1/2 (실수 형태)
 			
 	참고 ]
 		자바에서 * 기호의 의미
 			1. 연산자로서 곱하기의 의미
 			2. 모든것을 의미
 */

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		
		// 입력 메세지 출력
		System.out.print("가로 : ");
		
		/*
		String garo = sc.nextLine(); // 문자열로 입력받는 방법
		//정수형태의 문자열을 정수로 변환하는 방법
		//Integer.parseInt(문자열);
		int width = Integer.parseInt(garo);
		System.out.println("입력된 가로 : " + garo + 20); // 문자열 연산
		
		
		
		*/
		
		/*
		 	정수로 입력받는 방법
		 		int 변수이름 = sc.nextInt();
		 */
		
		int width = sc.nextInt();
		
		// 출력
		System.out.println("입력된 정수 가로 : " + width); // 산수 연산
		
		// 메세지 출력
		System.out.print("세로 : ");
		int sero = sc.nextInt();
		
		System.out.println("입력된 세로 : " + sero);
		
		System.out.println("사각형 넓이 : " + (width * sero));
		
		System.out.println("-----------------------");
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("밑변 : ");
		double twidth = sc1.nextDouble(); // 밑변 길이 실수로 입력받기
		
		System.out.println("실수 밑변 : " + twidth);
		
		System.out.print("높이 : ");
		double theight = sc1.nextDouble(); // 높이 실수로 입력받기
		
		System.out.println("실수 높이 : " + theight);
		
		System.out.println("삼각형 넓이 : " + twidth * theight * 1/2);
		
		
	}
}
