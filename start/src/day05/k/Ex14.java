package day05.k;

/*
	문제 14 ]
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
		
		1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
			a:	3 <=
				9 >=
				
			d : 1 <=
				7 >=
		3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
			b > c	==> c + 1 부터 시작
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
		
			a	b	c	d
		+	d	c	b	a
		==> 16456
 */
public class Ex14 {

	public static void main(String[] args) {
		/*
		 	a >= d + 2
		 	b > c
		 	
		 	abcd + dcba = 16456
		 */
		
		int a, b, c, d;
		

		for(a = 3; a <= 9; a++) {
			d = a - 2;
			for(b = 2; b <= 9; b++) {
				
				if(b == a || b == d) {
					continue;
				}
				for(c = 1; c < b; c++) {
					if(c == a || c == d) {
						continue;
					}
					if((a*1000+b*100+c*10+d) + (d*1000+c*100+b*10+a) == 16456) {
						System.out.println(a*1000+b*100+c*10+d);
					}
					
				}
			}
		}
	}

}
