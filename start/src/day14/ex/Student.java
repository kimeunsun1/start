package day14.ex;

/*
	문제 3 ]
		학생 한명의 성적을 관리하는 클래스 Student 를 작성하세요.
	기억할 내용은 
		반, 이름, 국어, 영어, 수학, 총점
	을 기억하도록 하고
	필요한 기능(함수)는 필요한만큼 추가해주세요.
	단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하세요.
	학생 변수를 출력하면 모든 내용이 출력되도록 함수를 오버라이드하세요.
*/
public class Student {
	private int ban, kor, eng, math, total;
	private String name;
	
	// 기본생성자
	public Student() {}
	
	// 생성자
	public Student(int ban, String name, int kor, int eng, int math) {
		this.ban = ban;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
	}
	
	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotal() {
		total = kor + eng + math;
	}
	
	// toString() 오버라이드 및 출력 문구
	@Override
	public String toString() {
		return "학생 " + name + " : " + ban + "반, " 
				+ " 국어 점수 : " + kor + "영어점수 : " + eng + " 수학점수 : " + math + ", 총점 : " + total;
	}
	// equals() 오버라이드 및 판별
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Student nam = (Student) o;
		int sameban = nam.getBan();
		String samename = nam.getName();
		bool = ban == sameban && name == samename;
		return bool;
	}
}
