package q2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InvoiceTest2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int num,quant;
		String des;
		double price;
		
		while(true) {
			try {
				System.out.print("enter the part number:");
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
				System.out.print("enter the part description:");
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
				System.out.print("enter the quantity:");
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
				System.out.print("enter the price per item:");
				price=sc.nextDouble();
				
				if(price<=0.0)
					throw new InputMismatchException("price per item must be greater than zero\n");
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}
		
		Invoice2 i=new Invoice2(num,des,quant,price);
		
		i.display();
		
		sc.close();
	}
}
