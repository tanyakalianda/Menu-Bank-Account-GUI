import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyFrame extends JFrame
{
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	private WelcomeScreen welcome;
	private CreateAccount createAccount;
	private RemoveAccount removeAccount;
	private FindAccount findAccount;
	private Deposit deposit;
	private Withdraw withdraw;
	
	public MyFrame()
	{
		setBounds(100,100,800,500);
		
		
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();     
		overall.setLayout(cl);
		add(overall);
		
		welcome = new WelcomeScreen();
		overall.add(welcome, "Welcome Screen");
		cl.show(overall, "Welcome Screen");
		
				
		JMenuBar menubar = new JMenuBar();
		
		JMenu accountMenu = new JMenu("Account");
		JMenuItem create = new JMenuItem("Create an Account");
		accountMenu.add(create);                         
		JMenuItem remove = new JMenuItem("Remove an Account");
		accountMenu.add(remove);
		JMenuItem find = new JMenuItem("Find an Account");
		accountMenu.add(find);
		menubar.add(accountMenu); 
		
		JMenu transactionMenu = new JMenu("Transaction");
		JMenuItem depositAmount = new JMenuItem("Deposit an Amount");
		transactionMenu.add(depositAmount);
		JMenuItem withdrawAmount = new JMenuItem("Withdraw an Amount");
		transactionMenu.add(withdrawAmount);
		JMenuItem transfer = new JMenuItem("Transfer an Amount");
		transactionMenu.add(transfer);
		JMenuItem balance = new JMenuItem("Get Balance");
		transactionMenu.add(balance);
		menubar.add(transactionMenu);
		
		JMenu home = new JMenu("Home Screen");
		menubar.add(home);
		
		
		createAccount = new CreateAccount(accounts);
		overall.add(createAccount, "Create Account");
	
		create.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,  "Create Account");
			}
		});
		
		
		removeAccount = new RemoveAccount(accounts);
		overall.add(removeAccount, "Remove Account");
		
		remove.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,  "Remove Account");
			}
		});
		
		findAccount = new FindAccount(accounts);
		overall.add(findAccount, "Find Account");
		find.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,  "Find Account");
			}
		});
		
		deposit = new Deposit(accounts);
		overall.add(deposit, "Deposit Amount");
		depositAmount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,  "Deposit Amount");
			}
		});
		
		withdraw = new Withdraw(accounts);
		overall.add(withdraw, "Withdraw Amount");
		withdrawAmount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,  "Withdraw Amount");
			}
		});
		
		
		home.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,  "Welcome Screen");
			}
		});
		
		

		
		
		
		
		setJMenuBar(menubar);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) 
	{
		new MyFrame();

	}

}
//create arraylist on frame
//make each panel a field on frame
//every panel should have its own field for bank account array
//	but must have same access -
//make constructor in each class take the same parameter
	//reference to arraylist gets passed through the argument
//add account, get account panels