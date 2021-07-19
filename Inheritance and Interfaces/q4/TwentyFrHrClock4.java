package q4;

public class TwentyFrHrClock4 extends Time4{
	TwentyFrHrClock4()
	{
		super();
	}
	
	TwentyFrHrClock4(int hours,int mins,int secs)
	{
		super(hours,mins,secs);
	}
	
	public void timeLapsed(int secs)
	{
			hours+=secs/3600;
			hours%=24;
			secs%=3600;
			mins+=secs/60;
			secs%=60;
			secs+=secs;
	}
	
	@Override
	public void display()
	{
		System.out.print("\n"+hours+" hours "+mins+" mins "+secs+" secs\n");
	}
	

}
