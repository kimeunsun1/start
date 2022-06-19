package day18.k;

import java.io.*;

public class Test01 {
	/*
	 	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
	 */
	public Test01() {
		// 타겟스트림(기본스크림)을 준비
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day18/k/result/휘파람.txt");
			String str = "\t\t\t휘파람\r\n\t\t\t\t\t블랙핑크";
			
			fw.write(str);
			System.out.println("*** 저장 성공 ***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
