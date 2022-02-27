package day04.ex;

/*
 	3자리 숫자(100 ~ 999)를 입력받아서
 	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 	
 	예 ]
 		241		은 200 에 가까우므로 41을 빼야 한다.
 		777		은 800 에 가까우므로 23을 더해줘야 한다. 
 */

import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		// 3자리 숫자를 입력받는다.
			Scanner sc = new Scanner(System.in);
			System.out.print("100~999까지의 숫자를 입력 : ");
		// 데이터를 저장한다.
			int num = sc.nextInt();
		// 가까운 100의 배수를 계산한다.
			int result = (num >= 100 && num <=999) ? (
						((num % 100) >= 51) ? (num - (num % 100) +100) : (num - (num % 100))) 
						: (0);
		//출력한다.
			System.out.println("입력된 숫자 "+ num +"에 가까운 100의 배수는 " + result + "입니다.");
	}
}
