package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5186015990336694793L;
	
	private final int currentATMTransactions;
	private final int maxATMTransatcions;
	
	public TransactionsOverQuotaException(final int currentATMTransactions, final int maxATMTransatcions) {
		super();
		this.currentATMTransactions = currentATMTransactions;
		this.maxATMTransatcions = maxATMTransatcions;
	}

	@Override
	public String toString() {
		return "Maximum ATM transactions (" + this.maxATMTransatcions 
				+ ") reached, current transactions: " + this.currentATMTransactions; 
	}
	
	@Override
	public String getMessage() {
		return this.toString();
	}
	
}
