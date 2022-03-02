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
		// 할일
		// 1. 입력도구를 준비한다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			

		// 2. 입력메세지 출력한다.
		System.out.print("* 사용용도 코드를 입력하세요!\n\t가정용\t1\n\t산업용\t2\n\t교육용\t3\n\t상업용\t4\n입력코드 : ");
		// 3. 입력받아서 변수 기억시킨다.
		int code = sc.nextInt();
		/*
		 	블럭킹함수(Blocking Method)
		 		: 특정상황이 될때까지 그 함수에서 실행을 멈추고 기다리는 함수
		 */
		
		if (code == 0){
			System.out.println("프로그램을 종료합니다.");
			// 이 경우는 프로그램을 즉시 종료해야 하므로
			break;
		}
		// System.out.print("입력코드 : " + code);
		// 2-1. 입력메세지 출력한다.
		System.out.print("사용량 입력 : ");
		
		// 3-1. 입력받아서 변수 기억시킨다.
		int sayong = sc.nextInt();
		
		// 4. 용도에 맞게 계산해서 변수에 기억시키고
		String yd = "";
		int money = 0;
		
		switch(code) {
		case 1 :
			yd = "가정용";
			money = 3800 + 245 * sayong;			
//			System.out.println("입력된 코드는 가정용으로 사용량은 " + 
//								sayong + " 이고\n전기요금은 "+ (3800 + 245 * sayong) + " 원입니다.");
			break;
		case 2 :
			yd = "산업용";
			money = 2400 + 157 * sayong;			
//			System.out.println("입력된 코드는 산업용으로 사용량은 " + 
//								sayong + " 이고\n전기요금은 "+ (2400 + 157 * sayong) + " 원입니다.");
			break;
		case 3 :
			yd = "교육용";
			money = 2900 + 169 * sayong;			
//			System.out.println("입력된 코드는 교육용으로 사용량은 " + 
//								sayong + " 이고\n전기요금은 "+ (2900 + 169 * sayong) + " 원입니다.");
			break;
		case 4 :
			yd = "상업용";
			money = 3200 + 174 * sayong;			
//			System.out.println("입력된 코드는 상업용으로 사용량은 " + 
//								sayong + " 이고\n전기요금은 "+ (3200 + 174 * sayong) + " 원입니다.");
			break;
		}
		
		// 5. 결과 출력하고
		System.out.println("입력된 코드는 " + yd + "으로 사용량은 " + 
							sayong + " 이고\n전기요금은 "+ money + " 원입니다.");
		System.out.println("--------------------------------------------------------\n");
		System.out.println();
		}

		
		/*
		// 내 코딩
		
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
		 */
	}
}
