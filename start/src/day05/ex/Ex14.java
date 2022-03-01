package day05.ex;

/*
	문제 14 ]
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
		
		1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
		3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
 */
public class Ex14 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		if(a > 1 && a <= 9) {
			if(b > 1 && b <= 9) {
				if(c > 1 && c <= 9) {
					if(d > 1 && d <= 9) {
						if ( a - b != 0 && a - c != 0 && a - d != 0) {
							if ( b - c != 0 && b - d != 0) {
								if ( c - d != 0) {
									if(a == d + 2) {
										if(b > c) {
											if((a*1000)+(b*100)+(c*10)+d+(d*1000)+(c*100)+(b*10)+a==16456) {
												System.out.println("답은 " + (a*1000)+(b*100)+(c*10)+d);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
