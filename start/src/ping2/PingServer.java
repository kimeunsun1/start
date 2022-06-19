package ping2;

import java.util.*;

public class PingServer {
	private boolean bool = true;
	private PingThread ping;
	private Scanner sc;
	public PingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("----- 핑서버프로그램 -----");
			System.out.println("서버시작 : start");
			System.out.println("서버중단 : quit");
			System.out.print("명령 입력:");
			System.out.println();
			String str = sc.nextLine();
// 2-1. start, quit			
			switch(str) {
			case "start":
				if(bool) {
					ping.start();
					bool = false;
					
					break;
				}
			// 2-2. 서버 실행중 안내
				System.out.println();
				System.out.println("----- 서버 이미 실행중! -----");
				break;
			case "quit":
				ping.setStart(false);
				try {
					ping.Close();
				} catch (Exception e) {}
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}
