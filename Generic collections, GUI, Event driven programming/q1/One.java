package q1;

import java.util.Scanner;

public class One {

	public static <S> boolean isEqualTo(S a,S b) {
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b;
		int i,j;
		float x,y;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter two integers:\n");
		i=sc.nextInt();
		j=sc.nextInt();
		
		System.out.print("\nenter two floats:\n");
		x=sc.nextFloat();
		y=sc.nextFloat();
		
		System.out.print("\nenter two strings:\n");
		a=sc.next();
		b=sc.next();
		
		System.out.print("\n\nare integers equal?"+isEqualTo(i,j));
		System.out.print("\n\nare floats equal?"+isEqualTo(x,y));
		System.out.print("\n\nare strings equal?"+isEqualTo(a,b));
		
		sc.close();
	}

}
