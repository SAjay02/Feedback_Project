package feedback;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
public class four extends JFrame implements ActionListener {
	JFrame f = new JFrame();
JLabel j,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13;
JButton b1,b2,b;
JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29,r30,r31,r32,r33,r34,r35,r36,r37,r38,r39,r40;
ButtonGroup bb,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9;
Connection co;
Statement st=null;
ResultSet rs=null;
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
public four()
{
	connect();
//	super("FEEDBACK FORM");
	setSize(1500,1500);
	setLayout(null);
	setVisible(true);
	getContentPane().setBackground(new Color(135,206,235));
	j = new JLabel("QUESTIONS FOR CIRCUITS");
	j.setBounds(470,5,280,60);
	j.setFont(new Font("serif",Font.BOLD,20));
    add(j);
    j1=new JLabel("1) HOW WAS YOUR FACULTY TEACHING?");
    j1.setBounds(40,100,400,20);
    j1.setFont(new Font("serif",Font.BOLD,18));
    add(j1);
    bb=new ButtonGroup();
    r1=new JRadioButton("5");
    r1.setBounds(850,100,33,16);
    add(r1);
    bb.add(r1);
    r2=new JRadioButton("4");
    r2.setBounds(970,100,33,16);
    add(r2);
    bb.add(r2);
    r3=new JRadioButton("3");
    r3.setBounds(1080,100,33,16);
    add(r3);
    bb.add(r3);
    r4=new JRadioButton("2");
    r4.setBounds(1190,100,33,16);
    add(r4);
    bb.add(r4);
    j2=new JLabel("2) IS YOUR FACULTY CLARIFYING YOUR DOUBTS INSIDE THE CLASS?");
    j2.setBounds(40,140,700,20);
    j2.setFont(new Font("serif",Font.BOLD,18));
    add(j2);
    bb1=new ButtonGroup();
    r5=new JRadioButton("5");
    r5.setBounds(850,140,33,16);
    add(r5);
    bb1.add(r5);
    r6=new JRadioButton("4");
    r6.setBounds(970,140,33,16);
    add(r6);
    bb1.add(r6);
    r7=new JRadioButton("3");
    r7.setBounds(1080,140,33,16);
    add(r7);
    bb1.add(r7);
    r8=new JRadioButton("2");
    r8.setBounds(1190,140,33,16);
    add(r8);
    bb1.add(r8);
    j3=new JLabel("3) IS YOUR FACULTY SHARE ANY MATERIALS ON CLASSROOM?");
    j3.setBounds(40,180,700,20);
    j3.setFont(new Font("serif",Font.BOLD,18));
    add(j3);
    bb2=new ButtonGroup();
    r9=new JRadioButton("5");
    r9.setBounds(850,180,33,16);
    add(r9);
    bb2.add(r9);
    r10=new JRadioButton("4");
    r10.setBounds(970,180,33,16);
    add(r10);
    bb2.add(r10);
    r11=new JRadioButton("3");
    r11.setBounds(1080,180,33,16);
    add(r11);
    bb2.add(r11);
    r12=new JRadioButton("2");
    r12.setBounds(1190,180,33,16);
    add(r12);
    bb2.add(r12);
    j4=new JLabel("4) HOW WAS YOUR FACULTY HANDWRITING ON THE BOARD?");
    j4.setBounds(40,220,700,20);
    j4.setFont(new Font("serif",Font.BOLD,18));
    add(j4);
    bb3=new ButtonGroup();
    r13=new JRadioButton("5");
    r13.setBounds(850,220,33,16);
    add(r13);
    bb3.add(r13);
    r14=new JRadioButton("4");
    r14.setBounds(970,220,33,16);
    add(r14);
    bb3.add(r14);
    r15=new JRadioButton("3");
    r15.setBounds(1080,220,33,16);
    add(r15);
    bb3.add(r15);
    r16=new JRadioButton("2");
    r16.setBounds(1190,220,33,16);
    add(r16);
    bb3.add(r16);
    j5=new JLabel("5) IS YOUR FACULTY CLARIFYING YOUR DOUBTS OUTSIDE THE CLASS?");
    j5.setBounds(40,260,700,20);
    j5.setFont(new Font("serif",Font.BOLD,18));
    add(j5);
    bb4=new ButtonGroup();
    r17=new JRadioButton("5");
    r17.setBounds(850,260,33,16);
    add(r17);
    bb4.add(r17);
    r18=new JRadioButton("4");
    r18.setBounds(970,260,33,16);
    add(r18);
    bb4.add(r18);
    r19=new JRadioButton("3");
    r19.setBounds(1080,260,33,16);
    add(r19);
    bb4.add(r19);
    r20=new JRadioButton("2");
    r20.setBounds(1190,260,33,16);
    add(r20);
    bb4.add(r20);
    j6=new JLabel("6) IS YOUR FACULTY SUGGEST ANY BOOKS REGARDING SUBJECT?");
    j6.setBounds(40,300,700,20);
    j6.setFont(new Font("serif",Font.BOLD,18));
    add(j6);
    bb5=new ButtonGroup();
    r21=new JRadioButton("5");
    r21.setBounds(850,300,33,16);
    add(r21);
    bb5.add(r21);
    r22=new JRadioButton("4");
    r22.setBounds(970,300,33,16);
    add(r22);
    bb5.add(r22);
    r23=new JRadioButton("3");
    r23.setBounds(1080,300,33,16);
    add(r23);
    bb5.add(r23);
    r24=new JRadioButton("2");
    r24.setBounds(1190,300,33,16);
    add(r24);
    bb5.add(r24);
    j7=new JLabel("7) HOW WAS YOUR FACULTY CONTROLLING THE STUDENTS INSIDE THE CLASS?");
    j7.setBounds(40,340,760,20);
    j7.setFont(new Font("serif",Font.BOLD,18));
    add(j7);
    bb6=new ButtonGroup();
    r25=new JRadioButton("5");
    r25.setBounds(850,340,33,16);
    add(r25);
    bb6.add(r25);
    r26=new JRadioButton("4");
    r26.setBounds(970,340,33,16);
    add(r26);
    bb6.add(r26);
    r27=new JRadioButton("3");
    r27.setBounds(1080,340,33,16);
    add(r27);
    bb6.add(r27);
    r28=new JRadioButton("2");
    r28.setBounds(1190,340,33,16);
    add(r28);
    bb6.add(r28);
    j8=new JLabel("8) IS YOUR FACULTY TELL ANY REAL TIME EXAMPLE REGARDING SUBJECT?");
    j8.setBounds(40,380,750,20);
    j8.setFont(new Font("serif",Font.BOLD,18));
    add(j8);
    bb7=new ButtonGroup();
    r29=new JRadioButton("5");
    r29.setBounds(850,380,33,16);
    add(r29);
    bb7.add(r29);
    r30=new JRadioButton("4");
    r30.setBounds(970,380,33,16);
    add(r30);
    bb7.add(r30);
    r31=new JRadioButton("3");
    r31.setBounds(1080,380,33,16);
    add(r31);
    bb7.add(r31);
    r32=new JRadioButton("2");
    r32.setBounds(1190,380,33,16);
    add(r32);
    bb7.add(r32);
    j9=new JLabel("9) IS YOUR FACULTY COME INTO THE CLASS ON TIME?");
    j9.setBounds(40,420,700,20);
    j9.setFont(new Font("serif",Font.BOLD,18));
    add(j9);
    bb8=new ButtonGroup();
    r33=new JRadioButton("5");
    r33.setBounds(850,420,33,16);
    add(r33);
    bb8.add(r33);
    r34=new JRadioButton("4");
    r34.setBounds(970,420,33,16);
    add(r34);
    bb8.add(r34);
    r35=new JRadioButton("3");
    r35.setBounds(1080,420,33,16);
    add(r35);
    bb8.add(r35);
    r36=new JRadioButton("2");
    r36.setBounds(1190,420,33,16);
    add(r36);
    bb8.add(r36);
    j10=new JLabel("10) IS YOUR FACULTY GIVE MORE WORKLOADS FOR DAILY?");
    j10.setBounds(40,460,700,20);
    j10.setFont(new Font("serif",Font.BOLD,18));
    add(j10);
    bb9=new ButtonGroup();
    r37=new JRadioButton("5");
    r37.setBounds(850,460,33,16);
    add(r37);
    bb9.add(r37);
    r38=new JRadioButton("4");
    r38.setBounds(970,460,33,16);
    add(r38);
    bb9.add(r38);
    r39=new JRadioButton("3");
    r39.setBounds(1080,460,33,16);
    add(r39);
    bb9.add(r39);
    r40=new JRadioButton("2");
    r40.setBounds(1190,460,33,16);
    add(r40);
    bb9.add(r40);
    b1=new JButton("SUBMIT");
    b1.setBounds(400,510,170,50);
    b1.setBackground(Color.lightGray);
    b1.setForeground(Color.BLACK);
    b1.setFont(new Font("serif",Font.BOLD,18));
    add(b1);
    b2=new JButton("ANY SUGGESTIONS?");
    b2.setBounds(580,510,230,50);
    b2.setBackground(Color.lightGray);
    b2.setForeground(Color.BLACK);
    b2.setFont(new Font("serif",Font.BOLD,18));
    add(b2);
    b=new JButton("NEXT");
    b.setBounds(240,510,150,50);
    b.setBackground(Color.lightGray);
    b.setForeground(Color.BLACK);
    b.setFont(new Font("serif",Font.BOLD,18));
    add(b);
    b2.addActionListener(this);
    b1.addActionListener(this);
    j11=new JLabel("EXCELLENT");
    j11.setBounds(810,30,160,60);
    j11.setFont(new Font("serif",Font.BOLD,18));
    add(j11);
    j12=new JLabel("GOOD");
    j12.setBounds(960,30,100,60);
    j12.setFont(new Font("serif",Font.BOLD,18));
    add(j12);
    j13=new JLabel("AVERAGE");
    j13.setBounds(1050,30,150,60);
    j13.setFont(new Font("serif",Font.BOLD,18));
    add(j13);
    j13=new JLabel("POOR");
    j13.setBounds(1180,30,100,60);
    j13.setFont(new Font("serif",Font.BOLD,18));
    add(j13);
    b.addActionListener(this);
    
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String rev1=null;
	if(r1.isSelected()) {
		rev1="Excellent";
	}else if(r2.isSelected()) {
		rev1="Good";
    }else if(r3.isSelected()) {
    	rev1="Average";
    }else if(r4.isSelected()){
    	rev1="Poor";
    }
	
	String rev2=null;
	if(r5.isSelected()) {
		rev2="Excellent";
	}else if(r6.isSelected()) {
		rev2="Good";
    }else if(r7.isSelected()) {
    	rev2="Average";
    }else if(r8.isSelected()){
    	rev2="Poor";
    }
	String rev3=null;
	if(r9.isSelected()) {
		rev3="Excellent";
	}else if(r10.isSelected()) {
		rev3="Good";
    }else if(r11.isSelected()) {
    	rev3="Average";
    }else if(r12.isSelected()){
    	rev3="Poor";
    }
	String rev4=null;
	if(r13.isSelected()) {
		rev4="Excellent";
	}else if(r14.isSelected()) {
		rev4="Good";
    }else if(r15.isSelected()) {
    	rev4="Average";
    }else if(r16.isSelected()){
    	rev4="Poor";
    }
	String rev5=null;
	if(r17.isSelected()) {
		rev5="Excellent";
	}else if(r18.isSelected()) {
		rev5="Good";
    }else if(r19.isSelected()) {
    	rev5="Average";
    }else if(r20.isSelected()){
    	rev5="Poor";
    }
	String rev6=null;
	if(r21.isSelected()) {
		rev6="Excellent";
	}else if(r22.isSelected()) {
		rev6="Good";
    }else if(r23.isSelected()) {
    	rev6="Average";
    }else if(r24.isSelected()){
    	rev6="Poor";
    }
	String rev7=null;
	if(r25.isSelected()) {
		rev7="Excellent";
	}else if(r26.isSelected()) {
		rev7="Good";
    }else if(r27.isSelected()) {
    	rev7="Average";
    }else if(r28.isSelected()){
    	rev7="Poor";
    }
	String rev8=null;
	if(r29.isSelected()) {
		rev8="Excellent";
	}else if(r30.isSelected()) {
		rev8="Good";
    }else if(r31.isSelected()) {
    	rev8="Average";
    }else if(r32.isSelected()){
    	rev8="Poor";
    }
	String rev9=null;
	if(r33.isSelected()) {
		rev9="Excellent";
	}else if(r34.isSelected()) {
		rev9="Good";
    }else if(r35.isSelected()) {
    	rev9="Average";
    }else if(r36.isSelected()){
    	rev9="Poor";
    }
	String rev10=null;
	if(r37.isSelected()) {
		rev10="Excellent";
	}else if(r38.isSelected()) {
		rev10="Good";
    }else if(r39.isSelected()) {
    	rev10="Average";
    }else if(r40 .isSelected()){
    	rev10="Poor";
    }
	try {
	if(e.getSource().equals(b1))
	{
		
		String qry="Select rollnumber from registration where rollnumber=";
		Statement st=co.createStatement();
		rs=st.executeQuery(qry);
		if(rs.next()) {
			String c=rs.getString("rollnumber");
		
		String query="insert into circuits(first_name,rev1,rev2,rev3,rev4,rev5,rev6,rev7,rev8,rev9,rev10)values(?,?,?,?,?,?,?,?,?,?,?)";
		ps=co.prepareStatement(query);
		ps.setString(1,c);
		ps.setString(2,rev1);
		ps.setString(3,rev2);
		ps.setString(4,rev3);
		ps.setString(5,rev4);
		ps.setString(6,rev5);
		ps.setString(7,rev6);
		ps.setString(8,rev7);
		ps.setString(9,rev8);
		ps.setString(10,rev9);
		ps.setString(11,rev10);
		ps.executeUpdate();
		JOptionPane.showMessageDialog(b1,"Thanks For Feedback");
		}
    }
	}catch(SQLException e1)
	{
		e1.printStackTrace();
	}
	
	
	/*if(e.getSource().equals(b1)) {
		 	try {
			String qry="Select first_name from registration";
			Statement st=co.createStatement();
		ResultSet rs=st.executeQuery(qry);
			if(rs.next()) {
				String c=rs.getString("first_name");
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
/*	if(e.getSource().equals(b1))
	{
		JOptionPane.showMessageDialog(b1,"Thanks For Feedback");
	}*/
	if(e.getSource().equals(b2))
	{
		this.add(new login3());
	}if(e.getSource().equals(b))
	{
		this.add(new subject());
	}
}

}
