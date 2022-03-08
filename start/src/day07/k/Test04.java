package day07.k;

import java.util.Arrays;

/*
 	5과목의 점수를 기억할 배열을 만들고
 	과목점수를 입력해서
 	총점과 평균을 구하고 출력하세요.
 	배열에 담긴 점수도 같이 출력하세요.
 */
public class Test04 {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int[] sub = new int[5];
		// 총점과 평균 계산
		for(int i = 0; i< sub.length; i++) {
			// 과목점수 랜덤 발생
			int sco = (int)(Math.random() * (100-0+1)+1);	// ******* for 문에 랜덤코드 포함	
			
			sub[i] = sco;
		}
		
		// 총점 계산
		int total = 0;
		for(int i = 0; i < sub.length; i++) {
			total += sub[i];
		}
		
		// 평균 계산
		double avg = 0;
		for(int i = 0; i < sub.length; i++) {
			avg = (double)total / (double)(sub.length);
		}
		
		// 출력(배열에 담긴 점수)
		System.out.println("각 과목 점수 : " + Arrays.toString(sub));
		System.out.println("총        점 : " + total);
		System.out.println("평        균 : " + avg);
		
		
	}

}
