package p1;

import java.net.*;
import java.io.IOException;
import java.io.*;

public class Server implements Serializable{
	public static int uid=0;
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(4444);
		
		while(true) {
			Socket s;
			
			try {
				s= ss.accept();
				System.out.println("Connection established with the client");
				
				ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				ClientHandler ch = new ClientHandler(s,dis,dos);
				ch.start();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
