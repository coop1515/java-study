package chat.gui;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatWindow {

	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;
	BufferedReader bufferedReader;
	PrintWriter printWriter;
	String name;
	Socket socket;
	
	public ChatWindow(String name, Socket socket) {
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
		this.socket = socket;
		this.name = name;
	}

	public void show() {
		/*
		 * 1. UI 초기화
		 * 
		 */
		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
//		buttonSend.addActionListener( new ActionListener() {
//			@Override
//			public void actionPerformed( ActionEvent actionEvent ) {
////				sendMessage();
//				System.out.println("clicked!!");
//			}
//		});
		buttonSend.addActionListener(( ActionEvent actionEvent ) ->
								{
//									System.out.println("clicked!!");
			sendMessage();
		}
		);
		
		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if(keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
			
		});
		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				finish();
			}
		});
		frame.setVisible(true);
		frame.pack();
		/*
		 * 2. IOStream (Pipeline established)
		 *
		 */
		
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			new ChatClientThread(bufferedReader).start();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	private void sendMessage() {
		String message = textField.getText();
//		if ("quit".equals(message)) {
//			finish();
//		}
		printWriter.println("message:"+ message);
		textField.setText("");
		textField.requestFocus();
		
		// Chat Client Thread에서 서버로 부터 받은 메시지가 있다고 치고 (가짜데이터 mocdata)
//		updateTextArea(name+ ":" + message); // 데이터 보내는 메소드		
	}
	
	private void updateTextArea(String message) {
			textArea.append(message);
			textArea.append("\n");
		}
	private void finish() {
//		System.out.println("소켓 닫기 or 방나가기 프로토콜 구현");
		printWriter.println("quit");
		System.exit(0); // 0은 정상종료 이외 반환하면 에러남	
		}
	/*
	 * @author kickscar
	 * Receive Thread from Chat Server
	 */
	private class ChatClientThread extends Thread{
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
					updateTextArea(data);
				}
			}catch (IOException e) {
				e.printStackTrace();
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
		
	
}
