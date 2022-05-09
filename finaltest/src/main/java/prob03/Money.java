package prob03;

import java.util.Objects;

public class Money {
	private int amount;
	/* 코드 작성 */
	public Money(int i) {
		this.amount = i;
	}

	public Object add(Money money) {
		
		int amount = Integer.parseInt(money.toString()) + this.amount ;
		return amount;
	}

	public Object minus(Money money) {

		return null;
	}

	public Object multiply(Money money) {

		return null;
	}

	public Object devide(Money money) {

		return null;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}
	
}
