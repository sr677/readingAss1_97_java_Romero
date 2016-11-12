/**
 * 
 */

import java.util.Date;

/**
 * @author Silvana
 *
 */
public class Account {

	/**
	 * 
	 */
	public Account() {}
		// TODO Auto-generated constructor stub
		private int id= 0;
		private double balance = 0;
		private double annualInterestRate = 0;		
		
		private Date datecreated;
		public Account(int id, double balance, double intrate)
		{
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = intrate;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		public Date getDatecreated() {
			return datecreated;
		}

//		public void setDatecreated(Date datecreated) {
//			this.datecreated = datecreated;
//		}
		public double getmonthlyInterestRate()
		{
			return annualInterestRate / 12;
		}
		public double getmonthlyInterest()
		{
			return getmonthlyInterestRate() * balance;
		}
		public double widthdraw(double amount) 
		{
			if (amount > balance)
			{
				System.out.println("amount larger than balance");
				return balance;
			}
			else if(amount <= balance)
			{
				System.out.println("amount is " + amount);
			}
			return balance - amount;
			 
		}
		public double deposit(double dAmount)
		{
			if (dAmount > -1){
				balance = balance + dAmount;
				System.out.println("your deposit is " + dAmount);
				System.out.println("new balance is " + balance);
			}
			else 
			{
				System.out.println("deposit amount lower than zero, balance is still");
				return balance;
			}
			return balance;
	}

}
