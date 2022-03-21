package day09.ex;

/*
 	문제 2 ]
 		반지름 하나를 랜덤하게 입력한 후
 		원의 넓이
 		원의 둘레
 		를 계산해서 
 		출력하는 프로그램을 작성하세요.
 		
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산함수, 둘레 계산함수, 출력을 해주는 함수
 		를 각각 만들어서 작성하세요.
 		
 */
public class Ex02 {
	public Ex02() {
		int r = Rndno();
		double area = Area(r);
		double arround = Arround(r);
		toPrint(r, area, arround);
	}
	public static void main(String[] args) {
		new Ex02();
	}
	
	// 반지름 랜덤
	public int Rndno() {
		int r = (int)(Math.random()*10 + 1);
		return r;
	}
	// 넓이 계산
	public double Area(int r) {
		double area = 2 * r * Math.PI;
		return area;
	}
	
	// 둘레 계산
	public double Arround(int r) {
		double arround = r * r * Math.PI;
		return arround;
	}
	// 출력
	public void toPrint(int r, double area, double arround) {
		System.out.printf("반지름은 %3d 이고 넓이는 %6.2f 이고 둘레는 %6.2f 입니다.", r, area, arround);
	}

}
