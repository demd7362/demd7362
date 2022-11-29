package ch19.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	private static ServerSocket serverSocket;

	public static void startServer() {
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(57362);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("[서버] 연결 요청을 기다림");
						Socket socket = serverSocket.accept();
						
						
					}
				} 
			}
			
		};
	}
	public static void main(String[] args) throws IOException {
		System.out.println("------------------------------------");
		System.out.println("press any key to end");
		System.out.println("------------------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			if (br.readLine() != null) {
				System.out.println("종료");
				break;
			}
		}
		br.close();
	}

}
