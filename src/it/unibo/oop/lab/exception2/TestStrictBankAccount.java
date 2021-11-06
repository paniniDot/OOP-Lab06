package it.unibo.oop.lab.exception2;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
   
	public static int N_TRANSACTIONS = 10;	
	public static int ID_1 = 666;
	public static int ID_2 = 69;
	public static int INIT_AMMOUNT = 10_000;
	
	
	@Test
    public void testBankOperations() {
        
    	final StrictBankAccount marcorossi = new StrictBankAccount(ID_1, INIT_AMMOUNT, N_TRANSACTIONS);
    	final StrictBankAccount stefanoguidi = new StrictBankAccount(ID_2, INIT_AMMOUNT, N_TRANSACTIONS);
    	
    	try {
    		for (int i = 0; i < N_TRANSACTIONS; i++) {
    			marcorossi.deposit(ID_1, 0);
    		}
    		marcorossi.deposit(ID_1, 0); // throws TransactionsOverQuotaException
    		fail("Expected exception not thrown");
    	} catch (TransactionsOverQuotaException e) {
    		assertNotNull(e);
    	};
    		
    	try {
        	marcorossi.deposit(ID_2, 10); // throws WrongAccountHolderException
        	fail("Expected exception not thrown");
    	} catch (WrongAccountHolderException e) {
    		assertNotNull(e);
    	}
    	
    	try {
    		stefanoguidi.withdraw(ID_2, INIT_AMMOUNT + 1);
    		fail("Expected exception not thrown");
    	} catch (NotEnoughFoundsException e) {
    		assertNotNull(e);
    	};
    	
    }
}
