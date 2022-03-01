package day05.ex;

/*
 	Ex02 ]
 		'A' 부터 문자를 10개를 만들어서 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		// 결과 변수 생성
		char x = 'A';
		// 반복해서 누적 대입
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print( (char) (x + i) + ", ");
		}
		// 결과 출력
	}

}
