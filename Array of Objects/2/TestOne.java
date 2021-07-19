package tues08;

public class TestOne {

	public static void getOne()
	{
		int x,y,z;
		One obj=new One();
		
		System.out.print("the class One can be accessed\n");
		
		x=obj.x;
		System.out.print("x="+x+"\n");
		
		y=obj.y;
		System.out.print("y="+y+"\n");
		
		//z=obj.z;
		System.out.print("cannot access z\n");
		
		obj.u();
		System.out.print("u() called successfully\n");
		
		obj.w();
		System.out.print("w() called successfully\n");
		
		//obj.v();
		System.out.print("failed to call v()\n");
	}
	
	public static void getTwo()
	{
		int x,y,z;
		Two obj=new Two();
		
		System.out.print("\nthe class Two can be accessed\n");
		
		x=obj.x;
		System.out.print("x="+x+"\n");
		
		y=obj.y;
		System.out.print("y="+y+"\n");
		
		//z=obj.z;
		System.out.print("cannot access z\n");
		
		obj.u();
		System.out.print("u() called successfully\n");
		
		obj.w();
		System.out.print("w() called successfully\n");
		
		//obj.v();
		System.out.print("failed to access v()\n");
	}
	
	public static void main(String[] args) {
		getOne();
		getTwo();
	}
}
