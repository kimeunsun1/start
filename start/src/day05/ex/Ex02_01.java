package day05.ex;

/*
	Ex02_01 ]
		3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
		그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
		단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
 */

public class Ex02_01 {

	public static void main(String[] args) {
		// 3 ~ 10 사이의 정수를 랜덤 발생
		int r = (int) (Math.random() * (10 - 3 + 1) + 3);
		// 랜덤 수 길이 지정
		String l = "";

		// 시작문자 대문자 나머지 소문자
		
		// 결과 출력
		System.out.println(r);
	}

}
