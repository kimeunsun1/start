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
 */

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
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
	}

}
