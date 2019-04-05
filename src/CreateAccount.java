import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccount extends JPanel
{	
	private final ArrayList<BankAccount> accounts;
	private final double OVER_DRAFT_FEE = 15;
	private final double RATE = 0.0025;
	private final double TRANSACTION_FEE = 1.5;
	private final double MIN_BAL = 300;
	private final double MIN_BAL_FEE = 10;
	private final int FREE_TRANSACTIONS = 10;
	private int accNum = -1;
	
	
	public CreateAccount(ArrayList<BankAccount> bankAccount)
	{
		accounts = bankAccount;
		
		setLayout(null);
		
		JLabel name = new JLabel();
		name.setBounds(50,50,100,50);
		name.setText("Name: ");
		add(name);
		
		JTextField nameBox = new JTextField();
		nameBox.setBounds(100, 50, 100, 50);
		add(nameBox);
		
		JLabel accountType = new JLabel();
		accountType.setBounds(50, 110, 100, 50);
		accountType.setText("Account Type: ");
		add(accountType);
		
		String[] options = {"", "Checking Account", "Savings Account"};     
		JComboBox accountTypeBox = new JComboBox(options);
		accountTypeBox.setBounds(150,110,150,50);
		add(accountTypeBox);
		
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
					accounts.add(new CheckingAccount(nameAccount, balanceAccount, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS));
					createAccount.setText("Account Created");
				}
				else if (selected.equals("Savings Account"))
				{
					accounts.add(new SavingsAccount(nameAccount, balanceAccount, RATE, MIN_BAL, MIN_BAL_FEE));
					createAccount.setText("Account Created");
				}
				else
				{
					createAccount.setText("Error - invalid input");
				}
			}
		});
		add(createAccount);
		
		
		JButton displayAccount = new JButton();
		displayAccount.setBounds(300,250,150,50);
		displayAccount.setText("Display Accounts");
		displayAccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Your Accounts: " + accounts.toString());
				displayAccount.setText("Account Displayed");
				balanceBox.setText("");
				nameBox.setText("");
			}
		});
		add(displayAccount);
		
	}
	
	
	

	
	
}
