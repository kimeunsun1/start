package day13;

/*
 	blackpink.txt 파일을 읽어서 출력해보자.
 */

import java.io.*; // io는 input, output 과 같은 입출력과 관련

public class Test11 {

	public Test11() {
		FileInputStream fis = null; // 파일을 연결하는 연결호스와 같은 역할을 하는 FileInputStream
									// 일단 비운 상태로 변수만 생성해놓는다.
		
		try {
			fis = new FileInputStream("src/day13/blackpink.txt");
			
			byte[] buff = new byte[1024];
			int len = fis.read(buff);
			String str = new String (buff, 0, len);
			System.out.println(str);
		} catch(Exception e) {
			System.out.println("### 예외 발생 ###");
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
