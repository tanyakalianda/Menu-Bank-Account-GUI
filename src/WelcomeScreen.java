import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class WelcomeScreen extends JPanel
{	
	public WelcomeScreen()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;    
		gbc.gridy = 0;
		
		JLabel text = new JLabel("Welcome to the Bank Account Management System!");
		add(text, gbc);
		
		
	}
	
	  
}
