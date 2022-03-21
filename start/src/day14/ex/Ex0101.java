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
public class Ex0101 {
	private int r;
	private double area, arround;
	
	// 기본생성자
	public Ex0101() {}
	
	// 생성자
	public Ex0101(int r) {
		this.r = r;
		setArea();
		setArround();
	}
	
	// 면적 계산
	public void setArea() {
		area = r * r * Math.PI;
	}
	
	// 둘레 계산
	public void setArround() {
		arround = 2 * r * Math.PI;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	
	@Override
	public String toString() {
		return "원 - 반지름 : " + r + ", 면적 : " + area + ", 둘레 : " + arround;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Ex0101 nam = (Ex0101) o;
		int rr = nam.getR();
		bool = r == rr;
		return bool;
		
	}

}
