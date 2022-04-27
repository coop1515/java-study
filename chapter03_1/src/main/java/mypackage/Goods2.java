package mypackage;

public class Goods2 {
	public String name;		//누구든 접근이 가능. (접근 제한이 없다.)
	protected int price;	//자식 접근이 가능 + 같은 패키지 접근 가능.
	int countStock;			//default로 같은 패키지만 접근 가능.
	private int countSold;	//클래스 내부에서만 접근이 가능.
	
	public void main(String[] args) {
		countSold = 100;

	}

}
