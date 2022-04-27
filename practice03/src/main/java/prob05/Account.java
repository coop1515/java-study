package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		
		return accountNo;
	}

	public int getBalance() {
		
		return balance;
	}

	public void save(int i) {
		this.balance += i;
		System.out.println(this.accountNo + "계좌에 "+i+ "만원이 입금되었습니다.");
		
	}

	public void deposit(int i) {
		this.balance -= i;
		System.out.println(this.accountNo + "계좌에 "+i+ "만원이 출금되었습니다.");
	}
}
