package day05.ex;

/*
	문제 11 ]
		2x + 4y = 10 의 방정식의 결과를 출력하세요.
		단, x, y는 모두 
			0 <= x, y <= 10
		사이의 숫자이다.
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		int x = 1;
		int y = 2;
		System.out.println(2 * x + 4 * y);
		*/
		
		for(int x = 0 ; x <= 10 ; x++) {
			int x1 = x + 1;
			for(int y = 0 ; y <= 10 ; y++) {
				int y1 = y + 1;
				if((2 * x1) + (4 *y1) == 10) {
					System.out.println("x = " + x1 + ", y = " + y1);
				}
			}
		}
		
		
		/*
		int x = 0;
		int y = 0;
		int h1 = 0;
		int h2 = 0;
		if(0 <= x && y <= 10) {	
			h1 = 2 * x + 4 * y;
			h2 = 10;
			if(h1 == h2) {
				System.out.println("x값은 " + x + " y값은 " + y);
			}
		}
		*/
	}

}
