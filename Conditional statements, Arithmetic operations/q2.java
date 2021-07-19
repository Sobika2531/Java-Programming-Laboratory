import java.util.Scanner;

public class VowOrCons {

	public static void main(String[] args) {
		System.out.print("enter a character:\n");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		if(str.length()>1)
			System.out.print("invalid input\n");
		
		else{
			char c=str.charAt(0);
			
			if(c<65||c>122||(c>90&&c<97))
				System.out.print("invalid input\n");
			
			else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.print("given char is a vowel\n");
			}
			
			else
				System.out.print("given char is a consonant\n");
		}		
	}
}
