import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
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
		
		JButton text = new JButton("Welcome to the Bank Account Management System");
		text.setPreferredSize(new Dimension(400,200));
		add(text, gbc);
		
	}
	
	  
}
