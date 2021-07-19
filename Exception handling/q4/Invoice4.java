package q4;

import java.util.InputMismatchException;

public class Invoice4 {
	
	private int part_no;
	private String part_des;
	private int quant_of_item;
	private double price_of_item;
	
	Invoice4(){
		 this.part_no=0;
		 this.part_des="";
		 this.quant_of_item=0;
		 this.price_of_item=0.0;
	 }
	 
	 Invoice4(int num,String des,int quant,double price) throws InputMismatchException{
		 this.part_no=num;
		 this.part_des=des;
		 this.quant_of_item=quant;
		 this.price_of_item=price;
	 }
	 
	 public void setPartNo(int num) throws InputMismatchException,CustomEmptyException
	 {
		 if(num<0)
			 throw new InputMismatchException("part number can't be negative\n");
		 if(num==0)
			 throw new CustomEmptyException("part number not found\n");
		 
		 this.part_no=num;
	 }
	 
	 public void setPartDes(String des) throws InputMismatchException
	 {
		 if(des.length()==0)
			 throw new InputMismatchException("description can't be null\n");

		 this.part_des=des;
	 }
	 
	 public void setQuantOfItem(int quant) throws InputMismatchException
	 {
		 if(quant<=0)
			 throw new InputMismatchException("quantity must be greater than 0\n");

		 this.quant_of_item=quant;
	 }
	 
	 public void setPriceOfItem(double price) throws InputMismatchException
	 {
		 if(price<=0.0)
			 throw new InputMismatchException("price per item must be greater than 0\n");
	 
		 this.price_of_item=price;
	 }
	 
	 public void display()
	 {
		 System.out.print("part number: "+part_no+"\npart description: "+part_des+"\nnumber of items: "+quant_of_item
		 		+"\nprice of items: "+price_of_item+"\n\n");
	 }
}
