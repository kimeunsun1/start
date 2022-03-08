package day09.ex;

/*
 	문제 3 ]
 		사각형을 넓이를 계산하는 프로그램을 작성하세요.
 		
 		길이를 랜덤하게 만들어주는 함수
 		넓이를 계산해주는 함수
 		사각형의 내용을 출력해주는 함수
 		
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산함수, 둘레 계산함수, 출력을 해주는 함수
 		를 각각 만들어서 작성하세요.
 */
public class Ex03 {
	int garo ;
	public Ex03() {
		setGaro();
		System.out.println(garo);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	public void setGaro() {
		garo = (int)(Math.random() * 45 + 1);
	}
}
