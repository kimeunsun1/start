package day09;

public class Test06 {
	int num; // 전역변수를 사용하면 setNum()에서 반환값을 따로 만들 필요없다.
	
	public Test06() {
		setNum();
	}
	
	public static void main(String[] args) {
		new Test06();
		
//		Test06 t6 = new Test06();
//		t6.num = 100;
	}
	
//	public int setNum() {
	public void setNum() {
		int no = (int)(Math.random()*10 + 1);
		num = no;
		
//		return no;
	}
}
