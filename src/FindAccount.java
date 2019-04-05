import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindAccount extends JPanel
{
	private ArrayList<BankAccount> accounts;
	
	public FindAccount(ArrayList<BankAccount> bankAccount)
	{
		accounts = bankAccount;
		setLayout(null);
		
		JLabel number = new JLabel();
		number.setBounds(50,50,200,50);
		number.setText("Account Number to Find: ");
		add(number);
				
		JTextField numberBox = new JTextField();
		numberBox.setBounds(220, 50, 100, 50);
		add(numberBox);
		
		JButton findAccount = new JButton();
		findAccount.setBounds(50, 250, 150, 50);
		findAccount.setText("Find Account");
		findAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				for (int i = accounts.size() - 1; i>=0; i--)
				{
					if (accounts.get(i).getAccountNumber() == Integer.parseInt(numberBox.getText()))
					{
						System.out.println(accounts.get(i).toString());
						findAccount.setText("Account Found");
					}
					else
					{
						findAccount.setText("Invalid Input");
					}
				}
			}
		});
		add(findAccount);

		
		
		
		
		
		
		
	}
}
