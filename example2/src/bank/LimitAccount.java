package bank;

public class LimitAccount extends Account {
	private Double limit;
	public LimitAccount(Double money) {
		super(money);
		adjustLimit();
	}
	private void adjustLimit() {
		this.limit = this.getBalance() / 2;
	}
	public void add(Double money) {
		super.add(money);
		this.adjustLimit();
	}
	public void subtract(Double money) {
		if (this.limit >= money) {
			super.subtract(money);
			this.adjustLimit();
		} else {
			System.out.println("No se puede sacar mas dinero que la variable limite" + this.limit);
		}
		//throw new Error("No se puede sacar mas dinero que la variable limite" + this.limit);
	}
}
