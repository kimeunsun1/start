package day05;

public class Test11 {

	public static void main(String[] args) {
		// 구구단 5단을 출력하는데 곱이 5인 경우는 제외하고 출력하세요.
		
		int dan = 5;
		
		for(int i = 0 ; i < 9 ; i++) {
			int gop = (i + 1);
			if(gop == 5) {
				continue; // continue 명령문을 만나는 순간 증감식으로 보내 다음 회차로 진행된다.
			}
			System.out.println(dan + " x " + gop + " = " + (dan * gop));
		}
	}

}
