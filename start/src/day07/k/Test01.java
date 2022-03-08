package day07.k;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		/*
		 	정수 6개를 관리할 배열 arr 을 만들고
		 	1 ~ 6까지 채워서
		 	한개씩 꺼내서 출력하세요.
		 */
		
		// 배열변수 선언
		/*
		 	배열변수의 선언 형식
		 		데이터타입 []	변수;
		 */
		
		
		// 배열 생성 및 초기화
		int[] no1 = new int[6];
		// 1 ~ 6까지의 정수 배열
		no1[0] = 1;
		no1[1] = 2;
		no1[2] = 3;
		no1[3] = 4;
		no1[4] = 5;
		no1[5] = 6;
		// 하나씩 꺼내서 출력
		for(int i = 0; i < no1.length; i++) {
			System.out.println(no1[i]);
		}
		
		System.out.println();
		/*
	 	정수 6개를 관리할 배열 arr 을 만들고
	 	랜덤 수를 채워서
	 	한개씩 꺼내서 출력하세요.
		 */
						
		// 배열 생성 및 초기화
		int[] no = new int[6];
		
		// 배열 길이 구하기
		int len = no.length;
		// 랜덤 숫자 배열 채우기
		for(int i = 0; i < len; i++) {
			int num = (int)(Math.random() * 7);
			no[i] = num;
			
		}
		// 하나씩 출력
		for(int i = 0; i < len; i++) {
		System.out.println(no[i]);
		}
		
		
		// 블랙핑크 멤버의 이름을 기억할 배열을 만들어서 출력하세요.
		// 블랙핑크는 4명으로 구성되어 있습니다.
		// 제니, 리사, 로제, 지수
		
		// 배열 생성 및 초기화
		String[] sing = new String[4];
				
		// 배열 4명 구성
		sing[0] = "제니";
		sing[1] = "리사";
		sing[2] = "로제";
		sing[3] = "지수";
		
		// 내용확인
		System.out.println(Arrays.toString(sing));
		
		// 하나씩 출력
		
		for(int i = 0; i < sing.length; i++) {
			System.out.println(sing[i]);
		}
		
		
		// 둘리 멤버를 추가해서 출력하세요.
		/*
		 	참고 ]
		 		배열은 한번 만들어지면 크기와 타입을 수정할 수 없다.
		 		따라서 데이터의 갯수가 수정이 필요하면
		 		배열을 다시 만들어서 변수에 기억시켜야 한다.
		 */
		
		// 배열 새로 생성 및 초기화
		String[] mem = new String[5];
		// 가수 배열 끌어오기
		for(int i = 0; i < 4; i++) {
		mem[i] = sing[i];
		}
		// 둘리 추가
		mem[4] = "둘리"; 
		
		sing = mem;
		// 중간확인
		System.out.println(Arrays.toString(mem));
		// 하나씩 순차적으로 출력
		for(int i = 0; i <mem.length; i++) {
			System.out.println(mem[i]);
		}	
		
		System.out.println();
		
		for(String name: mem) {
			System.out.print(name + " ");
		}
		
	}

}
