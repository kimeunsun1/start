package day05.ex;

/*
 	Ex02 ]
 		'A' 부터 문자를 10개를 만들어서 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		// 영문자 10개 랜덤 발생
		for(int i = 0 ; i < 10 ; i++) {
			char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
			System.out.print(ch + " ");
		}		
		System.out.println();
		
		int i = 0;
		for(i = 0 ; i < 10 ; i++) {
			char ch = 'A';
			System.out.print( (char) (ch + i) + " ");
		}
		System.out.println();
		System.out.println("### i : " + i);
		
		for(i = 0 ; i < 10 ; i++) {
			System.out.print( (char) ('A' + i) + " ");
		}
		
		/* 내 코딩
		// 결과 변수 생성
		char x = 'A';
		// 반복해서 누적 대입
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print( (char) (x + i) + ", ");
		}
		// 결과 출력
		*/
	}

}
