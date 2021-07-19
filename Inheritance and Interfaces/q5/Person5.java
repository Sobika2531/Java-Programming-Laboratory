package q5;

public abstract class Person5 {
	protected String name;
	protected int age;
	protected double height;
	protected double weight;
	
	
	Person5(String name,int age,double height,double weight)   //constructor with four arguments
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	public abstract String to_String();
}
