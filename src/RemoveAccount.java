import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RemoveAccount extends JPanel
{
	private ArrayList<BankAccount> accounts;
	private String name;
	private int number;
	
	public RemoveAccount(ArrayList<BankAccount> bankAccount, String n, int num)
	{
		accounts = bankAccount;
		name = n;
		number = num;
		
		setLayout(null);
		
		JLabel number = new JLabel();
		
		
		
		for (int i = accounts.size() - 1; i>=0; i--)
		{
			
		}
		
		
	}
}
