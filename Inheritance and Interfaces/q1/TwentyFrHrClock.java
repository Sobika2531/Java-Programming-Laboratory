package q1;

public class TwentyFrHrClock extends Time{
	
	TwentyFrHrClock()
	{
		super();
	}
	
	TwentyFrHrClock(int hours,int mins,int secs)
	{
		super(hours,mins,secs);
	}
	
	public void timeLapsed(int secs)
	{
			this.hours+=secs/3600;
			secs%=3600;
			this.mins+=secs/60;
			secs%=60;
			this.secs+=secs;
	}
	
	@Override
	public void display()
	{
		System.out.print("\n"+hours+" hours "+mins+" mins "+secs+" secs\n");
	}
	
}
