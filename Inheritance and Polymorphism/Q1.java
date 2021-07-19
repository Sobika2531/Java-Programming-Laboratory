import java.io.*;
import java.util.Scanner;

class Invoice {
		String part_no;
		String part_des;
		int quant_of_item;
		double price_of_item;
		double amount;
		
		Scanner sc=new Scanner(System.in);
		
		 Invoice()
		 {
			 part_no="01";
			 part_des="bata shoes";
			 quant_of_item=45;
			 price_of_item=200.00;
		 }
		 
		 Invoice(String num,String des,int quant){
			 this.part_no=num;
			 this.part_des=des;
			 this.quant_of_item=quant;
		 }
		 Invoice(String num,String des,int quant,double price){
			 this.part_no=num;
			 this.part_des=des;
			 this.quant_of_item=quant;
			 this.price_of_item=price;
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
		 
		 public void display()
		 {
			 System.out.print("part number: "+part_no+"\npart description: "+part_des+"\nnumber of items: "+quant_of_item
			 		+"\nprice of items: "+price_of_item+"\n\n");
		 }
		 
}

public class Q1
{
	public static void main(String[] args) {
		
		Invoice item1=new Invoice();
		Invoice item2=new Invoice("02","adidas sandals",20,350.45);
		Invoice item3=new Invoice("03","paragon slippers",41);
		
		item1.display();
		item2.display();
		item3.display();
		
		System.out.print("the total invoice amount for item2 is "+item2.getInvoiceAmount()+"\n");
		
		item3.setPriceOfItem(450.60);
		
		System.out.print("\nthe price of item3 is "+item3.getPriceOfItem()+"\n");
		
		System.out.print("the total invoice amount for item3 is "+item3.getInvoiceAmount()+"\n");
	}

}
