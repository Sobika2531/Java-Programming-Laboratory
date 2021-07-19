package q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("enter the size of the array:");
		n=sc.nextInt();
		
		int num,quant;
		String des;
		double price;
		Invoice3 a[]=new Invoice3[n];
		
		for(int i=0;i<n;i++) {
		while(true) {
			try {
				System.out.print("enter the "+(i+1)+"th part number:");
				num=sc.nextInt();
				sc.nextLine();
				if(num<=0)
					throw new InputMismatchException("part number must be greater than zero\n");
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}

		while(true) {
			try {
				System.out.print("enter the "+(i+1)+"th part description:");
				des=sc.nextLine();
				
				if(des.equals(""))
					throw new InputMismatchException("description can't be null\n");
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}
		while(true) {
			try {
				System.out.print("enter the "+(i+1)+"th quantity:");
				quant=sc.nextInt();
				
				if(quant<=0)
					throw new InputMismatchException("quantity must be greater than zero\n");
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}
		while(true) {
			try {
				System.out.print("enter the "+(i+1)+"th price per item:");
				price=sc.nextDouble();
				
				if(price<=0.0)
					throw new InputMismatchException("price per item must be greater than zero\n");
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}
		System.out.println();
		a[i]=new Invoice3(num,des,quant,price);
		}
		
		while(true) {
			System.out.print("enter the index of the invoice array to display the invoice: ");
			int pos=sc.nextInt();
			
			try {
				if(pos<0||pos>=n)
					throw new InputMismatchException("index sholud be greater than 0 and less than "+n+"\n");
				System.out.print(a[pos].toString());
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}
		sc.close();
	}
}
