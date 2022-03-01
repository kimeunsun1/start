package day05.ex;

/*
	문제 16 ]
		구구단을 다음 형식으로 출력하세요.
		
		2 x 1 = 2		4 x 1 = 4		6 x 1 = 6 		8 x 1 = 8
		2 x 2 = 4		4 x 2 = 8		6 x 2 = 12 		8 x 2 = 16
		...
		2 x 9 = 18		4 x 9 = 36		6 x 9 = 54 		8 x 9 = 72
		
		3 x 1 = 3		5 x 1 = 5		7 x 1 = 7		9 x 1 = 9
		3 x 2 = 6		5 x 2 = 10		7 x 2 = 14 		9 x 2 = 18
		...
		3 x 9 = 27		5 x 9 = 45		7 x 9 = 63 		9 x 9 = 81
		
	
*/
public class Ex16 {

	public static void main(String[] args) {
		for(int j = 0; j < 9 ; j++) {
			for(int i = 2 ; i < 9 ; i++) {
				
				if(i % 2 == 0) {
					System.out.print(i + " x " + (j + 1) + " = " + (i * (j + 1)) + "\t");
				} 
				/*
				else if(i % 2 != 0){
					
					System.out.println();
					System.out.print(i + " x " + (j + 1) + " = " + (i * (j + 1)) + "\t");
					
				}
				*/
				//System.out.println();
			}
			
			System.out.println();
		}
		System.out.println();
		
		for(int j = 0; j < 9 ; j++) {
			for(int i = 2 ; i < 10 ; i++) {
				
				if(i % 2 != 0) {
					System.out.print(i + " x " + (j + 1) + " = " + (i * (j + 1)) + "\t");
				} 
				/*
				else if(i % 2 != 0){
					
					System.out.println();
					System.out.print(i + " x " + (j + 1) + " = " + (i * (j + 1)) + "\t");
					
				}
				*/
				//System.out.println();
			}
			
			System.out.println();
		}
	}

}
