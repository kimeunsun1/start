package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
		
		힌트 ]
		
		1 + (-2) + 3 + (-4) +....
		
		no * -1
 */
public class Ex09 {

	public static void main(String[] args) {
		int no = -1;
		int sum = 0; // 합을 누적할 변수
		int i = 0;
		for (i = 1; ; i++) {
			no = no* -1;
			
			sum = sum + i * no;
			if(sum > 100) {
				break;
			}
		}
		System.out.println("1부터 " + (i * no) + " 까지의 합이 " + sum + " 으로 처음 100을 넘기게 된다.");
		/*
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
		*/
	}

}
