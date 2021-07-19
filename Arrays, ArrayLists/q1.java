import java.util.*;

public class Ques01 {
	
	public static boolean is_prime(int n) {
		if(n<2)
			return false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
			System.out.print("enter the range:\n");
			
			Scanner sc=new Scanner(System.in);
			
			int a=sc.nextInt();
			int b=sc.nextInt();
		
			for(int i=a; i<=b; i++) {
				if(is_prime(i) && is_prime(i+2)) {
					System.out.printf("(%d , %d)\n",i,i+2);
				}
			}
			sc.close();
	}
}
