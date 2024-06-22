package Project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Search extends JFrame implements ActionListener {
	
	JLabel l1,l13;
	JTextField t1;
	JButton b1;
	
	Search()
	{
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		//this.getContentPane().setBackground(Color.yellow);
		l13=new JLabel("Search Student Record");
		l13.setBounds(90,10,350,30);
		l13.setFont(new Font("Calibri",Font.BOLD,25));
		
		l1=new JLabel("Student ID");
		l1.setBounds(30, 70, 70,30);//x,y,H,W
		t1=new JTextField(15);
		t1.setBounds(140, 70, 100, 30);
		
		
		b1=new JButton("Find");
		b1.setBounds(140, 120, 100, 30);
		
		
		
		add(l13);add(l1);add(t1);
		add(b1);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
		 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grade","root","Shubham@123");
				PreparedStatement pst=con.prepareStatement("select * from studegrade where id=?");
				pst.setInt(1, Integer.parseInt(t1.getText()));
				ResultSet rs=pst.executeQuery();
				JFrame f=new JFrame();
				if(rs.next())
				{
					
					JOptionPane.showMessageDialog(f,"name= "+rs.getString(2)+",stan= "+ rs.getInt(3)+",sec="+rs.getString(4)+",phy= "+rs.getDouble(5)+",chemi= "+
					rs.getDouble(6)+",maths= "+rs.getDouble(7)+",eng= "+rs.getDouble(8)+",mar= "+rs.getDouble(9)+",total= "+rs.getDouble(10)+",per= "+rs.getDouble(11)+",grade= "+rs.getString(12));

					
					
					JOptionPane.showMessageDialog(f, "Search Successfully");
				}
				else {
					JOptionPane.showMessageDialog(f,"Record is no not found");
				}
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
		new Search();

	}
	

}
