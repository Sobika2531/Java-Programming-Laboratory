package q1;

public class TwelveHrClock extends Time{
	
	TwelveHrClock()
	{
		super();
	}
	
	TwelveHrClock(int hours,int mins,int secs)
	{
		super(hours,mins,secs);
	}
	
	public int difference(Time t)
	{
		return Math.abs(this.findSecs()-t.findSecs());
	}
	
	@Override
	public void display()
	{
		System.out.print("\n"+hours+" hours "+mins+" mins "+secs+" secs\n");
	}
}
