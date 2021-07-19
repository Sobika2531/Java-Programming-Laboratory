package app;
import java.math.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame implements ActionListener{
	private JButton b;
	private JLabel reglbl,namelbl,agelbl,genlbl,addlbl;
	private JLabel lb1,lb2,lb3,lb4,lb5;
	private JTextField tfreg,tfname,tfage;
	private JComboBox<String> tfgen;
	private JTextField tfad,tf1,tf2,tf3,tf4,tf5;
	private JPanel preg,pname,page,pgen,pad;
	private JPanel p1,p2,p3,p4,p5,p6;
	private JDBC db;
	private JLabel error=null;
	private JPanel box;
	private JButton reset;
	private String[] s1 = {"not willing to say","Male","Female","Other"};
	
	MyApp(){
		preg = new JPanel((LayoutManager)new GridLayout());
		pname = new JPanel((LayoutManager)new GridLayout());
		page = new JPanel((LayoutManager)new GridLayout());
		pgen = new JPanel((LayoutManager)new GridLayout());
		p1 = new JPanel((LayoutManager)new GridLayout());
		p2 = new JPanel((LayoutManager)new GridLayout());
		p3 = new JPanel((LayoutManager)new GridLayout());
		p4 = new JPanel((LayoutManager)new GridLayout());
		p5 = new JPanel((LayoutManager)new GridLayout());
		p6 = new JPanel((LayoutManager)new GridLayout(10,1));
		pad = new JPanel((LayoutManager) new GridLayout());
		box = new JPanel();
		box.setLayout(new BoxLayout(box,BoxLayout.Y_AXIS));
		reglbl = new JLabel("Enter your registration number: ");
		tfreg = new JTextField();
		tfreg.setPreferredSize(new Dimension(160,50));
		preg.add(reglbl);
		preg.add(tfreg);
		
		namelbl = new JLabel("Enter your name: ");
		tfname = new JTextField();
		tfname.setPreferredSize(new Dimension(160,50));
		pname.add(namelbl);
		pname.add(tfname);
		
		addlbl = new JLabel("Enter your permanent address: ");
		tfad = new JTextField();
		tfad.setPreferredSize(new Dimension(160,50));
		pad.add(addlbl);
		pad.add(tfad);
		
		agelbl = new JLabel("Enter your age: ");
		tfage = new JTextField();
		tfage.setPreferredSize(new Dimension(160,50));
		page.add(agelbl);
		page.add(tfage);
		
		genlbl = new JLabel("Enter your gender: ");
		tfgen = new JComboBox<String>(s1);
		tfgen.setPreferredSize(new Dimension(160,50));
		pgen.add(genlbl);
		pgen.add(tfgen);
		
		lb1 = new JLabel("Marks obtained in the first subject: ");
		tf1 = new JTextField();
		tf1.setPreferredSize(new Dimension(150,20));
		p1.add(lb1);
		p1.add(tf1);
		lb2 = new JLabel("Marks obtained in the second subject: ");
		tf2 = new JTextField();
		tf2.setPreferredSize(new Dimension(150,20));
		p2.add(lb2);
		p2.add(tf2);
		lb3 = new JLabel("Marks obtained in the third subject: ");
		tf3 = new JTextField();
		tf3.setPreferredSize(new Dimension(150,20));
		p3.add(lb3);
		p3.add(tf3);
		lb4 = new JLabel("Marks obtained in the fourth subject: ");
		tf4 = new JTextField();
		tf4.setPreferredSize(new Dimension(150,20));
		p4.add(lb4);
		p4.add(tf4);
		lb5 = new JLabel("Marks obtained in the fifth subject: ");
		tf5 = new JTextField();
		tf5.setPreferredSize(new Dimension(150,20));
		p5.add(lb5);
		p5.add(tf5);
		b = new JButton("SUBMIT");
		this.add(preg);
		this.add(pname);
		this.add(pad);
		this.add(page);
		this.add(pgen);
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		box.add(p5);
		box.add(b);
		box.add(p6);
		this.add(box);
		db = new JDBC(p6);
		reset=new JButton("RESET");
		p6.setVisible(false);
		tf1.addActionListener(this::actionPerformed);
		b.addActionListener(this::actionPerformed);
		reset.addActionListener(this::actionPerformed);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void reseting() {
		tfname.setText("");
		tfreg.setText("");
		tfgen.setSelectedItem(s1[0]);
		tfage.setText("");
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		db.p.removeAll();
		setEditability(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(error!=null) p6.remove(error);
		p6.setVisible(false);
		try{
			
			if(e.getSource()==reset) {
				box.remove(reset);
				reseting();
				System.out.println("RESET");
				return;
			}
			
			if(e.getSource()==b && tfreg.getText().isEmpty()) {
				error = new JLabel("Register number is empty. Check once!");
				error.setSize(100,150);
				p6.add(error);
				p6.setVisible(true);
			}
			else if(e.getSource()==b && tf1.getText().isEmpty()) {
				box.add(reset);
				db.retrieve(tfreg.getText());
				p6.setVisible(true);
				setEditability(false);
			}
			else if(e.getSource()==b && !tf1.getText().isEmpty() && !tf2.getText().isEmpty()
						&& !tf3.getText().isEmpty() && !tf4.getText().isEmpty() && 
						!tf1.getText().isEmpty() && !tfreg.getText().isEmpty()) {
				try {
					int m1 = Integer.parseInt(tf1.getText());
					int m2 = Integer.parseInt(tf2.getText());
					int m3 = Integer.parseInt(tf3.getText());
					int m4 = Integer.parseInt(tf4.getText());
					int m5 = Integer.parseInt(tf5.getText());
					int age = Integer.parseInt(tfage.getText());
					Double cgpa = new BigDecimal((m1+m2+m3+m4+m5)/5.0).setScale(2,RoundingMode.HALF_UP).doubleValue();
					box.add(reset);
					db.store(tfreg.getText(), tfname.getText(), age,tfad.getText(), 
							(String)tfgen.getSelectedItem(),m1,m2,m3,m4,m5,cgpa);
					p6.setVisible(true);
					setEditability(false);
				}
				catch (IllegalArgumentException ex) {
					System.out.println("Marks can be only Numbers. Check once!");
				}
			}
			else {
				error = new JLabel("Marks cannot be empty unless you want to retrieve!");
				error.setSize(100,150);
				p6.add(error);
				p6.setVisible(true);
				System.out.println("Error...");
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void setEditability(boolean flag) {
		tfreg.setEditable(flag);
		tfname.setEditable(flag);
		tfage.setEditable(flag);
		tfgen.setEditable(flag);
		tfad.setEditable(flag);
		tf1.setEditable(flag);
		tf2.setEditable(flag);
		tf3.setEditable(flag);
		tf4.setEditable(flag);
		tf5.setEditable(flag);
		b.setEnabled(flag);
	}
}