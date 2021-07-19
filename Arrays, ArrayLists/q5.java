import java.util.*;
public class Ques05 {
	public static void partition(int[] a) {
		int pivot=a[0],count=0;
		ArrayList<Integer> one=new ArrayList<Integer>();
		ArrayList<Integer> two=new ArrayList<Integer>();
		for(int i=1;i<a.length;i++) {
			if(a[i]<=pivot)
				one.add(a[i]);
			else
				two.add(a[i]);
		}
		for(int i=0;i<one.size();i++)
			a[count++]=one.get(i);
		a[count++]=pivot;
		for(int i=0;i<two.size();i++)
			a[count++]=two.get(i);
	}
	public static void main(String[] args) {
		System.out.print("enter the total elements in the array:\n");	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		System.out.print("enter the elements in the array:\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		partition(a);
		System.out.print("after partitioning\n");
		for(int i:a)
			System.out.print(i+" ");
		sc.close();
	}
}
