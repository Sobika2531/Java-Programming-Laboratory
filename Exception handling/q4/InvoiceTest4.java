package q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceTest4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Invoice4 i=new Invoice4();
		
		int num,quant;
		String des;
		double price;
		
		while(true) {
			try {
				System.out.print("enter the part number:");
				num=sc.nextInt();
				sc.nextLine();
				i.setPartNo(num);
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());	}
			catch(CustomEmptyException er) {
				System.out.print(er.toString());	}
		}

		while(true) {
			try {
				System.out.print("enter the part description:");
				des=sc.nextLine();
				i.setPartDes(des);
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
				i.setQuantOfItem(quant);
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
				i.setPriceOfItem(price);
				break;
			}
			catch(InputMismatchException e) {
				System.out.print(e.toString());
			}
		}
		
		i.display();
		
		sc.close();
	}
}
