import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Transfer extends JPanel
{
	private ArrayList<BankAccount> accounts;
	
	public Transfer(ArrayList<BankAccount> bankAccount)
	{
		accounts = bankAccount;
		setLayout(null);
		
		JLabel accNum1 = new JLabel();
		accNum1.setBounds(50,50,120,50);
		accNum1.setText("Account Number:  ");
		add(accNum1);
		
		JTextField accNumBox1 = new JTextField();
		accNumBox1.setBounds(150, 50, 100, 50);
		add(accNumBox1);
		
		JLabel accNum2 = new JLabel();
		accNum2.setBounds(50,50,120,50);
		accNum2.setText("Account Number to Transfer To:  ");
		add(accNum2);
		
		JTextField accNumBox2 = new JTextField();
		accNumBox2.setBounds(150, 50, 100, 50);
		add(accNumBox2);
		
		
		
		
		
		
		
	}
}