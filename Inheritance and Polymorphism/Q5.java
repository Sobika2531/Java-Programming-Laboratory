import java.io.*;
import java.util.Date;
import java.util.Scanner;

class Invoice3 {
		Date date;
		String part_no;
		String part_des;
		int quant_of_item;
		double price_of_item;
		double amount;
		static double discountRate=0.2;
		
		Scanner sc=new Scanner(System.in);
		
		 Invoice3()
		 {
			 part_no="";
			 part_des="";
			 quant_of_item=0;
			 price_of_item=0.0;
			 date=new Date();
		 }
		 
		 Invoice3(String num,String des,int quant){
			 this.part_no=num;
			 this.part_des=des;
			 this.quant_of_item=quant;
			 date=new Date();
		 }
		 Invoice3(String num,String des,int quant,double price){
			 this.part_no=num;
			 this.part_des=des;
			 this.quant_of_item=quant;
			 this.price_of_item=price;
			 date=new Date();
		 }
		
		 public String getPartNo()
		 {
			 return part_no;
		 }
		 public String getPartDes()
		 {
			 return part_des;
		 }
		 public int getQuantOfItem()
		 {
			 return quant_of_item;
		 }
		 public double getPriceOfItem()
		 {
			 return price_of_item;
		 }
		 
		 public String setPartNo(String num)
		 {
			 part_no=num;
			 return part_no;
		 }
		 public String setPartDes(String des)
		 {
			 part_des=des;
			 return part_des;
		 }
		 public int setQuantOfItem(int quant)
		 {
			 quant_of_item=quant;
			 return quant_of_item;
		 }
		 public double setPriceOfItem(double price)
		 {
			 price_of_item=price;
			 return price_of_item;
		 }
		 
		 public double getInvoiceAmount()
		 {
			 amount=price_of_item*(double)quant_of_item;
			 return amount;
		 }
		 
		 public static void modifyDiscountRate(double rate) 
		 {
			 discountRate=rate;
		 }
		 
		 public double calculateDiscount()
		 {
			 return this.getInvoiceAmount()*discountRate;
		 }
		 
		 public static double[] displayTotal(Invoice3[] arr)
		 {
			 double[] abc=new double[arr.length];
			 
			 for(int i=0;i<arr.length;i++)
				 abc[i]=arr[i].getInvoiceAmount()-arr[i].calculateDiscount();
			 
			 return abc;
		 }
		 
		 public void display()
		 {
			 System.out.print("part number: "+part_no+"\npart description: "+part_des+"\nnumber of items: "+quant_of_item
			 		+"\nprice of items: "+price_of_item+"\n\n");
		 }
		 
		 public Date getDate()
		 {
			 return this.date;
		 }
}

public class Q5
{
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the size of the array:\n");
		int n=input.nextInt();
		
		Invoice3 arr[]=new Invoice3[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("\n"+(i+1)+"th invoice");
			System.out.print("\nenter the part no: ");
			String str1=input.next();
			System.out.print("enter the part description: ");
			String str2=input.next();
			System.out.print("enter the quantity of the item: ");
			int a=input.nextInt();
			System.out.print("enter the price of the item: ");
			double dou=input.nextDouble();
			
			arr[i]=new Invoice3(str1,str2,a,dou);
		}
		
		double[] abc=Invoice3.displayTotal(arr);
		
		System.out.print("\nthe total amount after applying discount\n");
		
		for(int i=0;i<n;i++)
		{
			System.out.print("\ntotal amount: "+abc[i]+" date: "+arr[i].getDate());
		}
		input.close();
	}
}

