package ping2;

import java.io.*;
import java.net.*;

public class PingThread extends Thread {
	private boolean isStart = true;
	private ServerSocket server;
	private Socket socket;
	private InputStream in;
	private OutputStream out;
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public ServerSocket getServer() {
		return server;
	}
	public void setServer(ServerSocket server) {
		this.server = server;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	public InputStream getIn() {
		return in;
	}
	public void setIn(InputStream in) {
		this.in = in;
	}
	public OutputStream getOut() {
		return out;
	}
	public void setOut(OutputStream out) {
		this.out = out;
	}
	
// 1-1. 실행 메서드 오버라이드	
	public void run() {
		// 1-2. 소켓 구성
		try {
			server = new ServerSocket(7777);
			System.out.println("----- 서버 시작 -----");
			doResponse();
		} catch(SocketException e) {
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("----- 서버 정지 -----");
			Close();
		}
	}

// 1-3. 클라이언트와 통신
	public void doResponse() throws SocketException, Exception {
		// 1-3.a. 요청마다 소켓 생성 
		while(isStart) {
			socket = server.accept();
		
		// 1-3.b. 클라이언트 주소 출력
			String ip = socket.toString();
			System.out.println();
			System.out.println(ip + " - 연결 중!");
		
		// 1-3.c. 클라이언트의 메시지 출력	
			in = socket.getInputStream();
			out = socket.getOutputStream();
			
			byte[] buff = new byte[10240];
			int len = in.read(buff);
			String msg = new String(buff, 0, len);
			System.out.println(ip + " : " + msg);
		// 1-3.d. 메세지 재응답	
			buff = new String("re ] " + msg).getBytes();
		}
	}
	
// 1-4. 자원 반환	
	public void Close() {
		Close();
	}
}
