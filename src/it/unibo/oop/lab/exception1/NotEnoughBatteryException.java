package it.unibo.oop.lab.exception1;

/* I picked IllegalStateException to be extended because, between the three choices, 
 * this one was the more suitable for the situation to handle.
 * Exception(s) and RuntimeException(s) are way too generic to represent the situation
 * in which robot ran out of battery. 
 */

public class NotEnoughBatteryException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private final int x;
    private final int y;
	
    public NotEnoughBatteryException(final int initX, final int initY) {
        super();
        this.x = initX;
        this.y = initY;
    }
    
    @Override
    public String toString() {
        return "Can not move to pos(" + this.x + ", " + this.y + "), not enough battery";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
    
}
