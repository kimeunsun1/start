package day12;

public class Test01 {
	public Test01() {
		Father f1 = new Son();
		
//		Son s1 = new Father();
		
		Father f2 = new Father();
//		Son s1 = (Son) f2;		// Father()에는 하위클래스인 Son에 있는 멤버가 없을수도 있기때문에 실행시 오류가 난다.
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