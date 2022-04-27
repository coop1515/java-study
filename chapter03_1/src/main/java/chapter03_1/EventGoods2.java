package chapter03_1;

import mypackage.Goods2;

public class EventGoods2 extends Goods2 {
	private float discountRate = 0.5f;
	
	public int getDiscountPrice() {
		int discountPrice = (int)discountRate * price; // float * int 이기때문에 int값으로 변환해줘야함.
		//price는 protected라 자식에서 접근 가능 Goods2가 부모
		return discountPrice;
	}
}
