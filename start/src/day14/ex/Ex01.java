package day14.ex;

/*
	문제 1 ]
		원의 정보를 기억할 클래스를 제작하세요.
		가지는 정보는
			반지름, 면적, 둘레
		를 가지고
		기능은 변수에 접근할 수 있는 함수들..
		그리고 반지름이 같으면 같은 원으로 처리해주는 기능의
			equals()
		함수로 오버라이드 하고,
		이 클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 ㅎ마수도 오버라이드 하세요.
 */
public class Ex01 {
	
	public Ex01() {
		Ex0101 n1 = new Ex0101(10);
		Ex0101 n2 = new Ex0101(10);
		
		String result = (n1.equals(n2) ? "같은" : "다른");
		
		System.out.println("n1 과 n2 원은 " + result + " 원입니다.");
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
