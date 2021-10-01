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
	public void addLimitBalance(Double money) {
		this.addBalance(money);
		this.adjustLimit();
	}
	public Boolean extractLimitBalance(Double money) {
		if (money < this.limit ) {
			this.extractBalance(money);
			this.adjustLimit();
			return true;
		} 
		return false;
		
	}
}