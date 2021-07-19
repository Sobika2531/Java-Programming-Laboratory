import java.util.*;
public class Ques02 {
	public static void shift(int a[]) {
		System.out.print("enter the no. of shifts:\n");	
		Scanner st=new Scanner(System.in);
		int x=st.nextInt();
		for(int i=0;i<x;i++) {
			int j,temp;
			int n=a.length;
			temp=a[n-1];
			for(j=n-2;j>=0;j--) {
				a[j+1]=a[j];
			}
			a[0]=temp;
		}
		System.out.print("resulting array after "+x+" rotations:\n");
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		st.close();
	}
	public static void main(String[] args) {
		System.out.print("enter the total elements in the array:\n");	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		System.out.print("enter the elements in the array:\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		shift(a);
		sc.close();
	}
}
