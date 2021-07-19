package q2;

public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer,String> pair1=new Pair<Integer,String>(111,"Sobika");
		System.out.print("displaying pair 1: \n");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecond());
		
		pair1.setFirst(25);
		pair1.setSecond("Revathi");
		
		System.out.print("\nafter changing: \n");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecond());
		
		Pair<Double,String> pair2=new Pair<Double,String>(34.67,"Senthil");
		System.out.print("\n\ndisplaying pair 2: \n");
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
		
		pair2.setFirst(25.78);
		pair2.setSecond("Nitish");
		
		System.out.print("\nafter changing: \n");
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
		
	}

}
