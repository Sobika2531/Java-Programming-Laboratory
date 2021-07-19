package q1;

public abstract class Time {
		protected int hours;
		protected int mins;
		protected int secs;
		
		Time()   //default constructor
		{
			hours=0;
			mins=0;
			secs=0;
		}
		
		Time(int hours,int mins,int secs)   //constructor with three parameters
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
		
		public void display()	//cannot be abstract
		{
			System.out.print("\n"+hours+" hours "+mins+" mins "+secs+" secs\n");
		}
}
