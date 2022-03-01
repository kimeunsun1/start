package day05.ex;

/*
	문제 10 ]
		주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
 */
public class Ex10 {

	public static void main(String[] args) {
		// 주사위 2개의 합이 6이 되는 경우 계산

			for(int i = 0; i < 6 ; i++) {
				int g1 = i + 1;
				
				for(int j = 0; j < 6 ; j++) {
					int g2 = j + 1;
					if(g1 + g2 == 6) {
						int g = g1 + g2;
						System.out.println("주사위1은 " + g1 + ", 주사위2는 " + g2 + " 일 때 합이 6입니다.");
					}
				}
			}

		// 결과 출력
		
		/*
		switch(g1) {
		case 1:
			if(g2 == 1) {
				
			} else if(g2 == 2) {
			}
			
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			
		}
		*/
	}

}
