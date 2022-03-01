package day05;

/*
 	do - while 문은 조건이 맞지 않아도 한번은 실행한다.
 */
public class Test10 {

	public static void main(String[] args) {
		int no = 10;
		
		do {
			System.out.println("no : " + no);
			// ++no;
		} while(++no < 10);
	}

}
