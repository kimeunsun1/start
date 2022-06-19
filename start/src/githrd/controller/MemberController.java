package githrd.controller;

import java.util.*;

import githrd.dao.*;
import githrd.vo.*;

public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
		
		printMem();
		System.out.println();
		printMem1001();
		System.out.println();
		printTelChange();
	}
	
	public void printMem() {
		ArrayList<MemberVO> list = mDao.checkMem();
		for(MemberVO m : list) {
			
			System.out.printf("회원번호: %4d, 아이디: %6s\n", m.getMno(), m.getId());
		}
	}
	
	public void printMem1001() {
		MemberVO mvo = mDao.Mem1001();
		System.out.printf("회원번호: %4d| 회원이름: %4s | 아이디: %6s | 비밀번호: %15s | 메일: %20s | 전화번호:%13s | 아바타: %2d | 가입일: %8s \n",
									mvo.getMno(), mvo.getName(), mvo.getId(), mvo.getPw(), mvo.getMail(), mvo.getTel(), mvo.getAvt(), mvo.getJoinadate());
	}
	
	public void printTelChange() {
		int result = mDao.TEL_CHANGE();
		MemberVO mvo = mDao.Mem1001();
		System.out.println("1001번 회원의 전화번호를 변경 완료했습니다.");
		System.out.printf("회원번호: %4d| 회원이름: %4s | 아이디: %6s | 비밀번호: %15s | 메일: %20s | 전화번호:%13s | 아바타: %2d | 가입일: %8s \n",
				mvo.getMno(), mvo.getName(), mvo.getId(), mvo.getPw(), mvo.getMail(), mvo.getTel(), mvo.getAvt(), mvo.getJoinadate());
	}
	// 회원번호와 아이디를 조회해서 출력해주는 함수
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	// [] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	public static void main(String[] args) {
		new MemberController();
	}

}
