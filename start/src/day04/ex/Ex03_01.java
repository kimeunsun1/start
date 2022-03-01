package day04.ex;

/*
 	문제 3 ]
 		게시물을 게시판에 출력하는데
 		하나의 페이지에 게시물을 15개를 출력할 예정이다.
 		게시물 수를 랜덤하게 발생시켜서
 		게시판의 페이지가 몇페이지가 필요한지를 계산해서
 		출력해주는 프로그램을 작성하세요.
 		
 		참고 ]
 			게시물이 없는 경우는 게시물이 없는 페이지가
 			적어도 1페이지는 필요하다.
 */
public class Ex03_01 {
	public static void main(String[] args) {
		// 게시물 랜덤 발생
		int post = (int) (Math.random() * (9999 + 1));
		int page = 1;
		// 페이지 수 판별
		if(post < 15 ) {
			System.out.print("게시물이 " + post + " 개이므로 " + page + " 의 페이지가 필요합니다.");
		} else {			
			System.out.print("게시물이 " + post + " 개이므로 " + ((post / 15) +page) + " 의 페이지가 필요합니다.");
		}
		// 결과 출력
	}
}
