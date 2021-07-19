import java.util.*;
public class Ques03 {
	public static int[] remdup(int a[]){
		int y=a.length;
		if(y==0||y==1)			return a;
		int[] temp=new int[y];
		int j=0;
		for(int i=0;i<y-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
		}}
		temp[j++]=a[y-1];
		int[] b=new int[j];
		for(int i=0;i<j;i++)
			b[i]=temp[i];
		return b;
	}
	public static void main(String[] args) {
		System.out.print("enter the total elements in the array:\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		System.out.print("enter the elements in the array:\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int[] b=remdup(a);
		System.out.print("resulting array:\n");
		int x=b.length;
		for(int i=0;i<x;i++)
			System.out.print(b[i]+" ");
		sc.close();
}}