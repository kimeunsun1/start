package day05.ex;

/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :
			두 수의 약수중 제일 큰 수.
			두 수를 나눌 수 있는 수중 제일 큰 수
			
		extra ]
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
 */
import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1번 입력메세지
		System.out.print("첫번째 숫자 :");
		// 1번 데이터 기억
		int no1 = sc.nextInt();
		// 2번 입력메세지
		System.out.print("두번째 숫자 :");
		// 2번 데이터 기억
		int no2 = sc.nextInt();
		// 두 수 중 작은 수를 찾는다.
		int min = (no1 < no2) ? no1 : no2;
		
		int result = 1;
		// 공약수 찾기
		for(int i = min; i > 1; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				result = i;
				// 원하는 숫자를 찾았으므로 더이상 반복작업을 할 이유가 없다.
				// 따라서 즉시 반복문을 종료시킨다.
				break; // for문에 break 작동
			}
		}
		// 결과 출력하기
		System.out.println("입력받은 두 수 " + no1 + " | " + no2 + " 의 최대공약수는 " + result + " 입니다.");
		
		/*
		// 두 수를 입력받는다.
		Scanner sc1 = new Scanner(System.in);		
		System.out.print("첫번째 수 입력 : ");		
		int no1 = sc1.nextInt();
		
		System.out.println();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("두번째 수 입력 : ");		
		int no2 = sc2.nextInt();
		
		System.out.println();
		
		int a = 0;
		int b = 0;
		int i = 1;
		int j = 1;
		
		// System.out.print("첫번째 수의 약수 : ");
		for(i = 1 ; i <= no1; i++) {
			if(no1 % i == 0) {
				a = no1 / i;
				System.out.print(i + "\t");
			}
		}
		
		System.out.println();
		
		// System.out.print("두번째 수의 약수 : ");
		for(j = 1 ; j <= no2; j++) {
			if(no2 % j == 0) {
				b = no2 / j;
				System.out.print(j + "\t");
			}
		}
		
		if(i - j == 0) {
			System.out.println("최대공약수 : " + i);
		}
		*/
		
		/*
		System.out.print("첫번째 수의 약수 : ");
		for(int i = 1 ; i <= no1; i++) {
			if(no1 % i == 0) {
				int a = no1 / i;
				System.out.print(i + "\t");
			}
		}
		
		System.out.println();
		
		System.out.print("두번째 수의 약수 : ");
		for(int j = 1 ; j <= no2; j++) {
			if(no2 % j == 0) {
				int b = no2 / j;
				System.out.print(j + "\t");
			}
		}
		*/
		// System.out.println("첫번째 수 : " + no1 + ", 두번째 수 : " + no2);
		// System.out.println("첫번째 수 : " + no1 );
		
	}

}
