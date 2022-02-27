package day04.ex;

/*
 	알파벳을 입력받아서
 	그 문자가 대문자인지 소문자인지 판별하는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex0201 {
	public static void main(String[] atgs) {
		// 알파벳을 입력받는다.
			Scanner sc = new Scanner(System.in);
			System.out.print("알파벳 : ");
		// 문자열로 저장해둔다.
			String str = sc.nextLine();
		// 문자를 추출한다.
			char ch = str.charAt(0);
		// 대소문자를 판별한다.
			String result = (ch < 'a') ? ("대문자") : ("소문자");
		// 출력한다.
			System.out.println("입력한 알파벳" + ch + "는 " + result + "입니다.");
	}
}