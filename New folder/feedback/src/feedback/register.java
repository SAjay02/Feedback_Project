package feedback;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class register extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	JComboBox c;
	JTextField j,j1,j2,j3,j4,j5,j6;
	JComboBox a;
	JPasswordField p,p1;
	JButton b,b1;
	Connection co;
	PreparedStatement ps=null;
	void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String u="jdbc:mysql://localhost:3306/ajay";
			String a="root";
			String b="";
			co=DriverManager.getConnection(u,a,b);
			System.out.println("CONNECTED");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public register()
	{
		
	connect();
		//super("Registration Page");
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.orange);
		l7= new JLabel("REGISTRATION");
		l7.setBounds(420,15,250,150);
		l7.setFont(new Font("serif",Font.BOLD,23));
		add(l7);
		l= new JLabel("FIRST NAME");
		l.setBounds(320,70,250,150);
		l.setFont(new Font("serif",Font.BOLD,20));
		add(l);
		j = new JTextField();
		j.setBounds(550,132,160,24);
		add(j);
		l1= new JLabel("LAST NAME");
		l1.setBounds(320,110,250,150);
		l1.setFont(new Font("serif",Font.BOLD,20));
		add(l1);
		j1 = new JTextField();
		j1.setBounds(550,170,160,24);
		add(j1);
		l2= new JLabel("ROLL NUMBER");
		l2.setBounds(320,150,250,150);
		l2.setFont(new Font("serif",Font.BOLD,20));
		add(l2);
		j2 = new JTextField();
		j2.setBounds(550,210,160,24);
		add(j2);
		l3= new JLabel("EMAIL-ID");
		l3.setBounds(320,190,250,150);
		l3.setFont(new Font("serif",Font.BOLD,20));
		add(l3);
		j3 = new JTextField();
		j3.setBounds(550,250,160,24);
		add(j3);
		
	    String a[]= {" ","EEE","CSE","IT","ECE","AI","MECH"};
	    c=new JComboBox(a);
	    c.setBounds(550,292,160,24);
	    add(c);
		l4= new JLabel("DEPARTMENT");
		l4.setBounds(320,230,250,150);
		l4.setFont(new Font("serif",Font.BOLD,20));
		add(l4);
		
		l5= new JLabel("PASSWORD");
		l5.setBounds(320,270,250,150);
		l5.setFont(new Font("serif",Font.BOLD,20));
		add(l5);
		p= new JPasswordField();
		p.setBounds(550,330,160,24);
		add(p);
		l8= new JLabel("RE-TYPE PASSWORD");
		l8.setBounds(320,310,250,150);
		l8.setFont(new Font("serif",Font.BOLD,20));
		add(l8);
		p1= new JPasswordField();
		p1.setBounds(550,372,160,24);
		add(p1);
		b=new JButton("REGISTER");
		b.setFont(new Font("serif",Font.BOLD,23));
		b.setBounds(335,430,200,47);
	    b.addActionListener(this);
	    add(b);
		b1=new JButton("NEXT");
		b1.setFont(new Font("serif",Font.BOLD,23));
		b1.setBounds(540,430,160,47);
		add(b1);
	    b1.addActionListener(this);
	    
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        String fname=j.getText();	
        String lname=j1.getText();
        String roll=j2.getText();
        String mail=j3.getText();
        String dept=c.getSelectedItem().toString();
		String pass=p.getText();
	    String repass=p1.getText();
	    if(e.getSource().equals(b))
		{
	    	if(pass.contentEquals(repass)) {
		String query="insert into registration(first_name,last_name,rollnumber,email_id,dept,password,retype_pass)values(?,?,?,?,?,?,?)";	
	    try {
			ps=co.prepareStatement(query);
			ps.setString(1,fname);
			ps.setString(2,lname);
			ps.setString(3,roll);
			ps.setString(4,mail);
			ps.setString(5,dept);
			ps.setString(6,pass);
			ps.setString(7,repass);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(b,"REGISTERED SUCCESSFULLY");
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    	}else {
	    		JOptionPane.showMessageDialog(b,"Incorrect password");
	    	}
	    }
	    
		if(e.getSource().equals(b1))
		{
			this.add(new loginpage(null));
		}
		
	}
}
