package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			while (true) {
				System.out.print(">");
				String line = scanner.nextLine();
				
				if (line.equals("exit")) {
					return;
				}
				InetAddress[] inetAddress = InetAddress.getAllByName(line);
				for (int i = 0; i < inetAddress.length; i++) {
					System.out.println(line + " : " + inetAddress[i].getHostAddress());
				}
			}
		} catch (UnknownHostException e) {
			System.out.println("잘못된 도메인 입니다.");
		}

	}

}