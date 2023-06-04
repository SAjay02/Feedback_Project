package feedback;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class subject extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6;
	JLabel f;
	public subject()
	{
		super("Registration Page");
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.orange);
		f=new JLabel("SELECT SUBJECTS ON ONE BY ONE");
		f.setBounds(260,60,600,50);
		f.setFont(new Font("serif",Font.ROMAN_BASELINE,25));
		add(f);
		b1=new JButton("MATHS");
		b1.setFont(new Font("serif",Font.ITALIC,26));
		b1.setBounds(200,200,160,47);
		add(b1);
		b2=new JButton("JAVA");
		b2.setFont(new Font("serif",Font.ITALIC,26));
		b2.setBounds(400,200,160,47);
		add(b2);
		b3=new JButton("DBMS");
		b3.setFont(new Font("serif",Font.ITALIC,26));
		b3.setBounds(600,200,160,47);
		add(b3);
		b4=new JButton("CIRCUITS");
		b4.setFont(new Font("serif",Font.ITALIC,26));
		b4.setBounds(200,330,160,47);
		add(b4);
		b5=new JButton("DIGITAL");
		b5.setFont(new Font("serif",Font.ITALIC,26));
		b5.setBounds(400,330,160,47);
		add(b5);
		b6=new JButton("INDIAN");
		b6.setFont(new Font("serif",Font.ITALIC,26));
		b6.setBounds(600,330,160,47);
		add(b6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b1))
		{
			this.add(new login2());
		}
		if(e.getSource().equals(b2))
		{
			this.add(new two());
		}
		if(e.getSource().equals(b3))
		{
			this.add(new three());
		}
		if(e.getSource().equals(b4))
		{
			this.add(new four());
		}
		if(e.getSource().equals(b5))
		{
			this.add(new five());
		}
		if(e.getSource().equals(b6))
		{
			this.add(new six());
		}
	}
}


