package Project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener{
	JLabel l1;
	JTextField t1;
	JButton b1,b2,b3,b4;
	Home()
	{
		//setLayout(new FlowLayout());
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		
		this.getContentPane().setBackground(Color.pink);
		l1=new JLabel("Student Garde Tracker");
		l1.setBounds(120,10,250,30);
		l1.setFont(new Font("Calibri",Font.BOLD,25));
		b1=new JButton("Insert");
		b1.setBounds(100, 70, 100, 30);
		b2=new JButton("Upadte");
		b2.setBounds(300, 70, 100, 30);
		b3=new JButton("Delete");
		b3.setBounds(100, 150, 100, 30);
		b4=new JButton("Search");
		b4.setBounds(300, 150, 100, 30);
		add(l1);add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			new Studentgrade();
			
		}
		if(e.getSource()==b2)
		{
			new Upadte();
		}
		if(e.getSource()==b3)
		{
			new Delete();
		}
		if(e.getSource()==b4)
		{
			
			new Search();
		}
		
	}
	public static void main(String[] args) {
		new Home();

	}
	

}
