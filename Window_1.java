import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_1 extends JFrame {

	private JPanel fipa;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tf_res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 frame = new Window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		fipa = new JPanel();
		fipa.setToolTipText("Result");
		fipa.setBackground(new Color(128, 128, 255));
		fipa.setForeground(new Color(128, 128, 255));
		fipa.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fipa);
		fipa.setLayout(null);
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblCalculator.setBackground(new Color(255, 128, 0));
		lblCalculator.setBounds(184, 28, 131, 17);
		fipa.add(lblCalculator);
		
		JLabel lb_a = new JLabel("A");
		lb_a.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lb_a.setBackground(new Color(128, 128, 255));
		lb_a.setBounds(139, 45, 19, 55);
		fipa.add(lb_a);
		
		JLabel lb_b = new JLabel("B");
		lb_b.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		lb_b.setBackground(new Color(128, 128, 255));
		lb_b.setBounds(139, 92, 19, 44);
		fipa.add(lb_b);
		
		tfa = new JTextField();
		tfa.setBounds(184, 64, 96, 19);
		fipa.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(184, 103, 96, 19);
		fipa.add(tfb);
		
		tf_res = new JTextField();
		tf_res.setColumns(10);
		tf_res.setBounds(184, 144, 96, 19);
		fipa.add(tf_res);
		
		JLabel lb_res = new JLabel("Result");
		lb_res.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lb_res.setBackground(new Color(128, 128, 255));
		lb_res.setBounds(108, 146, 50, 17);
		fipa.add(lb_res);
		
		JButton badd = new JButton("Add");
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String var1=tfa.getText();
				String var2=tfb.getText();
				float a=Float.valueOf(var1);
				float b=Float.valueOf(var2);
				float res=a+b;
				String result=String.valueOf(res);
				tf_res.setText(result);
				
				
			}
		});
		badd.setBounds(10, 199, 51, 21);
		fipa.add(badd);
		
		JButton sub = new JButton("Sub");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String var1=tfa.getText();
				String var2=tfb.getText();
				int a=Integer.valueOf(var1);
				int b=Integer.valueOf(var2);
				int res=a-b;
				String result=String.valueOf(res);
				tf_res.setText(result);
			}
		});
		sub.setBounds(94, 199, 59, 21);
		fipa.add(sub);
		
		JButton Mul = new JButton("Mul");
		Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String var1=tfa.getText();
				String var2=tfb.getText();
				int a=Integer.valueOf(var1);
				int b=Integer.valueOf(var2);
				int res=a*b;
				String result=String.valueOf(res);
				tf_res.setText(result);
			}
		});
		Mul.setBounds(184, 199, 59, 21);
		fipa.add(Mul);
		
		JButton div = new JButton("Div");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.valueOf(tfa.getText());
				float b=Float.valueOf(tfb.getText());
				String result=String.valueOf(a/b);
				tf_res.setText(result);
			}
		});
		div.setBounds(269, 199, 59, 21);
		fipa.add(div);
		
		JButton reset = new JButton("Mod");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String var1=tfa.getText();
				String var2=tfb.getText();
				int a=Integer.valueOf(var1);
				int b=Integer.valueOf(var2);
				int res=a%b;
				String result=String.valueOf(res);
				tf_res.setText(result);
			}
		});
		reset.setBounds(355, 199, 59, 21);
		fipa.add(reset);
	}
}
