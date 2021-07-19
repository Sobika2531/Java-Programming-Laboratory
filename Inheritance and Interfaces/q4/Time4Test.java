package q4;

public class Time4Test {

	public static void main(String[] args) {
		TwentyFrHrClock4 t1=new TwentyFrHrClock4();
		TwelveHrClock4 t2=new TwelveHrClock4(4,42,0);
		
		System.out.print("time 1 in 24hrs format");
		t1.display();
		
		t1.setHours(22);
		t1.setMins(45);
		t1.setSeconds(12);
		System.out.print("\nafter setting new time");
		t1.display();
		
		t1.timeLapsed(1000);
		System.out.print("\nafter timelapsed, new time");
		t1.display();
		
		System.out.print("\ntime 2 in 12hrs format");
		t2.display();
		
		Time4 t=new TwelveHrClock4(8,56,1);
		System.out.print("\ntime t in 12hrs format");
		t.display();
		
		System.out.print("\nthe time difference between time2 and t is: "+t2.difference(t)+" secs");
		
		t1.startTimer();
	}
}

