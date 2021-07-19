import java.util.Scanner;

class Time2 {
	int hours;
	int mins;
	int secs;
	
	Time2()
	{
		hours=0;
		mins=0;
		secs=0;
	}
	
	Time2(int hours,int mins,int secs)
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
	
	public void display(int i)
	{
		if(i==0&&(this.hours>12))
				System.out.printf("\n %d:%d:%d %s",(this.hours-12),this.mins,this.secs,"PM");
			
		else if(i==0&&(this.hours<=12))
				System.out.printf("\n %d:%d:%d %s",this.hours,this.mins,this.secs,"AM");

		else
			System.out.print("\nhours: "+hours+"\nminutes: "+mins+"\nseconds: "+secs+"\n");
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
	
	private int findSecs() 
	{
		return hours*3600+mins*60+secs*60;
	}
	
	public boolean equals(Time2 t)
	{
		if(t.findSecs()==this.findSecs())
			return true;
		return false;
	}
	
	public Time2 addTime(Time2 t)
	{
		int se,mi=0,ho=0;
		
		se=this.secs+t.secs;
		if(se>=60) {
			se=se-60;
			mi+=1;
		}
		
		mi=mi+this.mins+t.mins;
		if(mi>=60) {
			mi=mi-60;
			ho+=1;
		}
		
		ho=ho+this.hours+t.hours;
		if(ho>=24) 
			ho=ho-24;
		
		return new Time2(ho,mi,se);
	}
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the hours,mins and seconds for time 1\n");
		int h=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		
		Time2 t1=new Time2(h,m,s);
		System.out.print("\ntime 1 \n");
		t1.display(1);
		System.out.print(t1.to_string()+"\n");
		
		Time2 t2=new Time2(14,3,56);
		System.out.print("\ntime 2 \n");
		t2.display(1);
		System.out.print(t2.to_string()+"\n");
		
		if(t2.equals(t1))
			System.out.print("\ntime1 and time2 are equal");
		else
			System.out.print("\ntime1 and time2 aren't equal");
		
		Time2 t3=t1.addTime(t2);
		
		System.out.print("\ntime 3 \n");
		t3.display(0);
		t3.display(1);
		
		sc.close();
	}

}
