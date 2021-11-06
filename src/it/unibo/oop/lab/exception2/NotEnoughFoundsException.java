package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1159808475879283028L;
	
	private final double currFounds;
	private final double neededFounds;
	
	public NotEnoughFoundsException(final double currFounds, final double neededFounds) {
		super();
		this.currFounds = currFounds;
		this.neededFounds = neededFounds;
	}

	@Override
	public String toString() {
		return "Not enough money: current founds = " + this.currFounds 
				+ "needed founds = " + this.neededFounds; 
	}
	
	@Override
	public String getMessage() {
		return this.toString();
	}
	
}
