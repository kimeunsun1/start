package day05.ex;

/*
	문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 : 54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
			
			횟수도 같이 출력되게 하세요.
			
			추가 ]
			단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고
			프로그램이 종료되게 하세요.
 */

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 랜덤한 숫자 만들고
		int num = (int) (Math.random() * (100 - 1 + 1) + 1);
		// 횟수제한이 있기 때문에 카운터변수가 있는 for 반복문을 사용하도록 한다.
		// 3. 반복해서 처리
		for(int i = 0; i < 5; i++) {
			// 3-1. 사용자가 숫자를 입력한다.
			System.out.print("숫자 입력 : ");
			int no = sc.nextInt();
			
			// 3-2. 비교해서 결과를 보여준다.
			if(no == num) {
				System.out.println("입력한 수 " + no + " 맞습니다.");
				// 정답을 맞췄으므로 반복을 종료한다.
				break;
			} else if(no > num && i != 4) {
				System.out.println("큰 수를 입력했습니다.");
				continue;
			} else if(no < num && i != 4) {
				System.out.println("작은 수를 입력했습니다.");
				continue;
			}
			
			if(i == 4) {
				System.out.println("##### 게임에서 졌습니다. #####");
			}
		}
			
		/*
		// 랜덤 정수 발생
		int no = (int) (Math.random() * (100 - 1 + 1) + 0);
		
		// 숫자 판별 & 횟수 카운트
		int i = 0;
		for (i = 0 ; i < 100 ; i++) {
			// 유저 숫자 입력
			Scanner sc = new Scanner(System.in);
			// 입력 메시지 생성
			System.out.print("정수 입력 : ");
			// 데이터 저장
			int num = sc.nextInt();
			if (no == num) {
				System.out.print("사용자 입력 숫자는 " + num + ", " + (i + 1) + "번째 시도하여 정답을 맞췄습니다.\n");
				break;
			} else if(no > num) {
				System.out.print("사용자 입력 숫자는 " + num + ", " + (i + 1) + "번째 시도이며 입력한 수가 더 작습니다.\n");				
			} else if(no < num) {
				System.out.print("사용자 입력 숫자는 " + num + ", " + (i + 1) + "번째 시도이며 입력한 수가 더 큽니다.\n");				
			}
		}
		// 결과 출력
		 
		 */
	}
	

}
