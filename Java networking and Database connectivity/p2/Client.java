package p2;

import java.util.*;
import java.net.*;
import java.io.*;
public class Client implements Serializable {	
	private static InetAddress ip=null;
	private static Socket s=null;
	private static DataInputStream dis=null;
	private static ObjectOutputStream dos=null;
	
	public static void sendtoserver(String lender,String library,ArrayList<Integer> arr) throws IOException {
		ClientData data=new ClientData(lender,library,arr);
		dos.writeObject(data);
	}
	
	public static void main(String[] args) throws IOException {

		ip =  InetAddress.getByName("localhost");
		s = new Socket(ip,4444);
		dis = new DataInputStream(s.getInputStream());
		dos = new ObjectOutputStream(s.getOutputStream());

		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.print("Enter the name of the lender (to quit enter 'exit'): ");
			String lender= input.next();
			if(lender.equals("exit")) {
				System.out.println("Exiting.....");
				ClientData data= new ClientData(lender,"");
				dos.writeObject(data);
				dis.close();
				dos.close();
				s.close();
				break;
			}
			System.out.print("Enter the name of the library: ");
			String library = input.next();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			while(true) {
				try {
					System.out.print("Enter the book_id (to quit enter -1): ");
					int i = input.nextInt();
					if(i==-1) break;
					if(i>0){
						arr.add(i);
					}
					else throw new IllegalArgumentException();
				}
				catch(InputMismatchException e) {
					System.out.println("only integers are allowed..check your book_id");
				}
				catch(IllegalArgumentException e) {
					System.out.println("Numbers can't be negative.enter valid one");
				}
			}
			ClientData data= new ClientData(lender,library,arr);
			dos.writeObject(data);
		}
		input.close();
	}
}
