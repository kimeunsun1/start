package day07.k;

/*
 	5개의 메모리를 배열로 만들고 
 	그안에 랜덤한 숫자(정수)를 입력한 후 출력하세요.
 	1 ~ 45
 */
// import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int[] num = new int[6];
		// 랜덤 수(1 ~ 45) 생성
		loop:
		for(int i = 0; i < num.length; i++) {
			int no = (int) (Math.random() * (45 - 1 + 1) + 1);
			for(int j = 0; j < i; j++) {
				int tmp = num[j];
				
				if(tmp == no) {
					i--;
					continue loop;
				}
			}
			num[i] = no;
		}
		// 출력
		for(int i = 0; i < num.length; i ++) {
			System.out.print(num[i] + " ");
		}
	
	}

}
