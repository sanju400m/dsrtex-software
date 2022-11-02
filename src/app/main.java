package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sales");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sales s = new sales();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(53, 73, 144, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPayments = new JButton("Payments");
		btnPayments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				payments p = new payments();
			}
		});
		btnPayments.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPayments.setBounds(53, 158, 144, 45);
		frame.getContentPane().add(btnPayments);
		
		JButton btnNewButton_2_1 = new JButton("Logout");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				login l=new login();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setBounds(602, 393, 144, 45);
		frame.getContentPane().add(btnNewButton_2_1);
		frame.setVisible(true);
	}

}
