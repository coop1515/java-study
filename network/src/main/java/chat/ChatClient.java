package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "192.168.10.15";
	private static final int SERVER_PORT = 9999;

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			socket = new Socket();
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			log("connected");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);


				System.out.print("닉네임>>");
				String nickname = scanner.nextLine();
				printWriter.println("join:" + nickname);

			new ChatClientThread(bufferedReader).start();

			while (true) {
				System.out.print(">> ");
				String input = scanner.nextLine();
				printWriter.println(input);
				if ("quit".equals(input)) {
					break;
				} else {
					// 메세지 처리

				}
			}
		} catch (IOException ex) {
			log("error: " + ex);
		} finally {
			try {
				if (scanner != null) {
					scanner.close();
				}
				if (socket != null && !socket.isClosed()) {

					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void log(String string) {
		System.out.println(string);
	}

}
