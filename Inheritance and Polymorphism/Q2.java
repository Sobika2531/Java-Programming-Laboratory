class Time {
	int hours;
	int mins;
	int secs;
	
	Time()
	{
		hours=0;
		mins=0;
		secs=0;
	}
	
	Time(int hours,int mins,int secs)
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
	
	public void display()
	{
		System.out.print("hours: "+hours+"\nminutes: "+mins+"\nseconds: "+secs+"\n");
	}
	
	public String to_string()
	{
		return this.getHours()+" hours "+this.getMins()+" minutes "+this.getSeconds()+" seconds";
	}
	
	public void timeLapsed(int secs)
	{
		this.hours+=secs/3600;
		secs%=3600;
		this.mins+=secs/60;
		secs%=60;
		this.secs+=secs;
	}
}
public class Q2 {

	public static void main(String[] args) {
		Time t1=new Time();	
		System.out.print("time 1 \n");
		t1.display();
		System.out.print(t1.to_string()+"\n");
		
		Time t2=new Time(14,3,56);
		System.out.print("\ntime 2 \n");
		t2.display();
		System.out.print(t2.to_string()+"\n");
		
		Time t3=new Time(3,7,12);
		System.out.print("\ntime 3 \n");
		t3.display();
		System.out.print(t3.to_string()+"\n");
		t3.timeLapsed(1000);
		System.out.print("\nafter timelapse-\ntime 3 \n"+t3.to_string()+"\n");
		
		t3.setHours(6);
		t3.setMins(6);
		t3.setSeconds(6);
		System.out.print("\nnew time 3 \n");
		t3.display();
		System.out.print("\n"+t3.to_string()+"\n");
	}

}
