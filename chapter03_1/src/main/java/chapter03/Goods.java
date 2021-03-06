package chapter03;

public class Goods {
	public static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//if(a.f() == false) -> a.f()가 이미 false를 뜻함 if(a.f()) 
		/*public Goods() {
			Goods.countOfGoods++;
			//Goods.countOfGoods += 1;
			//Goods.countOfGoods = Goods.countOfGoods + 1;
		}*/
		//source탭에서 getter / setter
		
	public Goods(String name, int price, int countStock, int countSold) {
		//Goods.countOfGoods = Goods.countOfGoods + 1;
		
		this.name =name;
		this.price = price;
		this.countStock =countStock;
		this.countSold=countSold;
	}
	public Goods() {
		//Goods.countOfGoods = Goods.countOfGoods + 1;
		this(null,0,0,0);
	}
	
	public Goods(String name) {
		this(name,0,0,0);
		//this.name = name;
		//Goods.countOfGoods = Goods.countOfGoods + 1;
		
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 데이터 보호
		if (price < 0) {
			price = 0;

		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void showInfo() {
		System.out.println(
				"name: " + name +
				" price: " + price +
				" countStock: " + countStock+
				" countSold: " + countSold);
		
	}
	public int calcDiscountPrice(double discountRate) {
		return (int)(discountRate * price);
	}

}