package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Studentgrade extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b1,b2,b3,b4;
	
	
	
	Studentgrade()
	{
		//getContentPane().setBackground(Color.red);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		l13=new JLabel("Insert Student Record");
		l13.setBounds(210,10,250,30);
		l13.setFont(new Font("Calibri",Font.BOLD,25));
		
		l1=new JLabel("Student ID");
		l1.setBounds(30, 70, 70,30);//x,y,H,W
		t1=new JTextField(15);
		t1.setBounds(140, 70, 100, 30);
		
		l2=new JLabel("Student Name");
		l2.setBounds(280, 70, 130, 30);
		t2=new JTextField(15);
		t2.setBounds(390, 70, 100, 30);
		
		l3=new JLabel("Standard");
		l3.setBounds(30, 110, 70, 30);
		t3=new JTextField(15);
		t3.setBounds(140, 110, 100, 30);
		
		l4=new JLabel("Section");
		l4.setBounds(280, 110, 70, 30);
		t4=new JTextField(15);
		t4.setBounds(390, 110, 100, 30);
		
		l5=new JLabel("Physics");
		l5.setBounds(30, 150, 70, 30);
		t5=new JTextField(15);
		t5.setBounds(140, 150, 100, 30);
		
		l6=new JLabel("Chemistry");
		l6.setBounds(280, 150, 70, 30);
		t6=new JTextField(15);
		t6.setBounds(390, 150, 100, 30);
		
		l7=new JLabel("Maths");
		l7.setBounds(30, 190, 70, 30);
		t7=new JTextField(15);
		t7.setBounds(140, 190, 100, 30);
		
		l8=new JLabel("English");
		l8.setBounds(280, 190, 70, 30);
		t8=new JTextField(15);
		t8.setBounds(390, 190, 100, 30);
		
		l9=new JLabel("Marathi");
		l9.setBounds(30, 230, 70, 30);
		t9=new JTextField(15);
		t9.setBounds(140, 230, 100, 30);
		
		l10=new JLabel("Total Marks");
		l10.setBounds(280, 230, 70, 30);
		t10=new JTextField(15);
		t10.setBounds(390, 230, 100, 30);
			
		l11=new JLabel("Percentage");
		l11.setBounds(30, 270, 70, 30);
		t11=new JTextField(15);
		t11.setBounds(140, 270, 100, 30);
		
		l12=new JLabel("Garde");
		l12.setBounds(280, 270, 70, 30);
		t12=new JTextField(15);
		t12.setBounds(390, 270, 100, 30);
		
		b1=new JButton("Calcluate");
		b1.setBounds(100, 320, 100, 30);
		b2=new JButton("Clear");
		b2.setBounds(220, 320, 70, 30);
		b3=new JButton("Exit");
		b3.setBounds(320, 320, 70, 30);
		b4=new JButton("Submit");
		b4.setBounds(420,320,100,30);
		
		add(l13);add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);add(l5);add(t5);
		add(l6);add(t6);add(l7);add(t7);add(l8);add(t8);add(l9);add(t9);add(l10);add(t10);
		add(l11);add(t11);add(l12);add(t12);add(b1);add(b2);add(b3);add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
		//getText()	it return the string
			if(e.getSource()==b1) {
			int id = Integer.parseInt(t1.getText()); 
			String name =t2.getText(); 
			int stan =Integer.parseInt(t3.getText()); 
			String sec =t4.getText();
			double phy = Double.parseDouble(t5.getText()); 
			double chem = Double.parseDouble(t6.getText()); 
			double maths = Double.parseDouble(t7.getText()); 
			double eng = Double.parseDouble(t8.getText());
			double mar=Double.parseDouble(t9.getText());
			
			double total=0.0d;
			total= phy + chem + maths + eng +mar; 
			
			t10.setText("" + total); 
			
			double per=0.0d; 
			per= (total / 500) * 100; 
			t11.setText("" + per); 
			String grade = null; 
			
			if (per > 90)
			{ 
			    grade = "A+"; 
			} else if ((per > 85) && (per < 90)) 
			{ 
			    grade = "A"; 
			} else if ((per > 80) && (per < 85))
			{ 
			    grade = "B+"; 
			} else if ((per > 70) && (per < 80))
			{ 
			    grade = "B"; 
			} else if ((per > 60) && (per < 70))
			{ 
			    grade = "C+"; 
			} else if ((per > 50) && (per < 60)) 
			{ 
			    grade = "C"; 
			}  else if ((per > 40) && (per < 50)) 
			{ 
			    grade = "D+"; 
			}  else if ((per > 30) && (per < 40)) 
			{ 
				    grade = "D"; 
			} else if ((per > 0) && (per < 30)) 
			{ 
			    grade = "Poor"; 
			} 
				
			
			t12.setText("" + grade); 
			}
			
			
			if(e.getSource()==b2) {
			t1.setText(""); 
			t2.setText(""); 
			t3.setText(""); 
			t4.setText(""); 
	     	t5.setText(""); 
			t6.setText(""); 
			t7.setText(""); 
			t8.setText(""); 
			t9.setText(""); 
			t10.setText("");
			t11.setText("");
		    t12.setText(""); }
			
			if(e.getSource()==b3)
			{
				System.exit(0);
			}
			
			if(e.getSource()==b4)
			{
				int id1 = Integer.parseInt(t1.getText()); 
				String name1 =t2.getText(); 
				int stan1 = Integer.parseInt(t3.getText()); 
				String sec1 =t4.getText();
				double phy1 = Double.parseDouble(t5.getText()); 
				double chem1 = Double.parseDouble(t6.getText()); 
				double maths1 = Double.parseDouble(t7.getText()); 
				double eng1 = Double.parseDouble(t8.getText());
				double mar1=Double.parseDouble(t9.getText());
				double total1=Double.parseDouble(t10.getText());
				double per1=Double.parseDouble(t11.getText());
				String grade1=t12.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grade","root","Shubham@123");
					PreparedStatement pst=con.prepareStatement("insert into studegrade values(?,?,?,?,?,?,?,?,?,?,?,?)");
					pst.setInt(1, id1);
					pst.setString(2, name1);
					pst.setInt(3, stan1);
					pst.setString(4, sec1);
					pst.setDouble(5, phy1);
					pst.setDouble(6, chem1);
					pst.setDouble(7, maths1);
					pst.setDouble(8, eng1);
					pst.setDouble(9, mar1);
					pst.setDouble(10, total1);
					pst.setDouble(11, per1);
					pst.setString(12, grade1);
					int i=pst.executeUpdate();
					JFrame f=new JFrame();
					
					JOptionPane.showMessageDialog(f, "Record Submitted Successfully");
					con.close();
					new Home();
					

					//System.out.println("Success,"+i);
					
				}
				catch(Exception ep)
				{
					System.out.println(ep);
				}
			}
			

		}
		
	public static void main(String[] args) {
	new Studentgrade();

	}


	

}
