package accountmanagement;

import java.util.ArrayList;

public class Extract {
	private ArrayList<ItemExtract> historicalExtractList;
	public Extract () {
		historicalExtractList = new ArrayList<ItemExtract>();
	}
	public void registerMoves(Boolean typeOperator, Double amount, Double balanceInTime) {

		ItemExtract itemExtract = new ItemExtract(typeOperator, amount, balanceInTime);
		historicalExtractList.add(itemExtract);
	}
	public void showMoves() {
		for (ItemExtract item : historicalExtractList) {
			String typeOperatorString = "";
			if (item.getTypeOperator()) {
				typeOperatorString = "+";
			} else {
				typeOperatorString = "-";
			}
			System.out.println(item.getDate()  + 
					" - " + item.getTime() + 
					" " + item.getAmount() + " " + 
					typeOperatorString + " historical" + item.getBalanceInTime() );
		}
	}
}
