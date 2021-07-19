package app;
import java.sql.*;
import org.postgresql.util.PSQLException;
import javax.swing.*;

public class JDBC {
	Connection con =null;
	PreparedStatement stm = null;
	String str =null;
	public JPanel p;
	
	public JDBC(JPanel p) {
		this.p=p;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","Sobika@2001");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void retrieve(String regnum) {
		try {
			str = "select * from student where regnum=?";
			stm = con.prepareStatement(str);
			stm.setString(1,regnum);
			ResultSet res = stm.executeQuery();
			if(res.next()) {
				p.add(new JLabel("Reg no: "+res.getString("regnum")));
				p.add(new JLabel("Name: "+res.getString("name")));
				p.add(new JLabel("Gender: "+res.getString("gender")));
				p.add(new JLabel("Address: "+res.getString("address")));
				p.add(new JLabel("Age: "+res.getString("age")));
				p.add(new JLabel("Mark 1: "+res.getString("mark1")));
				p.add(new JLabel("Mark 2: "+res.getString("mark2")));
				p.add(new JLabel("Mark 3: "+res.getString("mark3")));
				p.add(new JLabel("Mark 4: "+res.getString("mark4")));
				p.add(new JLabel("Mark 5: "+res.getString("mark5")));
				p.add(new JLabel("Cgpa: "+res.getString("cgpa")));
				System.out.println("Cgpa: "+ res.getString("cgpa"));
			}
			else {
				p.add(new JLabel("Error...Register number not found!"));
				System.out.println("404..not found");
			}
			stm.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void store(String regnum,String name,int age,String address,String Gender,int mark1,
			int mark2, int mark3,int mark4,int mark5,double cgpa) {
		
		try {
			str = "select * from student where regnum=?";
			stm = con.prepareStatement(str);
			stm.setString(1,regnum);
			ResultSet res = stm.executeQuery();

			if(res.next()) {
				str = "delete from student where regnum=?";
				stm = con.prepareStatement(str);
				stm.setString(1, regnum);
				stm.executeUpdate();
			}
			else 
				System.out.println("inserting the values into the database..");
		}
		catch(PSQLException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			str = "insert into student(regnum,name,age,address,gender,mark1,mark2,mark3,mark4,mark5,cgpa) values(?,?,?,?,?,?,?,?,?,?,?)";
			stm = con.prepareStatement(str);
			stm.setString(1, regnum);
			stm.setString(2, name);
			stm.setLong(3, age);
			stm.setString(4, address);
			stm.setString(5, Gender);
			stm.setLong(6, mark1);
			stm.setLong(7, mark2);
			stm.setLong(8, mark3);
			stm.setLong(9, mark4);
			stm.setLong(10, mark5);
			stm.setDouble(11, cgpa);
			stm.executeUpdate();
			retrieve(regnum);
			stm.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
