package day05.ex;

/*
	1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.
	
	힌트 ]
		처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/
public class Ex01_01 {

	public static void main(String[] args) {
		int a = 0;
		int i = 1;
		
		while(true) {
			
			a += i;
			i += 1;
			if(a > 5000) break;			
		}

		System.out.println("처음 5000이 넘어가는 합 : " + a);
		System.out.println("처음 5000이 넘어가는 정수 : " + (i-1));
	}

}
