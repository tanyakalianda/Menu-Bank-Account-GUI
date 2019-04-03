import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccount extends JPanel
{
	public CreateAccount()
	{
		setLayout(new GridBagLayout());   
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;    
		gbc.gridy = 0;
		
		JLabel accountType = new JLabel();
		accountType.setText("Check the type of account you want to create: ");
		add(accountType, gbc);
		
		String[] accounts = {"", "Checking Account", "Savings Account"};     
		JComboBox accountTypeBox = new JComboBox(accounts);
		accountTypeBox.setBounds(150,110,150,50);
		add(accountTypeBox);
		
		JLabel name = new JLabel();
		name.setBounds(50,50,100,50);
		name.setText("Name: ");
		add(name);
		
		JTextField nameBox = new JTextField();
		nameBox.setBounds(100, 50, 100, 50);
		add(nameBox);
			
		
		JLabel balance = new JLabel();
		balance.setBounds(50, 170, 100, 50);
		balance.setText("Initial Balance: ");
		add(balance);
		
		JTextField balanceBox = new JTextField();
		balanceBox.setBounds(150, 170, 100, 50);
		add(balanceBox);
		
		JButton createAccount = new JButton();
		createAccount.setBounds(50, 250, 150, 50);
		createAccount.setText("Create Account");
		createAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String selected = (String) accountTypeBox.getSelectedItem();
				String nameAccount = nameBox.getText();
				Double balanceAccount = Double.parseDouble(balanceBox.getText());
				
				if (selected.equals("Checking Account"))
				{
					bankAccounts.add(new CheckingAccount(nameAccount, balanceAccount, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
					createAccount.setText("Account Created");
				}
				else if (selected.equals("Savings Account"))
				{
					bankAccounts.add(new SavingsAccount(nameAccount, balanceAccount, RATE, MIN_BAL, MIN_BAL_FEE));
					createAccount.setText("Account Created");
				}
				else
				{
					createAccount.setText("Error - invalid input");
				}
			}
		});
		add(createAccount);
		
		
		
		
	}
	
	
	

	
	
}
