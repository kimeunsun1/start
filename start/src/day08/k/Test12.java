package day08.k;

/*
 	문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들고
 	'A' - 'J' 를 랜덤하게 100번 반복해서 만들고
 	배열에 카운트를 기억시켜서
 	결과를 출력하세요.
 */
public class Test12 {

	public static void main(String[] args) {
		// 배열 생성
		int [][] munja = new int[10][2];
		for(int i = 0; i < munja.length; i++) {
			munja[i][0] = 'A' + i;
		}
		// 'A' - 'J' 랜덤 100번 발생시켜 카운트
		for(int i = 0; i < 100; i++) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			int idx = ch - 'A';
			munja[idx][1] += 1;
		}
		// 결과 출력
		for(int i = 0; i < munja.length; i++) {
			int[] arr = munja[i];
			
			char ch = (char) arr[0];
			int count = arr[1];
			
			System.out.print(ch + " : ");
			for(int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
