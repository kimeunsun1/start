package day05;

/*
 	정수를 입력받아서
 	그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요.
 	단, 0 인 경우는 0으로 출력하세요.
 	
 	if ~ else 구문으로 처리하세요.
 */

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력메시지 출력
		System.out.print("정수 입력 : ");
		// 입력받아서 변수에 기억시키고
		int no = sc.nextInt();
		
		String result = "정수"; // ** 제어문이 시작되기 전에 변수를 선언해야 한다 **
		// 판별하고
		
		if(no == 0) {
			// no 가 0인 경우
			result = "0";
		} else {
			// no 가 0이 아닌 경우
			if(no % 2 == 0) {
				// 짝수인 경우
				result = "짝수";
			} else {
				// 홀수인 경우
				result = "홀수";
			}
		}
		
		// 결과 출력
		System.out.println("입력한 정수 " + no + " 는 " + result + " 입니다.");
		
	}
	/* 동일 구간 내에 선언된 변수만 공동으로 사용 가능
	void abc() {
		System.out.println(no);
	}
	*/

}
