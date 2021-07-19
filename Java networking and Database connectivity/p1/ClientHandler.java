package p1;

import java.net.*;
import java.io.*;
import java.util.*;
import p2.ClientData;
import java.sql.*;

public class ClientHandler extends Thread {
	private Scanner input;
	private Socket s;
	private ObjectInputStream dis;
	private DataOutputStream dos;

	
	ClientHandler(Socket s,ObjectInputStream dis,DataOutputStream dos){
		this.s = s;
		this.dis = dis;
		this.dos = dos;
		this.input = new Scanner(System.in);
	}
	
	@Override
	public void run() {
		System.out.println();
		while(true){
			try {
				ClientData data = (ClientData)dis.readObject();			
				if(data.getName().equals("exit")) {
					System.out.println("Exiting.......");
					dis.close();
					dos.close();
					s.close();
					break;
				}
				System.out.print("Client details:\tLender name: "+data.getName()+"\n\tLibrary Name: "+data.getLib()+"\n\tList of book ids :");
				ArrayList<Integer> haha = data.getArray();
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","Sobika@2001");
				//if(con!=null) System.out.println("Connection established...");
				

				String hehe = "insert into library(lender,library,book) values(?,?,?)";
				PreparedStatement p = con.prepareStatement(hehe);
				
				for(int i=0;i<haha.size();i++) {
					
					p.setString(1,data.getName());
					p.setString(2,data.getLib());
					p.setString(3,haha.get(i)+"");
					p.executeUpdate();
					System.out.print(haha.get(i)+" ");
				}

				System.out.println();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				System.out.println("Wrong Class. check it once");
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.print("Enter a message: ");
			try {
				String str = "Successfully Saved.....";
				dos.writeUTF(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
