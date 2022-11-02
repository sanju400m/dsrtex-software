package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JLabel dsrtex = new JLabel("DSRTEX");
		dsrtex.setBounds(337, 11, 220, 41);
		dsrtex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(dsrtex);

		JPanel panel = new JPanel();
		panel.setBounds(160, 82, 450, 163);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel userlab = new JLabel("UserName");
		userlab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userlab.setBounds(32, 22, 99, 31);
		panel.add(userlab);

		JLabel passlab = new JLabel("Password");
		passlab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passlab.setBounds(32, 85, 99, 31);
		panel.add(passlab);

		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		user.setBounds(190, 22, 207, 31);
		panel.add(user);
		user.setColumns(10);

		pass = new JPasswordField();
		pass.setBounds(190, 85, 207, 31);
		panel.add(pass);

		JButton loginn = new JButton("Login");
		loginn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (user.getText().trim().isEmpty() && pass.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(loginn, "enter unmae and pass", null, 0);
				}

				else if (user.getText().equals("ad") && pass.getText().equals("ad")) {
					
					login l = new login();
					
					main m = new main();
					frame.dispose();

				} else {
					JOptionPane.showMessageDialog(loginn, "incorrect unmae or pass", null, 0);
				}

			}
		});
		loginn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginn.setBounds(360, 272, 101, 32);
		frame.getContentPane().add(loginn);

		JButton cancel = new JButton("Cancel");
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cancel.setBounds(488, 272, 101, 32);
		frame.getContentPane().add(cancel);
	}

	protected void hide() {
		
	}

}
