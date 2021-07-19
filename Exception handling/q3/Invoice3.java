package q3;

import java.util.InputMismatchException;

public class Invoice3 {
	private int part_no;
	private String part_des;
	private int quant_of_item;
	private double price_of_item;
	 
	 Invoice3(int num,String des,int quant,double price) throws InputMismatchException{
		 this.part_no=num;
		 this.part_des=des;
		 this.quant_of_item=quant;
		 this.price_of_item=price;
	 }
	 
	 public void setPartNo(int num) throws InputMismatchException
	 {
		 if(num<=0)
			 throw new InputMismatchException("part number must be greater than 0\n");
		 
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
	 
	 public String toString()
	 {
		 return "part number: "+part_no+"\npart description: "+part_des+"\nnumber of items: "+quant_of_item
		 		+"\nprice of items: "+price_of_item+"\n";
	 }
}
