package q3;

import java.util.Scanner;
public class Invoice12Test {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the id of the invoice: ");
		String number = input.next();
		
		System.out.print("Enter the Description of the invoice: ");
		String desc = input.next();
		
		System.out.print("Enter the quantity of the invoice: ");
		int quantity = input.nextInt();
		
		System.out.print("Enter the price of the invoice: ");
		double price= input.nextDouble();
		
		Invoice12 i1 = new Invoice12(number,desc,quantity,price);
		i1.display();
		
		System.out.printf("\n\nThe total amount is: %f\n",i1.getInvoiceAmount());
		System.out.printf("The discount amount is: %f\n",i1.calculateDiscount());
		System.out.printf("The total amount after discount: %f\n",i1.displayTotal());
		
		Invoice12.modifyDiscountRate(0.26);
		System.out.printf("\ndiscount rate after modification: %f\n",Invoice12.getDiscountRate());
		
		System.out.print("details after modification\n");
		System.out.printf("discount amount is: %f\n",i1.calculateDiscount());
		System.out.printf("total amount after discount: %f\n",i1.displayTotal());
		System.out.printf("tax amount is: %f\n",i1.calculateTax());
		System.out.printf("total amount after discount and adding tax: %f",i1.displayTotal()+i1.calculateTax());
		
		input.close();
	}
}

