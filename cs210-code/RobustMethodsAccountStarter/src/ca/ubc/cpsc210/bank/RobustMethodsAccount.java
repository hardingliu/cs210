package ca.ubc.cpsc210.bank;import ca.ubc.cpsc210.bank.exceptions.IllegalValueException;import ca.ubc.cpsc210.bank.exceptions.NotEnoughMoneyException;public class RobustMethodsAccount {	private static int nextAccountId = 1;  // tracks id of next account created	private int id;                        // account id	private String name;                   // the account owner name	private double balance;                // the current balance of the account	/*	 * This version has changed the specification of each method to make it more robust, 	 * but the implementation has not been changed.	 */		/*	 * Constructor: initializes an account	 * 	 * EFFECTS: if accountName has non-zero length then a new account is created,	 * 			otherwise an IllegalValueException is thrown.  	 * 			The name on account is set to accountName; account id is a	 *          positive integer not assigned to any other account;	 *          if initialBalance >= 0 then balance on account is set to	 *          initialBalance, otherwise balance is zero.	 */	public RobustMethodsAccount(String accountName, double initialBalance) throws IllegalValueException {		if (accountName.length() == 0) {			throw new IllegalValueException("The account name is not illegal" + accountName);		}		id = nextAccountId++;		name = accountName;		if (initialBalance >= 0)			balance = initialBalance;		else			balance = 0;			}	public int getId() {		return id;	}	public String getName() {		return name;	}	public double getBalance() {		return balance;	}	/*	 * Deposit money into the account	 * 	 * MODIFIES: this	 * EFFECTS: if amount >= 0, amount is added to balance and updated	 * 			balance is returned, otherwise IllegalValueException	 * 			is thrown	 */	public double deposit(double amount) throws IllegalValueException {		if (amount < 0) {			throw new IllegalValueException("Cannot deposit negative amount:" + amount);		}        balance = balance + amount;        return balance;	}	/*	 * Withdraw money from the account	 *	 * MODIFIES: this	 * EFFECTS: if amount >= 0 and getBalance() >= amount then amount	 *          is withdrawn from account and updated balance is returned;	 *          otherwise if amount < 0, IllegalValueException is thrown;	 *          otherwise if getBalance() < amount, NotEnoughMoneyException	 *          is thrown.	 */	public double withdraw(double amount) throws IllegalValueException, NotEnoughMoneyException {	       if (amount < 0 ) {		throw new IllegalValueException("Cannot withdraw negative amount:" + amount); }		   if (amount > balance) {			   throw new NotEnoughMoneyException("Cannot withdraw " + amount + " balance is : " + balance);}		   balance = balance - amount;		   return balance;	}	/*	 * Returns the string representation of an account	 * 	 * EFFECTS: returns a string representation of account	 */	public String toString() {		return "[ id = " + id + ",    name = " + name + ",     balance = "				+ balance + "]";	}}