package feedback;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class login3 extends JFrame {
	JTextField t1;
	JLabel l;
	public login3()
	{
		super("SUGGESTION");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		l = new JLabel("SUGGESTIONS");
		l.setBounds(10,30,200,20);
		l.setFont(new Font("serif",Font.BOLD,20));
		add(l);
		t1=new JTextField();
		t1.setBounds(50,70,400,35);
		add(t1);
	}
}
