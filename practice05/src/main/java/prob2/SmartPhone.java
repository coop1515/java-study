package prob2;

public class SmartPhone extends MusicPhone {
	
	public SmartPhone() {
		
	}

	@Override
	public void execute(String function) {
		if ("음악".equals(function)) {
			playMusic();
			return;
		}
		else if("앱".equals(function)) {
			System.out.println("앱실행");
			return;
		}
		super.execute(function);
	}
	
	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
}
