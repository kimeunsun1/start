package interfaceProj.controller;

import java.util.*;

import interfaceProj.dao.*;
import interfaceProj.vo.*;

public class MemberInfo {
	private MemberDao mDao;
	
	public MemberInfo() {
		mDao = new MemberDao();
		
		// 회원번호 입력		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원번호 입력 : ");
		int no = sc.nextInt();
		System.out.println();
			
		// 입력된 회원번호에 해당하는 회원들의 정보 조회
		memberInfoPrint(no);
	}
	// 입력된 회원번호에 해당하는 정보를 출력해주는 함수
	public void memberInfoPrint(int no) {
		
		MemberVO mvo = mDao.getMemberInfo(no);
		
			System.out.println("회원 정보 조회");
			System.out.println("=================================");
			
				System.out.printf("회원번호 : %4d\n회원이름 : %-20s\n회원 ID  : %-15s\n회원메일 : %-50s\n", 
						mvo.getMno(), mvo.getName(), mvo.getId(), mvo.getMail());
			
			System.out.println("=================================");
	}
	
	public static void main(String[] args) {
		new MemberInfo();
	}
}
