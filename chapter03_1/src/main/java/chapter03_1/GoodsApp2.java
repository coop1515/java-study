package chapter03_1;

import mypackage.Goods2;

public class GoodsApp2 {

	public static void main(String[] args) {
		Goods2 goods2 = new Goods2();
		
		goods2.name = "camera";		// public이라 접근가능
		//goods2.price = 10000; 		// protected 같은 패키지라 접근 가능. -> 다른 패키지라 접근 불가 
		//goods2.countStock = 30;		// default라 같은 패키지 접근 가능. -> 다른 패키지 접근 불가
		//goods2.countSold = 10;		//private이라 접근 불가능.

	}

}
