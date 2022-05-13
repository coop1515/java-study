package chat.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientApp {

	private static final String SERVER_IP = "192.168.10.15";
	private static final int SERVER_PORT = 9999;
		static	String name = null;
		static	Scanner scanner = new Scanner(System.in);
		static	Socket socket = null;
			
	public static void main(String[] args) {
		try {
			
			while (true) {

				System.out.println("대화명을 입력하세요.");
				System.out.print(">>> ");
				name = scanner.nextLine();

				if (name.isEmpty() == false) {
					break;
				}

				System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
			}

			scanner.close();
			// 1. create socket
			socket = new Socket();
			// 2. connect server
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

			log("connected");
			// 3. get iostream(pipline established)
//			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			// 4. join protocol 처리
			printWriter.println("join:"+name);
//			String line = bufferedReader.readLine();
			String a = "join:ok";
			if ("join:ok".equals(a)) {
				new ChatWindow(name, socket).show();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private static void log(String string) {
		System.out.println(string);

	}
}
