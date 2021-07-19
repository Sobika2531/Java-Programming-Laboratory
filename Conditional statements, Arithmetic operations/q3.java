import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.print("enter a number between 0 and 1000:\n");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0) {
			sum=sum+(num%10);
			num=num/10;
		}

		System.out.print("the sum of the digits is "+sum);
		
		sc.close();
	}
}
