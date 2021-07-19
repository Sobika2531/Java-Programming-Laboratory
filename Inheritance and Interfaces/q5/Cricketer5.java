package q5;
public class Cricketer5 extends Person5{
	String countryname;
	String role;
	int nowickets;
	int noruns;	
	Cricketer5(String name,int age,double height,double weight,String countryname,String role,int nowickets,int noruns)
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
	public String to_String()
	{
		return "\nname: "+name+"\nage: "+age+"\nheight: "+height+"\nweight: "+weight+"\ncountry name: "+countryname+
				"\nrole: "+role+"\nno of wickets: "+nowickets+"\nno of runs: "+noruns;
	}
	
}
 
