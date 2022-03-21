package day14.k;

import java.util.*;

/*
 	Test05 를 확인한 후 이 클래스를 확인하세요.
 	
--------------------------------------------------------------------------------------
 	Test03에서 만든 문자열을 줄바꿈 기호를 기준으로 분리해서
 	배열에 담아보자.
 	
 	참고 ]
 		배열을 만들때 필요한 것
 			1. 타입
 			2. 갯수
 */
public class Test04 {

	public Test04() {
		StringBuffer buff = new StringBuffer();
		
		buff.append("Hey boy\n");
		buff.append("Make 'em whistle like a missile, bomb, bomb\n");
		buff.append("Every time I show up, blow up, uh\n");
		buff.append("Make 'em whistle like a missile, bomb, bomb\n");
		buff.append("Every time I show up, blow up, uh\n");	
		
		String song = buff.toString();
		
		StringTokenizer token = new StringTokenizer(song, "\n");
		
		int len = token.countTokens();
		
		String[] norea = new String[len];
		
		for(int i = 0; token.hasMoreTokens();i++) {
			String tmp = token.nextToken();
			norea[i] = tmp;
		}
		
		for(String s : norea) {
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
