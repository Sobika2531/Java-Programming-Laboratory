package q5;
import java.util.*;

public class Person5Test {

	public static void main(String[] args) {
		Person5[] arr=new Person5[2];
		arr[0]=new FootballPlayer5("sobika",25,167,45.80,"aaaa",3,45);
		arr[1]=new Cricketer5("gemini",34,178,62,"india","batsman",6,3245);
		
		FootballPlayer5 f1=(FootballPlayer5)arr[0];
		Cricketer5 c1=(Cricketer5)arr[1];
		
		ArrayList<Cricketer5> x=new ArrayList<Cricketer5>();
		
		x.add(new Cricketer5("gemini",34,178,62,"india","batsman",6,3245));
		x.add(new Cricketer5("sura",24,165,45,"australia","bowler",560,345));
		
		Collections.sort(x,new Comparator<Cricketer5>() {
				public int compare(Cricketer5 a,Cricketer5 b) {
					return a.getNoRuns()-b.getNoRuns();
				}
		});

		for(Cricketer5 cr:x ) {
			System.out.println(cr.to_String());
		}
	}

}
