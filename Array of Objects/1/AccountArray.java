package 1;
import java.util.*;

public class AccountArray {
	public static double totalInterest(Account[] a)
	{
		double totalInt=0.0,intRate=Account.getInterest();
		
		for(Account i:a)
		{
			totalInt+=i.getBalance()*intRate;
		}
		return totalInt;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		double totalInt;
		System.out.print("enter the total number of accounts :");
		n=sc.nextInt();
		
		Account acc[]=new Account[n];
		
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			acc[i]=new Account();
			System.out.print("\nenter the name of account holder : ");
			acc[i].setName(sc.nextLine());
			System.out.print("enter balance : ");
			acc[i].setBalance(sc.nextDouble());
			System.out.print("enter account number : ");
			acc[i].setAccount(sc.nextInt());
		}
		
		totalInt=totalInterest(acc);
		
		System.out.println("\ntotal interest charged "+(Account.getInterest()*100)+"%,");
		System.out.println("total interest:"+totalInt);	
		
		sc.close();
		}
	}

