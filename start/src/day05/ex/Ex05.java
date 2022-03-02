package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
		추가 ]
					컴퓨터
					1		2		3
 		사람	1	0		1		2
 				2	-1		0		1
 				3	-2		-1		0
 				
 				여기서
 					비긴 경우 결과값		0
 					컴퓨터가 이긴 경우		1, -2
 					사람이 이긴 경우		-1, 2
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 2. 입력메세지 출력하고
			System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요!\n게임종료는 0을 입력하세요!");
			// 3. 입력받아서 변수에 기억하고
			int saram = sc.nextInt();
			System.out.println("*****************************");
			// 입력된 숫자가 종료숫자이면 바로 종료시킨다.
			if(saram == 0) {
//				System.out.println("##### 게임을 종료합니다. #####");
				break;
			}
			
			// 컴퓨터와 사람의 코드에 따라서 가위, 바위, 보를 기억할 변수
			
			String sstr = "가위";
			switch(saram) {
			case 1:
				sstr = "가위";
				break;
			case 2:
				sstr = "바위";
				break;
			case 3:
				sstr = "보";
				break;
			default:
				continue; // 조건식으로 이동시켜 다시 실행
			}
			
			// 4. 랜덤하게 컴퓨터 숫자 만들고
			int samtl = (int)(Math.random() * 3 + 1);
			
			String comstr = "가위";
			switch(samtl) {
			case 2:
				comstr = "바위";
				break;
			case 3:
				comstr = "보";
				break;
			}
					
			// 5. 계산해서 결과값 만들고
			int result = samtl - saram;
			// 6. 조건에 따라서 결과 출력하고
			
			String msg = "비";
			if(result == 1 || result == -2) {
				msg = "컴퓨터가 이";
//				System.out.println("컴퓨터는 " + comstr + "사람은 " + sstr + "으로 컴퓨터가 이겼습니다.");
			} else if(result == 2 || result == -1) {
				msg = "사람이 이";
//				System.out.println("컴퓨터는 " + comstr + "사람은 " + sstr + "으로 사람이 이겼습니다.");
			} else {
//				System.out.println("컴퓨터는 " + comstr + "사람은 " + sstr + "으로 비겼습니다.");
			}
			System.out.println("컴퓨터는 " + comstr + "\n사람은 " + sstr + "로 " + msg + "겼습니다.");
			System.out.println("-------------------------------------");
		}
		System.out.println("##### 게임을 종료되었습니다. #####");
		
		/* 내 코딩
		// 1 ~ 3 사이의 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		// 입력 메세지
		System.out.print("1 ~ 3 사이의 숫자 입력 : ");
		// 데이터를 저장
		int u = sc.nextInt();
		// 컴퓨터 랜덤 1 ~ 3 사이의 숫자 발생
		int c = (int) (Math.random() * (3 - 1 + 1) + 1);
		// 1:가위 2:바위 3:보 지정3
		String aa = "가위";
		String bb = "바위";
		String cc = "보";
		
		// 승부 판정
		if(u - c == 0) {
			if(u == 1) {
				System.out.println("유저 : " + aa + " , 컴퓨터 : " + aa + " 로 비겼습니다.");
			} else if(u == 2) {
				System.out.println("유저 : " + bb + " , 컴퓨터 : " + bb + " 로 비겼습니다.");
			} else if(u == 3) {
				System.out.println("유저 : " + cc + " , 컴퓨터 : " + cc + " 로 비겼습니다.");
			}
		} else if(u - c <= 1 && u - c >0) {
			if(u == 3 ) {
				System.out.println("유저 : " + cc + " , 컴퓨터 : " + bb + " 로 유저가 이겼습니다.");				
			} else if(u == 2) {
				System.out.println("유저 : " + bb + " , 컴퓨터 : " + aa + " 로 유저가 이겼습니다.");				
			}
		} else if(c - u <= 1 && c - u >0) {
			if(u == 3 ) {
				System.out.println("유저 : " + bb + " , 컴퓨터 : " + cc + " 로 컴퓨터가 이겼습니다.");				
			} else if(u == 2) {
				System.out.println("유저 : " + aa + " , 컴퓨터 : " + bb + " 로 컴퓨터가 이겼습니다.");				
			}
		} else if(u - c > 1) {
			System.out.println("유저 : " + cc + " , 컴퓨터 : " + aa + " 로 컴퓨터가 이겼습니다.");
		}else if(c - u > 1) {
			System.out.println("유저 : " + aa + " , 컴퓨터 : " + cc + " 로 유저가 이겼습니다.");
		}
		
		
		// 결과 출력
		*/
	}

}
