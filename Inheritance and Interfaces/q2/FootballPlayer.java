package q2;

public class FootballPlayer extends Person{
			String teamname;
			int uniformnumber;
			int numberofgoals;
			
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
			public void to_String()
			{
				System.out.print("\nname: "+name+"\nage: "+age+"\nheight: "+height+"\nweight: "+weight+"\nteam name: "+teamname
						+"\nuniform number: "+uniformnumber+"\number of goals: "+numberofgoals);
			}
			
}

