package day04.ex;

/*
 	알파벳을 입력받아서
 	그 문자가 대문자인지 소문자인지 판별하는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex02_02 {
	public static void main(String[] atgs) {
		
			// 알파벳 입력
			Scanner sc = new Scanner(System.in);
			// 입력 메시지
			System.out.print("알파벳 입력 : ");
			// 데이터를 변수에 저장
			String result = sc.nextLine();
			// 대소문자 판별
			char ch = result.charAt(0);
			
			if(ch <= 'Z') {
				System.out.print("입력된 문자 [ " + ch + " ] 는 대문자 입니다.");
			} else if(ch >= 'a') {
				System.out.print("입력된 문자 [ " + ch + " ] 는 소문자 입니다.");
				
			}
			// 결과 출력
	}
}