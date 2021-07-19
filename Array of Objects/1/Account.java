package 1;

public class Account {
	final static double interest=0.06;
	String name;
	double balance;
	int acc_number;
	
	public Account()
	{
		name="";
		balance=0.0;
		acc_number=0;
	}
	
	public Account(String s,double b,int a)
	{
		name=s;
		balance=b;
		acc_number=a;
	}

	public void setName(String str)
	{
		this.name=str;
	}

	public void setBalance(double bal)
	{
		this.balance=bal;
	}
	
	public void setAccount(int acc)
	{
		this.acc_number=acc;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAccount()
	{
		return acc_number;
	}
	
	public static double getInterest()
	{
		return interest;
	}
}
