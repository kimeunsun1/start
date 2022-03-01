package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
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
	}

}
