package q2;

public class PersonTest {

	public static void main(String[] args) {
		FootballPlayer per1=new FootballPlayer("sobika",24,179,67.0,"abc",7,56);
		CricketPlayer per2=new CricketPlayer("sonia",30,160,57.0,"india","wicketkeeper",34,7890);
		
		System.out.print("the noofgoals of per1(footballplayer) is: "+per1.getnogoals());
		
		System.out.print("\n\ndetails of cricket player per2 is writing into file output2.txt\n");
		per2.writeintofile();
		
		System.out.print("\n\ndetails of football player per1 is writing into file output2.txt\n");
		per1.writeintofile();
		
		System.out.print("*************END************");
	}
}
