package day18.k;

import java.io.*;

/*
 	result 폴더에 있는 blackpink.txt 파일을 읽어보자.
 */
public class Test02 {

	public Test02() {
		// 타겟(기본)스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/day18/k/result/blackpink.txt");
			
			// 한 글자만 읽어보자.
			int ch = fr.read();
			System.out.println("한글자 : " + (char) ch);
			
			System.out.println("=================================================");
			
			// 여러 글자를 읽어보자.
			char[] buff = new char[1024];
			int len = fr.read(buff);
			String str = new String(buff, 0, len);
			
			System.out.println(str);
			System.out.println("=================================================");
			
			// 3. 문서 전체를 읽어보자.
			char[] arr = new char[1024];
			while(true) {
				int len2 = fr.read(arr);
				if(len == -1) {
					break;
				}
				String str2 = new String(arr, 0, len2);
				System.out.println(str2);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
