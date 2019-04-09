import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Deposit extends JPanel
{
	private ArrayList<BankAccount> accounts;
	
	public Deposit(ArrayList<BankAccount> bankAccount)
	{
		accounts = bankAccount;
		setLayout(null);
		
		JLabel accNum = new JLabel();
		accNum.setBounds(50,50,120,50);
		accNum.setText("Account Number:  ");
		add(accNum);
		
		JTextField accNumBox = new JTextField();
		accNumBox.setBounds(150, 50, 100, 50);
		add(accNumBox);
		
		JLabel amount = new JLabel();
		amount.setBounds(50, 170, 150, 50);
		amount.setText("Amount to Deposit: ");
		add(amount);
		
		JTextField amountBox = new JTextField();
		amountBox.setBounds(160, 170, 100, 50);
		add(amountBox);
		
		JButton deposit = new JButton();
		deposit.setBounds(50, 250, 150, 50);
		deposit.setText("Deposit");
		deposit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				for (int i = accounts.size() - 1; i>=0; i--)
				{
					if (accounts.get(i).getAccountNumber() == Integer.parseInt(accNumBox.getText()))
					{
						accounts.get(i).deposit(Double.parseDouble(amountBox.getText()));
						System.out.println(accounts.get(i).toString());
						deposit.setText("Amount Deposited");
					}
				}
			}
		});
		add(deposit);
		
		
		
		
	}
}
