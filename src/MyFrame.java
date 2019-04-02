import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyFrame extends JFrame
{
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public MyFrame()
	{
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();     
		overall.setLayout(cl);
		
//		overall.add(WelcomeScreen, "Welcome Screen");
		
		
		
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu accountMenu = new JMenu("Account");
		JMenuItem createAccount = new JMenuItem("Create an Account");
		accountMenu.add(createAccount);                         
		JMenuItem removeAccount = new JMenuItem("Remove an Account");
		accountMenu.add(removeAccount);
		JMenuItem findAccount = new JMenuItem("Find an Account");
		accountMenu.add(findAccount);
		menubar.add(accountMenu); 
		
		JMenu transactionMenu = new JMenu("Transaction");
		JMenuItem deposit = new JMenuItem("Deposit");
		transactionMenu.add(deposit);
		JMenuItem withdraw = new JMenuItem("Withdraw");
		transactionMenu.add(withdraw);
		JMenuItem transfer = new JMenuItem("Transfer");
		transactionMenu.add(transfer);
		JMenuItem balance = new JMenuItem("Get Balance");
		transactionMenu.add(balance);
		menubar.add(transactionMenu);
		
		JMenu home = new JMenu("Home Screen");
		menubar.add(home);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
//create arraylist on frame
//make each panel a field on frame
//every panel should have its own field for bank account array
//	but must have same access -
//make constructor in each class take the same parameter
	//reference to arraylist gets passed through the argument
//add account, get account panels