import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		System.out.print("enter the distance(in metres):\n");
		Scanner sc=new Scanner(System.in);
		double dis=sc.nextDouble();
		
		System.out.print("enter the time(hours,minutes,seconds):\n");
		double hour=sc.nextDouble();
		double min=sc.nextDouble();
		double sec=sc.nextDouble();
		
		double s,h;
		
		s=(hour*3600) + (min*60) +sec;
		h=hour+(min/60)+(sec/3600);
		
		System.out.print("speed(in metres per sec):"+(dis/s)+"\n");
		System.out.print("speed(in km per hour):"+((dis/1000)/h)+"\n");
		System.out.print("speed(in miles per hour):"+((dis/1609)/h)+"\n");
		
		sc.close();
	}
}
