package day14.k;

/*
 	
 	문자열 데이터
 	
 		"제니, 리사, 로제, 지수"
 	를, 를 기준으로 분리해서 출력해보자.
 */

import java.util.*;

public class Test05 {

	public Test05() {
		String member = "제나,리사,로제,지수";
		
		StringTokenizer token = new StringTokenizer(member, ",");
		
		int len = token.countTokens();
		
		String[] pink = new String[len];
		
		int idx = 0;
		
		while(token.hasMoreTokens()) {
			String black = token.nextToken();
			
			pink[idx] = black;
			
			idx++;
			
			System.out.println(black);
		}
		System.out.println("----------------------");
		
		for(String name : pink) {
			System.out.print(name + "|");
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
