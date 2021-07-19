package q4;

public abstract class Time4 implements StopWatch{
	protected int hours;
	protected int mins;
	protected int secs;
	
	Time4()   //default constructor
	{
		hours=0;
		mins=0;
		secs=0;
	}
	
	Time4(int hours,int mins,int secs)   //constructor with three parameters
	{
		this.hours=hours;
		this.mins=mins;
		this.secs=secs;
	}
	
	public int getSeconds() {
		return secs;
	}
	public int getMins() {
		return mins;
	}
	public int getHours() {
		return hours;
	}
	
	public void setSeconds(int secs) {
		this.secs=secs;
	}
	public void setMins(int mins) {
		this.mins=mins;
	}
	public void setHours(int hours) {
		this.hours=hours;
	}
	
	public int findSecs()
	{
		return hours*3600+mins*60+secs;
	}
	
	abstract public void display();
	
	public void startTimer()
	{
		System.out.print("\n\ntimer:\n");
		for(int i=0;i<timeSecs;i++)
		{
			System.out.print(i+1+"\n");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
