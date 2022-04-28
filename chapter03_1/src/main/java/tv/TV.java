package tv;

public class TV {
	private int channel; // 1 ~ 255 rotation
	private int volume; // 0 ~ 100 rotation
	private boolean power;

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void volume(boolean up) {
		volume(volume + (up ? 1 : -1));
		
		// volume += (up ? 1:-1);
		if (volume < 0) {
			volume = 0;
		}
		else if (volume > 100) {
			volume = 100;
		}
//		if(volume < 0) {
//			volume = 0;
//		}
	}

	public void volume(int volume) {
		this.volume = volume;
	}

	public void status() {
		System.out.println(
				"TV[channel=" + channel + "," + " volume =" + volume + "," + " power=" + (power ? "on" : "off"));
	}

	public void power(boolean power) {
		this.power = power;
		
	}

	public void channel(int channel) {
		this.channel = channel;
		
	}

	public void channel(boolean up) {
		channel(channel + (up ? 1:-1));
		if (channel < 0) {
			channel = 0;
		}
		else if (channel > 255) {
			channel = 255;
		}
		
		
	}
}
