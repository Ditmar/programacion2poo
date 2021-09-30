package bank;
public class Account {
	private Double balance;
	public Account (Double money) {
		this.balance = money;
	}
	public void add(Double money) {
		this.balance = this.balance + money;
	}
	public void subtract (Double money) {
		if (this.balance > money) {
			this.balance = this.balance - money;
		}
		 throw new Error("No se puede realizar la operación");
	}
	public Double showBalance () {
		return this.balance;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
