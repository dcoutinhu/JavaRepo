/**
 * 
 */
package coutinbank;

/**
 * @author Diego Coutinho
 * @version 1.0
 * Created at July, 2022
 */
public class Account {
	
	private String agency;
	private int accountNumber;
	private double balance;
	private String clientName;
	private String clientAddress;
	private String clientCpf;
	private String clientPhoneNumber;
	
	public Account(String agency, int accountNumber) {
		this.agency = agency;
		this.accountNumber = accountNumber;
		System.out.println(String.format("New Account Created! \nAgency: %s \n"
				+ "Account Number: %d", this.agency,this.accountNumber));
	}
	
	/**
	 * @param value Ammount to withdraw
	 * @return True if the balance is enough
	 */
	public boolean withdraw(double value) {
		if (value <= this.balance) {
			this.balance -= value;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @param value
	 * @param account
	 * @return True if the current balance is enough
	 */
	public boolean transfer(double value, Account account) {
		if (withdraw(value)) {
			account.balance += value;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @return the agency
	 */
	public String getAgency() {
		System.out.println(String.format("Agency: %s", this.agency));
		return this.agency;
	}
	/**
	 * @param agency the agency to set
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		System.out.println(String.format("Account Number: %d", this.accountNumber));
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		System.out.println(String.format("Balance: %f", this.balance));
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the clientName
	 */
	public String getClientName() {
		System.out.println(String.format("Client name: %s", this.clientName));
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return the clientAddress
	 */
	public String getClientAddress() {
		System.out.println(String.format("Client Address: %s", this.clientAddress));
		return clientAddress;
	}
	/**
	 * @param clientAddress the clientAddress to set
	 */
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	/**
	 * @return the clientCpf
	 */
	public String getClientCpf() {
		System.out.println(String.format("Client CPF: %s", this.clientCpf));
		return clientCpf;
	}
	/**
	 * @param clientCpf the clientCpf to set
	 */
	public void setClientCpf(String clientCpf) {
		this.clientCpf = clientCpf;
	}
	/**
	 * @return the clientPhoneNumber
	 */
	public String getClientPhoneNumber() {
		System.out.println(String.format("Client Phone Number: %s", this.clientPhoneNumber));
		return clientPhoneNumber;
	}
	/**
	 * @param clientPhoneNumber the clientPhoneNumber to set
	 */
	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}
	
	
}
