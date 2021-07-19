import java.util.*;
public class Ques07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> one=new ArrayList<String>();
		String str;
		int pos,n;
		boolean flag=false;
		System.out.print("enter the name of the students(enter exit to end):\n");
		str=sc.nextLine();
		while(!str.equalsIgnoreCase("exit")) {
			if(!str.equals(""))
				one.add(str);	
			str=sc.nextLine();
		}
		while(!flag) {
			System.out.print("enter the name of the students to search:\n");
			str=sc.nextLine();	
			if(one.contains(str))
				flag=true;
			else
				System.out.print("sorry, try again\n");
		}
		pos=one.indexOf(str);
		System.out.print(str+" is at roll. no "+(pos+1)+"\n");
		
		System.out.print("enter the name of the students to remove:\n");
		str=sc.nextLine();
		if(one.remove(str))
			System.out.print(str+" removed successfully\n");
		if(one.size()==0) {
			System.out.print("no students in the class\n");
			System.exit(0);
		}
		System.out.print("students in the reverse order:\n");
		for(int i=one.size()-1;i>=0;i--)
			System.out.print(one.get(i)+"\n");
		n=one.size();
		System.out.print("size of java programming class is:"+n);
		sc.close();
	}
}
