package echo;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
//import java.net.SocketException;

public class EchoServer {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6666;
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress(SERVER_IP, SERVER_PORT), 10);
			log("starts... [port:" + SERVER_PORT+"]");
			
			while(true) {
			Socket socket = serverSocket.accept();
			new EchoServerReceiveThread(socket).start();
			}
//			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
//			String remoteHostAddress = inetSocketAddress.getAddress().getHostAddress();
//			int remoteHostPort = inetSocketAddress.getPort();
//			log("connected by client " + remoteHostAddress + ":" + remoteHostPort);
//			
//			try {
//				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
//				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
//				while (true) {
//					
//					String data = br.readLine();
//					if (data == null) {
//						log("closed by client");
//						break;
//					}
//					
//					log("received:"+ data);
//				
//					pw.println(data);
//				}
//				
//			} catch (SocketException ex) {
//				System.out.println("[server] suddenly closed by client");
//			} catch (IOException ex) {
//				System.out.println("[server] error: " + ex);
//			} finally {
//				try {
//					if (socket != null && !socket.isClosed()) {
//						socket.close();
//					}
//				} catch (IOException ex) {
//
//				}
//			}
		} catch (IOException e) {
			System.out.println("[server] error : " + e);
		} finally {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	static void log(String log) {
		System.out.println("[EchoServer] " + log);
	}
}
