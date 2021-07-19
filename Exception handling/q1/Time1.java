package q1;

public  class Time1 {
	private int hours;
	private int mins;
	private int secs;
	
	Time1()   //default constructor
	{
		hours=0;
		mins=0;
		secs=0;
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
	
	public void setSeconds(int secs) throws IllegalArgumentException{
		if(secs>59||secs<0) throw new IllegalArgumentException("invalid: seconds should be greaterthan orequalto 0 and lessthan orequalto 59\n");
		this.secs=secs;
	}
	public void setMins(int mins) throws IllegalArgumentException{
		if(mins>59||mins<0) throw new IllegalArgumentException("invalid: minutes should be greaterthan orequalto 0 and lessthan orequalto 59\n"); 
		this.mins=mins;
	}
	public void setHours(int hours) throws IllegalArgumentException{
		if(hours>23||hours<0) throw new IllegalArgumentException("invalid: hours should be greaterthan orequalto 0 and lessthan orequalto 23\n");
		this.hours=hours;
	}
	
	public String to_string() {
		return this.getHours()+" hours  "+this.getMins()+" mins  "+this.getSeconds()+" secs\n";
	}
}
