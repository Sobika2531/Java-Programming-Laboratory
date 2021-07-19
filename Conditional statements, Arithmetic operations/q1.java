import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		System.out.print("enter the name of the month(start with small letter):\n");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		if((str.equals("january"))||(str.equals("march"))||(str.equals("may"))||(str.equals("july"))||(str.equals("august"))||
				(str.equals("october"))||(str.equals("december")))
			System.out.print("number of days: 31");
		
		else if((str.equals("april"))||(str.equals("june"))||(str.equals("september"))||(str.equals("november")))
			System.out.print("number of days: 30");
		
		else if(str.equals("february")) {
			System.out.print("enter the year:\n");
			int y=sc.nextInt();
			
			if((y%400==0)||((y%100!=0)&&(y%4==0)))
				System.out.print("number of days: 29");
			else
				System.out.print("number of days: 28");
		}
		
		else
			System.out.print("invalid month\n");
		
		sc.close();
	}
}
