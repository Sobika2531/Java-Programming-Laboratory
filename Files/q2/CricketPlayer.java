package q2;

import java.io.*;

public class CricketPlayer extends Person{

	private String countryname;
	private String role;
	private int nowickets;
	private int noruns;
	
	CricketPlayer(String name,int age,double height,double weight,String countryname,String role,int nowickets,int noruns)
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
	
	public void writeintofile()
	{
		try {
			String str=to_String();
			
			BufferedWriter out=new BufferedWriter(new FileWriter("src\\lab25_09_2020\\output2.txt",true));
			out.write("cricketer:\n"+str+"\n");
			out.close();
		}
		
		catch(FileNotFoundException e) {
			System.out.print("file not found\n");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	} 
}
