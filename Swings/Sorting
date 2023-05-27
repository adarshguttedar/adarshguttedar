import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sorting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorting frame = new Sorting();
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
	public Sorting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbh = new JLabel("Sorting");
		lbh.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lbh.setForeground(new Color(255, 255, 255));
		lbh.setBounds(179, 21, 74, 19);
		contentPane.add(lbh);
		
		JLabel lba = new JLabel("Before sorting");
		lba.setForeground(new Color(255, 255, 255));
		lba.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lba.setBounds(113, 71, 88, 19);
		contentPane.add(lba);
		
		JTextArea txa = new JTextArea();
		txa.setBounds(240, 70, 158, 22);
		contentPane.add(txa);
		
		JTextArea txb = new JTextArea();
		txb.setBounds(240, 115, 158, 22);
		contentPane.add(txb);
		
		JButton sr = new JButton("Bubble Sort");
		sr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence = txa.getText();
				String a[]= sentence.split(" ");
				String help;
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length-1-i;j++)
					{
						if(Integer.valueOf(a[j]) > Integer.valueOf(a[j+1]))
						{
							help=a[j];
							a[j]=a[j+1];
							a[j+1]=help;					
						}
					}
					
				}
				String result=" ";
				for(int i=0;i<a.length;i++)
				{
					result = result+a[i]+" ";
				}
				txb.setText(result);
			}
		});
		sr.setBounds(113, 189, 113, 21);
		contentPane.add(sr);
		
		JLabel lblAfterSorting = new JLabel("After sorting");
		lblAfterSorting.setForeground(Color.WHITE);
		lblAfterSorting.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblAfterSorting.setBounds(113, 121, 88, 19);
		contentPane.add(lblAfterSorting);
	}

}
