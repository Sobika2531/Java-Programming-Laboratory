package q4;

public class TwelveHrClock4 extends Time4{
	
	TwelveHrClock4()
	{
		super();
	}
	
	TwelveHrClock4(int hours,int mins,int secs)
	{
		super(hours,mins,secs);
	}
	
	public int difference(Time4 t)
	{
		return Math.abs(this.findSecs()-t.findSecs());
	}
	
	@Override
	public void display()
	{
		System.out.print("\n"+hours+" hours "+mins+" mins "+secs+" secs\n");
	}
}
