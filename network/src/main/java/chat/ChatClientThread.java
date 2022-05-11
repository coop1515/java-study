package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ChatClientThread extends Thread {
	private BufferedReader bufferedReader;
	
	public ChatClientThread(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String data = bufferedReader.readLine();
				if (data == null) {
					log("closed by server");
					break;
				}
				System.out.println(data);
			}
		}catch (IOException e) {
			System.out.println("종료되었습니다.");
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException ex) {

			}
		}

	}

	private void log(String string) {
		System.out.println(string);

	}
}
