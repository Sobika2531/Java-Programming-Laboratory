package q3;

public class Invoice12  implements TaxCalculator {
	private String num;
	private String des;
	private int quant;
	private double price;
	private static double rate=0.2;
	
	Invoice12(){	//default constructor
		num ="";
		des="";
		quant=0;
		price=0.0;
	}
	
	Invoice12(String number,int quantity,double price){ //constructor with three arguments
		this.num = number;
		this.des="";
		this.quant=quantity;
		this.price=price;
	}
	
	Invoice12(String number,String desc,int quantity,double price){ //constructor with four arguments
		this.num = number;
		this.des=desc;
		this.quant=quantity;
		this.price=price;
	}
	
	public double calculateTax() {
		return this.displayTotal() * salestaxrate; 
	}
	
	public void setNumber(String number) {
		this.num=number;
	}
	
	public String getNumber() {
		return this.num;
	}
	
	public void setDescription(String desc) {
		this.des=desc;
	}
	
	public String getDescription() {
		return this.des;
	}
	
	public void setQuantity(int q) {
		quant=q;
	}
	
	public int getQuantity() {
		return this.quant;
	}
	
	public void setPrice(double p) {
		this.price=p;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getInvoiceAmount() {
		return this.price * this.quant;
	}
	
	public void display() {
		System.out.print("\nnumber: "+num+"\ndescription: "+des+"\nquantity: "+quant+"\nprice: "+price);
	}
	
	public double displayTotal() {
		return this.getInvoiceAmount()- this.calculateDiscount();
	}
	
	public double calculateDiscount() {
		return this.getInvoiceAmount() * rate;
	}
	
	public static void modifyDiscountRate(double rate) {
		Invoice12.rate=rate;
	}
	public static double getDiscountRate() {
		return rate;
	}
}
