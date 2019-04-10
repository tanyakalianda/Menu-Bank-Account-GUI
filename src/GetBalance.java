import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetBalance extends JPanel
{
	private ArrayList<BankAccount> accounts;
	
	public GetBalance(ArrayList<BankAccount> bankAccount)
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
		
		JButton getBalance = new JButton();
		getBalance.setBounds(50, 150, 150, 50);
		getBalance.setText("Get Balance");
		getBalance.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				for (int i = accounts.size() - 1; i>=0; i--)
				{
					if (accounts.get(i).getAccountNumber() == Integer.parseInt(accNumBox.getText()))
					{
						System.out.println("Your balance is: " + accounts.get(i).getBalance());
						getBalance.setText("Balance Printed");
					}
				}
			}
		});
		add(getBalance);
			
		
		
		
	}
}
