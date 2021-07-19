import java.util.*;
import java.util.Arrays;
public class Ques04 {
	public static void arraycopy(int[] a,int[] b) {
		System.out.print("ARRAYCOPY:\n");
		Scanner sx=new Scanner(System.in);
		System.out.print("enter the postion in source array:\n");
		int x=sx.nextInt();
		System.out.print("enter the postion in destination array:\n");
		int y=sx.nextInt();
		System.out.print("enter the length:\n");
		int z=sx.nextInt();
		System.arraycopy(a,x,b,y,z);
		System.out.print("resulting array 2:\n");
		for(int i=0;i<a.length;i++)
			System.out.print(b[i]+" ");
		sx.close();
	}
	public static void equal() 
	{
		System.out.print("\nEQUALS:\n");	
		String str1="hello";
		String str2="hello";
		String str3="another string";
		System.out.print("string 1 = string 2 "+str1.equals(str2)+"\n");
		System.out.print("string 1 = string 3 "+str1.equals(str3)+"\n");
	}
	public static void main(String[] args) {
		System.out.print("enter the total elements in the array:\n");	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		System.out.print("enter the elements in the array 1:\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int[] b=new int[n];
		System.out.print("enter the elements in the array 2:\n");
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		arraycopy(a,b);
		System.out.print("\nSORT:\n");
		Arrays.sort(b);
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		equal();
		System.out.print("BINARY SEARCH:\n");
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the element to search in array 1:\n");
		int g=3;
		System.out.print(g+" is found at index="+Arrays.binarySearch(a,g));
		sc.close();
		sr.close();
	}

}
