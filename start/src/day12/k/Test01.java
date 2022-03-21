package day12.k;

public class Test01 {
	public Test01() {
		Father f1 = new Son();
		Father f2 = new Father();
		
		f1.abc();
		f2.abc();
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

class Father{
	void abc() {
		System.out.println("################ father ################");
	}
}

class Son extends Father {
	void abc() {
		System.out.println("***************** Son ******************");
	}
}