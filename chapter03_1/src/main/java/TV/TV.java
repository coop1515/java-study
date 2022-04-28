package TV;

public class TV {
	private int channel; // 1 ~ 255 rotation
	private int volume; // 0 ~ 100 rotation 
	private boolean power;
	
	public void volume(boolean up) {
		volume(volume + (up ? 1:-1));
		
		//		volume += (up ? 1:-1);
//		if(volume < 0) {
//			volume = 0;
//		}
	}
	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void status() {
		System.out.println(
				"TV[channel=" + channel + ","
						+ " volume ="+ volume + ","
								+ " power="+(power ? "on" : "off"));
	}
}
