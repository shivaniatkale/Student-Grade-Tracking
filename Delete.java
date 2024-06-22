package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Delete extends JFrame implements ActionListener{
  JLabel l1,l2;
  JTextField t1;
  JButton b1;
  Studentgrade s;
  Delete(){
	    setLayout(null);
		setSize(300,300);
		setVisible(true);
		//this.getContentPane().setBackground(Color.cyan);
		l1=new JLabel("Delete Record");
		l1.setBounds(110,10,350,30);
		l1.setFont(new Font("Calibri",Font.BOLD,25));
		
		l2=new JLabel("Student ID");
		l2.setBounds(30, 70, 70,30);//x,y,H,W
		t1=new JTextField(15);
		t1.setBounds(140, 70, 100, 30);
		b1=new JButton("Delete");
		b1.setBounds(100, 150, 100, 30);
		add(l1);add(l2);add(t1);add(b1);
		b1.addActionListener(this);
  }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			int id = Integer.parseInt(t1.getText()); 
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grade","root","Shubham@123");
				PreparedStatement pst=con.prepareStatement("delete from studegrade where id=?");
				pst.setInt(1, id);
				int i=pst.executeUpdate();
				JFrame f=new JFrame();
				JOptionPane.showMessageDialog(f, "Record Deleted Successfully");
				con.close();
				
				new Home();
				
			}
			catch(Exception ep)
			{
				System.out.println(ep);
			}
		}
		
	}

	public static void main(String[] args) {
		new Delete();

	}

	
}
