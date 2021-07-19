package q2;

import java.io.*;

public class FootballPlayer extends Person{
	private String teamname;
	private int uniformnumber;
	private int numberofgoals;
	
	FootballPlayer(String name,int age,double height,double weight,String teamname,int uniformnumber,int numberofgoals)
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
				+"\nuniform number: "+uniformnumber+"\nnumber of goals: "+numberofgoals;
	}
	
	public void writeintofile()
	{
		try {	
			String str=to_String();
			
			BufferedWriter out=new BufferedWriter(new FileWriter("src\\lab25_09_2020\\output2.txt",true));
			out.write("\n\nfootball player:\n"+str);
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

