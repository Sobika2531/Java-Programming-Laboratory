package p2;

import java.io.Serializable;
import java.util.ArrayList;
import p1.Server;

public class ClientData implements Serializable{
	private String lib;
	private String lender;
	private ArrayList<Integer> list;
	
	public ClientData(String name,String lib){
		this.lib = lib;
		this.lender = name;
		list = new ArrayList<Integer>();
	}
	public ClientData(String name,String lib,ArrayList<Integer> arr){
		this(name,lib);
		for(int i=0;i<arr.size();i++) {
			list.add(arr.get(i));
		}
	}
	public String getName() {
		return this.lender;
	}
	
	public String getLib() {
		return this.lib;
	}
	
	public ArrayList<Integer> getArray(){
		return this.list;
	}

}
