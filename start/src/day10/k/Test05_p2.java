package day10.k;

public class Test05_p2 {

		public static void main(String[] args) {
			new Test05_p2();
			
			Test05_p2_1 t = new Test05_p2_1();
			Test05_p2_1 t1 = new Test05_p2_1(100);
		}
}

class Test05_p2_1{
	public Test05_p2_1() {}
	public Test05_p2_1(int no) {
		System.out.println(no);
	}
}