package q5;

public class FootballPlayer5  extends Person5{
	String teamname;
	int uniformnumber;
	int numberofgoals;
	
	FootballPlayer5(String name,int age,double height,double weight,String teamname,int uniformnumber,int numberofgoals)
	{
		super(name,age,height,weight);
		this.teamname=teamname;
		this.uniformnumber=uniformnumber;
		this.numberofgoals=numberofgoals;
	}
	
	public int getnogoals()
	{
		return this.numberofgoals;
	}
	
	@Override
	public String to_String()
	{
		return "\nname: "+name+"\nage: "+age+"\nheight: "+height+"\nweight: "+weight+"\nteam name: "+teamname
				+"\nuniform number: "+uniformnumber+"\number of goals: "+numberofgoals;
	}
	
}
