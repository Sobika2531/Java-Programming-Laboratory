package q2;

public class Cricketer extends Person{

	String countryname;
	String role;
	int nowickets;
	int noruns;
	
	Cricketer(String name,int age,double height,double weight,String countryname,String role,int nowickets,int noruns)
	{
		super(name,age,height,weight);
		this.countryname=countryname;
		this.role=role;
		this.nowickets=nowickets;
		this.noruns=noruns;
	}
	
	public String getCountryName() {
		return this.countryname;
	}
	public String getRole() {
		return this.role;
	}
	public int getNoWickets() {
		return this.nowickets;
	}
	public int getNoRuns() {
		return this.noruns;
	}
	
	@Override
	public void to_String()
	{
		System.out.print("\nname: "+name+"\nage: "+age+"\nheight: "+height+"\nweight: "+weight+"\ncountry name: "+countryname+
				"\nrole: "+role+"\nno of wickets: "+nowickets+"\nno of runs: "+noruns);
	}
	
}
