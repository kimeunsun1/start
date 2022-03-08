package day07.k;

import java.util.Arrays;

/*
 	1 ~ 10 까지의 정수를 순서대로 배열에 기억시키고
 	이 숫자를 랜덤하게 섞어서 출력되도록 하세요.
 	
 	방법 ]
 		배열의 특정위치 2개를 꺼내서 데이터를 바꾼다.
 		이 과정을 많이 하면 할수록 데이터가 섞이게 된다.
 */
public class Test06 {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int[] num = new int[10];
		// 1 ~ 10까지 정수 저장
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		// 위치 랜덤
		for(int i = 0; i < 100; i++) {
			int ran1 = (int) (Math.random() * (9 - 1 + 1) + 1);
			int ran2 = (int) (Math.random() * (9 - 1 + 1) + 1);
			
			if(ran1 == ran2) {
				i--;
				continue;
			}
			int t = num[ran1];
			num[ran1] = num[ran2];
			num[ran2] = t;
		}
		// 출력
		for(int no : num) {
			System.out.print(no + " ");
		}
	}

}
