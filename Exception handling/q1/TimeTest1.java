package q1;
import java.util.Scanner;

public class TimeTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Time1 t=new Time1();
		
		int hours,mins,secs;
		
		while(true) {
			System.out.print("enter the hours:\n");
			hours=sc.nextInt();
			
			try {
				t.setHours(hours);
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.print(e.toString());
			}
		}
		while(true) {
			System.out.print("enter the minutes:\n");
			mins=sc.nextInt();
			
			try {
				t.setMins(mins);
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.print(e.toString());
			}
		}
		while(true) {
			System.out.print("enter the seconds:\n");
			secs=sc.nextInt();
			
			try {
				t.setSeconds(secs);
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.print(e.toString());
			}
		}
		
		String str=t.to_string();
		System.out.print("\nthe time is: "+str);
		sc.close();
	}
}
