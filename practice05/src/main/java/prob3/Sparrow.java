package prob3;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println("참새("+getName()+")는 날아다닙니다.");

	}

	@Override
	public void sing() {
		System.out.println("참새("+getName()+")는 소리내어 웁니다.");

	}
	
	@Override
	public void setName(String name) {
		this.name = "짹짹";
	}
	
	public String toString() {
		return "참새의 이름은 "+ name +"입니다.";
	}
}
