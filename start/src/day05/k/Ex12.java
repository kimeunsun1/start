package day05.k;

/*
	문제 12 ]
		5자리 숫자 하나를 입력받아서 
		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
		
		참고 ]
			회문수란?
				첫번째 자리수와 마지막 자리수
				두번째 자리수와 마지막에서 두번째 자리수
				...
				가 동일한 수를 말한다.
				
			abcde
			이 숫자가 회문수가 되려면
			a == e
			b == d	
 */
import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		// 5자리 숫자 입력
		Scanner sc = new Scanner(System.in);
		// 입력메세지
		System.out.print("5자리 수 입력 : ");
		// 데이터 저장
		int no = sc.nextInt();
		// 회문수 판별
		int a = no / 10000;
		int b = (no % 10000) / 1000;
		int c = (no % 1000) / 100;
		int d = (no % 100) / 10 ;
		int e = (no % 10) ;
		
		for(int i = 0; i < 5; i++) {
			if(a == e && b == d) {
				System.out.print("입력된 숫자 " + no + " 는 회문수입니다.");
				break;
			}else {
				System.out.print("입력된 숫자 " + no + " 는 회문수가 아닙니다.");
				break;
			}
		}
		// 출력
	}

}
