package accountmanagement;
//Clase cuenta
public class Account {
	//saldo
	private Double balance;
	private Extract extract;
	public Account (Double balance) {
		this.balance = balance;
		extract = new Extract();
	}
	public void addBalance(Double money) {
		this.balance += money;
		extract.registerMoves(true, money, this.balance);
	}
	public void extractBalance(Double money) {
		if (money < this.balance) {
			this.balance -= money;
			extract.registerMoves(false, money, this.balance);
		}
	}
	public void showExtract() {
		extract.showMoves();
	}
	public Double getBalance() {
		return this.balance;
	}
}