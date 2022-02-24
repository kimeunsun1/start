package day03.ex;

// import com.sun.java_cup.internal.runtime.Scanner;

/*
 	84232원을 지불하려고 한다.
 	우리나라 화폐단위로 이 금액을 지불하려면
 	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
 	
 	화폐단위
 		50000원권
 		10000원권
 		5000원권
 		1000원권
 		500원
 		100원
 		50원
 		10원
 		1원
  */
// import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		
		int total = 84232;
		
		int tmp = total;
		
		// 5만원권
		int oman = tmp / 50000;
		//5만원권 제외한 금액 기억
		//tmp = tmp % 50000;
		tmp %= 50000; // tmp를 50000으로 나눈 나머지를 tmp에 대입하세요.
		
		// 1만원권
		int man = tmp / 10000;
		// 1만원권 제외한 금액 기억
		tmp = tmp % 10000;
		
		// 5000원권
		int ochun = tmp / 5000;
		tmp = tmp % 5000;
		
		// 1000원권
		int chun = tmp / 1000;
		tmp = tmp % 1000;
		
		// 500원권
		int obaek = tmp / 500;
		tmp = tmp % 500;
		
		// 100원권
		int baek = tmp / 100;
		tmp = tmp % 100;
		
		// 50원권
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		// 10원권
		int ship = tmp / 10;
		tmp = tmp % 10;
		
		//1원권
		int il = tmp % 10;
		
		//결과출력
		System.out.println("총금액 " + total + "원은");
		System.out.println("오만원권 : " + oman + "장");
		System.out.println("만원권 : " + man + "장");
		System.out.println("오천원권 : " + ochun + "장");
		System.out.println("천원권 : " + chun + "장");
		System.out.println("오백원권 : " + obaek + "장");
		System.out.println("백원권 : " + baek + "장");
		System.out.println("오십원권 : " + oship + "장");
		System.out.println("십원권 : " + ship + "장");
		System.out.println("일원권 : " + il + "장");
/*
		
		// Scanner mm = new Scanner(System.in);
		
		int m = 84232;
		
		System.out.println("금액 : " + m + "원");
		
		// int m = mm.nextInt();
		
		
		System.out.println("50000원 : " + m / 50000);
		System.out.println("10000원 : " + m % 50000 / 10000); // 위의 값의 나머지를 나눈 몫
		System.out.println("5000원 : " + ((m % 50000) % 10000) / 5000); // 위의 값의 나머지를 나눈 몫
		System.out.println("1000원 : " + (((m % 50000) % 10000) % 5000) / 1000); // 위의 값의 나머지를 나눈 몫
		System.out.println("500원 : " + ((((m % 50000) % 10000) % 5000) % 1000) / 500); // 위의 값의 나머지를 나눈 몫
		System.out.println("100원 : " + (((((m % 50000) % 10000) % 5000) % 1000) % 500) / 100); // 위의 값의 나머지를 나눈 몫
		System.out.println("50원 : " + ((((((m % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50); // 위의 값의 나머지를 나눈 몫
		System.out.println("10원 : " + (((((((m % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10); // 위의 값의 나머지를 나눈 몫
		System.out.println("1원 : " + ((((((((m % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) / 1); // 위의 값의 나머지를 나눈 몫
*/		
	}
}
