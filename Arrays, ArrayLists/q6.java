import java.util.*;
public class Ques06 {
	public static void main(String[] args) {
		System.out.print("enter the total no. of employees:\n");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[][] hours=new int[a][7];
		int temp;
		int[] emp=new int[a];
		int[] tot=new int[a];		
		for(int i=0;i<a;i++) {
			System.out.print("enter the no. of work hours for employee "+(i+1)+" for seven days:\n");
			emp[i]=i;
			for(int j=0;j<7;j++) {
					hours[i][j]=sc.nextInt();
					tot[i]+=hours[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(tot[j]>tot[i])
				{
					temp=tot[i];
					tot[i]=tot[j];
					tot[j]=temp;
					
					temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		System.out.print("\nemployees in decreasing order of their total working hours:\n");
		for(int i=0;i<a;i++)
			System.out.print("employee "+emp[i]+": "+tot[i]+"\n");
		sc.close();
	}
}
