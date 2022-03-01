package day05.ex;

/*
	문제 4 ]
		전기요금을 계산해주는 프로그램을 작성하세요.
		
		전기요금표
			
						코드		기본요금		사용요금
			가정용		1			3800			245
			산업용		2			2400			157
			교육용		3			2900			169
			상업용		4			3200			174
			
			
		전기요금은 
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// 코드와 사용량 입력
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		// 데이터 저장
		System.out.print("코드 입력 : ");
		int r1 = sc1.nextInt();
		
		System.out.print("사용량 입력 : ");		
		int r2 = sc2.nextInt();
		
		int rr = 0;
		String yy = "용도";
		// 전기요금 계산
		switch(r1) {
		case 1 :
			rr = 3800 + (r2 * 245);
			yy = "가정용";
			break;
		case 2 :
			rr = 2400 + (r2 * 157);
			yy = "산업용";
			break;
		case 3 :
			rr = 2900 + (r2 * 169);
			yy = "교육용";
			break;
		case 4 :
			rr = 3200 + (r2 * 174);
			yy = "상업용";
			break;
		}
		// 결과 출력
		System.out.println("코드 " + r1 + " 번의 용도는 " + yy + "이며 " + 
							"사용량 " + r2 + " 에 대한 전기요금은 " + rr + " 원입니다.");
	}

}
