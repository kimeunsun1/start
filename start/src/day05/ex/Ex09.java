package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */
public class Ex09 {

	public static void main(String[] args) {
		// 변수
		int a = 0;
		int b = 0;
		// 계산
		for(int i = 0 ; ; i++){
			if(a - b > 100) {
				if(i % 2 != 0) {
					a = a + i;
					System.out.println("홀수 : " + a);
				} else if(i % 2 == 0) {
					b = b + i;
					System.out.println("짝수 : " + b);
				}
				System.out.println("합 : " + (a - b));
				break;
			}
		}	
		
	}

}
