package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7190620326792084901L;

	private final int wrongUserID;
	
	public WrongAccountHolderException(final int ID) {
		super();
		this.wrongUserID = ID;
	}
	
	@Override
	public String toString() {
		return "Entered a wrong user ID: " + this.wrongUserID; 
	}
	
	@Override public String getMessage() {
		return this.toString();
	}
	
}
