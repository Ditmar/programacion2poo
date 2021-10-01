package accountmanagement;

import java.util.Date;

import javax.rmi.CORBA.Tie;

public class ItemExtract {
	private Date date;
	private String time;
	private Boolean typeOperator;
	private Double amount;
	private Double balanceInTime;
	public ItemExtract (Boolean typeOperator, Double amount, Double balanceInTime) {
		this.date = new Date();
		//hh:mm:ss
		this.time = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
		this.typeOperator = typeOperator;
		this.amount = amount;
		this.balanceInTime = balanceInTime;
	}
	public Date getDate() {
		return date;
	}
	public Boolean getTypeOperator() {
		return typeOperator;
	}
	public void setTypeOperator(Boolean typeOperator) {
		this.typeOperator = typeOperator;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getBalanceInTime() {
		return balanceInTime;
	}
	public void setBalanceInTime(Double balanceInTime) {
		this.balanceInTime = balanceInTime;
	}
	public String getTime() {
		return time;
	}
	
	
}
