package day13;

import java.util.*;
public class Ex01 {
/*
 	String[] arr = {"123", "456", "789", ..};
 	가 있는 경우
 	이 배열이 기억하는 숫자형태의 문자열 정수로 바꾼 데이터들의
 	합과 평균을 구하는 프로그램을 작성하세요.
 	
 	단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
 		1. 배열의 범위를 벗어나서 사용하는 경우
 		2. 숫자로 변환이 불가능한 경우
 		3. 평균을 계산하는데 0으로 나누는 경우..
 */
	
	String[] arr = new String[20];
	int[] arr2 = new int[20];
	int sum = 0;
	public Ex01() {
		Arr();
		Plus();
		Average();
		
		try {
			
		} catch(IndexOutOfBoundsException e) {
			// 1. 배열의 범위를 벗어나서 사용하는 경우
			e.printStackTrace();
			System.out.println("배열의 범위를 벗어났습니다.. 프로그램을 종료합니다.");
			
		} catch(NumberFormatException e) {
			// 2. 숫자로 변환이 불가능한 경우
			e.printStackTrace();
			System.out.println("숫자로 변환이 불가능합니다. 프로그램을 종료합니다.");
			
		} catch(ArithmeticException e) {
			// 3. 평균을 계산하는데 0으로 나누는 경우..
			e.printStackTrace();
			System.out.println("0으로 나누었습니다. 프로그램을 종료합니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("문제가 발생했습니다. 프로그램을 종료합니다.");
		}
	}
	
	// 배열 생성
	public void Arr() {		
		String no = "";
		System.out.print("배열은 ");
		for(int i = 0; i < arr.length; i++) {
			int no1 = (3 * i + 1);
			int no2 = (3 * i + 2);
			int no3 = (3 * i + 3);
			no = String.valueOf(no1)+String.valueOf(no2)+String.valueOf(no3);
			arr[i] = no;
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	// 데이터 합
	public void Plus() {
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			sum = sum + arr2[i];
		}
		System.out.println("배열의 합 : " + sum);
	}
	
	// 데이터 평균
	public void Average() {
		int avg = sum / arr2.length; 
		System.out.println("배열의 평균 : " + avg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
