package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Localhost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();
			
			System.out.println(hostName);
//			System.out.println(inetAddress.getHostName());
			System.out.println(hostAddress);
			
			byte[] addresses = inetAddress.getAddress();
			for(byte address : addresses) {
//				System.out.print(address);//0100 0000 (64) 1100 0000(-64) 
				System.out.print(address & 0x000000ff); // 음수를 양수로 연산하기 위해서 사용.
				System.out.print(".");
				
			}
		} catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}