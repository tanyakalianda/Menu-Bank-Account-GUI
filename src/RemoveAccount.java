import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RemoveAccount extends JPanel
{
	private ArrayList<BankAccount> accounts;
	
	public RemoveAccount(ArrayList<BankAccount> bankAccount)
	{
		accounts = bankAccount;
		
		setLayout(null);
		
		JLabel number = new JLabel();
		number.setBounds(50,150,200,50);
		number.setText("Account Number to Remove: ");
		add(number);
				
		JTextField numberBox = new JTextField();
		numberBox.setBounds(220, 150, 100, 50);
		add(numberBox);
				
		JButton removeAccount = new JButton();
		removeAccount.setBounds(50, 250, 150, 50);
		removeAccount.setText("Remove Account");
		removeAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				for (int i = accounts.size() - 1; i>=0; i--)
				{
					if (accounts.get(i).getAccountNumber() == Integer.parseInt(numberBox.getText()))
					{
						accounts.remove(i);
						removeAccount.setText("Account Removed");
					}
				}
			}
		});
		add(removeAccount);
		
		
		JButton displayAccount = new JButton();
		displayAccount.setBounds(300,250,150,50);
		displayAccount.setText("Display Accounts");
		displayAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Your Accounts: " + accounts.toString());
				displayAccount.setText("Account Displayed");
				numberBox.setText("");
			}
		});
		add(displayAccount);
		
	}
	
	
}
