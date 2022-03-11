package day05.k;

/*
	문제 15 ]
		구구단을 다음 형식으로 출력하세요.
		
		2 x 1 = 2		3 x 1 = 3		4 x 1 = 4 		5 x 1 = 5
		2 x 2 = 4		3 x 2 = 6		4 x 2 = 8 		5 x 2 = 10
		...
		2 x 9 = 18		3 x 9 = 27		4 x 9 = 36 		5 x 9 = 45
		
		6 x 1 = 6		7 x 1 = 7		8 x 1 = 8 		9 x 1 = 9
		6 x 2 = 12		7 x 2 = 14		8 x 2 = 16 		9 x 2 = 18
		...
		6 x 9 = 54		7 x 9 = 63		8 x 9 = 72 		9 x 9 = 81
		
		추가 문제 ]
		2단 3단 4단
		5단 6단 7단
		8단 9단
 */
public class Ex15 {

	public static void main(String[] args) {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k < 4; k++) {
					int dan = 2 + k + 4 * i;
					int gop = j + 1;
					System.out.print(dan + " x " + gop + " = " + (dan * gop) + "\t");
				}
					
				
				System.out.println();
			} 
			System.out.println();
		}
		System.out.println();
		System.out.println("==========================================================");
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k < 3; k++) {
					int dan2 = 2 + k + 3 * i;
					int gop2 = j + 1;
					System.out.print(dan2 + " x " + gop2 + " = " + (dan2 * gop2) + "\t");
					
					if(dan2 == 9) {
						break;
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
