package day07.k;

import java.util.Arrays;

/*
 	정수 10 랜덤하게 만들어서 기억하는 배열을 만들고
 	기억된 정수를 내림차순 정렬해서 다시 기억시키고
 	배열의 데이터를 출력하세요.
 */
public class Test08 {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int[] num = new int[10];
		// 정수 10개 랜덤 생성
		for(int i = 0; i < num.length; i++) {
			int no1 = (int) (Math.random() * (100 - 1 +1) + 1);
			for(int j = 0; j < num.length; j++) {
				int no2 = num[j];
				if(no1 == no2) {
					i--;
					continue;
				}
			}
			num[i] = no1;			
		}
		System.out.println(Arrays.toString(num));
		System.out.println();
		for(int i = 0; i < num.length -1 ; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[j] > num[i]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		// 내림차순 정렬
		
		// 출력
		for(int result : num) {
			System.out.print(result + " | ");
		}
	}

}
