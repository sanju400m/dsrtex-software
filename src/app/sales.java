package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class sales {

	private JFrame frame;
	private JTextField date;
	private JTextField invoice;
	private JTextField company;
	private JTextField amount;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sales window = new sales();
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
	public sales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		date = new JTextField();
		date.setBounds(542, 91, 130, 30);
		frame.getContentPane().add(date);
		date.setColumns(10);
		
		invoice = new JTextField();
		invoice.setColumns(10);
		invoice.setBounds(542, 38, 130, 30);
		frame.getContentPane().add(invoice);
		
		company = new JTextField();
		company.setColumns(10);
		company.setBounds(542, 148, 130, 30);
		frame.getContentPane().add(company);
		
		amount = new JTextField();
		amount.setColumns(10);
		amount.setBounds(542, 207, 130, 30);
		frame.getContentPane().add(amount);
		
		JLabel lblNewLabel = new JLabel("Invoice number");
		lblNewLabel.setBounds(682, 46, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(682, 99, 49, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(682, 156, 49, 14);
		frame.getContentPane().add(lblCompanyName);
		
		JLabel lblNewLabel_2_1 = new JLabel("Amount");
		lblNewLabel_2_1.setBounds(682, 215, 49, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				DefaultTableModel tm= (DefaultTableModel)table.getModel();
				tm.addRow(new  Object [] {Integer.parseInt(invoice.getText())
						                                ,date.getText()
						                                ,company.getText()
						                                ,Integer.parseInt(amount.getText())
						                                ,(Integer.parseInt(amount.getText())*0.05)
						                                ,Integer.parseInt(amount.getText())+Integer.parseInt(amount.getText())*0.05
						                                ,JOptionPane.showInputDialog( "saves")
				});
			
			
			}
		});
		save.setBounds(558, 273, 89, 23);
		frame.getContentPane().add(save);
		
		JButton update = new JButton("Update");
		update.setBounds(558, 321, 89, 23);
		frame.getContentPane().add(update);
		
		JButton delete = new JButton("Delete");
		delete.setBounds(558, 365, 89, 23);
		frame.getContentPane().add(delete);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				main m=new main();
			}
		});
		back.setBounds(558, 429, 89, 23);
		frame.getContentPane().add(back);
		
		JButton logout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				login l= new login
						();
			}
		});
		logout.setBounds(666, 429, 89, 23);
		frame.getContentPane().add(logout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 39, 459, 390);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"invoice", "date", "company", "amount", "gst", "total"
			}
		));
		scrollPane.setViewportView(table);
		
		
		
	}
}
