package accountmanagement;
//CUenta limitada
public class LimitAccount extends Account {
	private Double limit;
	public LimitAccount(Double balance) {
		super(balance);
		this.adjustLimit();
	}
	private void adjustLimit() {
		this.limit = this.getBalance() / 2;
	}
	@Override
	public void addBalance(Double money) {
		super.addBalance(money);
		this.adjustLimit();
	}
	@Override
	public void extractBalance(Double money) {
		if (money < this.limit ) {
			super.extractBalance(money);
			this.adjustLimit();
		}
	}
}