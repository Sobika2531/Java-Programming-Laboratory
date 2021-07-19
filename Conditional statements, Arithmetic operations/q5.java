import java.util.Scanner;

public class IncOrDec {

	public static void main(String[] args) {
		System.out.print("enter three integers:\n");
		
		Scanner n1=new Scanner(System.in);
		int a=n1.nextInt();
		int b=n1.nextInt();
		int c=n1.nextInt();
		
		if((a<b)&&(b<c))
			System.out.print("the numbers are in increasing order\n");
		else if((a>b)&&(b>c))
			System.out.print("the numbers are in decreasing order\n");
		else
			System.out.print("the numbers are neither in increasing nor decreasing order\n");
		
		n1.close();
	}

}
