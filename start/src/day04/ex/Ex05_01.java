package day04.ex;

/*
 	3자리 숫자(100 ~ 999)를 입력받아서
 	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 	
 	예 ]
 		241		은 200 에 가까우므로 41을 빼야 한다.
 		777		은 800 에 가까우므로 23을 더해줘야 한다. 
 */

//import java.util.*;

//import javax.swing.JOptionPane;

import javax.swing.*;

public class Ex05_01 {
	public static void main(String[] args) {
		// 3자리 숫자를 입력
		String sno = JOptionPane.showInputDialog("세자리 수 입력 : ");
		// 100의 배수 계산 판별
		int no = Integer.parseInt(sno);
		// 결과출력
		int result = no / 100 * 100;
		if(no % 100 > 50) {
			System.out.println(no + " 에 가까운 100의 배수는 " + (result + 100) + " 입니다.");
		} else {
			System.out.println(no + " 에 가까운 100의 배수는 " + (result) + " 입니다.");			
		}
	}
}
