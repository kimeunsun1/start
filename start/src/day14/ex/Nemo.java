package day14.ex;

/*
	문제 2 ]
		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요.
		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
		equals() 함수를 오버라이드하세요.
		이 클래스 객체를 출력하면 내용이 출력되도록 toString() 를 오버라이드 하세요.
*/
public class Nemo {
	private int garo, sero;
	
	// 기본 생성자
	public Nemo() {}
	
	// 생성자
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
	}
	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	// 객체 내용 출력
	@Override
	public String toString() {
		return "사각형 - 가로 : " + garo + ", 세로: " + sero;
	}
	
	// equals()를 이용한 논리 판별
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo nam = (Nemo) o;
		int garo2 = nam.getGaro();
		int sero2 = nam.getSero();
		bool = (garo == garo2 && sero == sero2);
		return bool;
	}
}
