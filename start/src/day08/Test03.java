package day08;

/*
 	얕은 복사의 특징
 		Heap 영역에 있는 데이터는 프로그램이 종료할 때까지 살아남는다.
 */
import java.util.*;
public class Test03 {
	int[] no;
	
	public void setNo() {
		no = new int[5];
		for(int i = 0; i < no.length; i++) {
			no[i] = (int)(Math.random() * 99 + 1);
		}
	}
	public static void main(String[] args) {
		int[] a;	// 배열의 주소를 기억할 변수
		
		{
			int[] b;
			// b 변수는 블럭안에서 만들어진 변수이므로 블럭을 벗어나면 사라지는 변수이다.
			b = new int[5]; // heap에는 기록이 남아있을 것이나 따로 데이터를 저장해두지 않으면 사용할 수 없다.
			// new 라는 명령으로 heap에 배열을 만들고
			// 변수에 기억시켰지만 이 영역이 닫히는 순간
			// 이 변수는 사라지게 되므로 더이상 이 배열을 사용할 수 없게 된다.
			
			b[2] = 500;
			
			// 얕은 목사를 한다.
			System.out.println("b[2] : " + b[2]);
			a = b;
			
			a[2] = 1000;
			System.out.println("b[2] : " + b[2]);
		}
		System.out.println(Arrays.toString(a));
	}

}
