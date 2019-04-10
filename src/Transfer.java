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
		
		JLabel amount = new JLabel();
		amount.setBounds(50, 110, 130, 50);
		amount.setText("Amount to Transfer: ");
		add(amount);
		
		JTextField amountBox = new JTextField();
		amountBox.setBounds(170, 110, 100, 50);
		add(amountBox);
		
		JLabel accNum2 = new JLabel();
		accNum2.setBounds(50,170,200,50);
		accNum2.setText("Account Number to Transfer To:  ");
		add(accNum2);
		
		JTextField accNumBox2 = new JTextField();
		accNumBox2.setBounds(240, 170, 100, 50);
		add(accNumBox2);
		
		JButton transfer = new JButton();
		transfer.setBounds(50, 250, 150, 50);
		transfer.setText("Transfer");
		transfer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				BankAccount acc1 = null; 
				BankAccount acc2 = null;
				
				for (int i = accounts.size() - 1; i>=0; i--)
				{					
					if (accounts.get(i).getAccountNumber() == Integer.parseInt(accNumBox1.getText()))
					{
						acc1 = accounts.get(i);
					}	
					
					if (accounts.get(i).getAccountNumber() == Integer.parseInt(accNumBox2.getText()))
					{
						acc2 = accounts.get(i);
					}
				}
				if (acc1 != null && acc2 != null)
				{
					acc1.transfer(acc2, Double.parseDouble(amountBox.getText()));
					System.out.println(accounts.toString());
					transfer.setText("Amount Transfered");
				}
			}
		});
		add(transfer);
		
		
		
		
		
		
	}
}