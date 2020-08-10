package com.project.menu;
	 
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.Insets;
	 
	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;
	import javax.swing.SwingUtilities;
	import javax.swing.UIManager;
	 
	/**
	 * This program demonstrates how to use JPanel in Swing.
	 * @author www.codejava.net
	 */
	public class MenuDisplay extends JFrame {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JLabel labelFirstname = new JLabel("Enter First Name: ");
	    private JLabel labelLastname = new JLabel("Enter Last Name: ");
	    private JLabel labelUsername = new JLabel("Enter username: ");
	    private JLabel labelPassword = new JLabel("Enter password: ");
	    private JLabel labelArtist = new JLabel("Enter Favorite Artist: ");
	    private JTextField textFirstname = new JTextField(20);
	    private JTextField textLastname = new JTextField(20);
	    private JTextField textUsername = new JTextField(20);
	    private JPasswordField fieldPassword = new JPasswordField(20);
	    private JTextField textArtist = new JTextField(20);
	    private JButton buttonRegister = new JButton("Register");
	     
	    public MenuDisplay() {
	        super("Registration");
	         
	        // create a new panel with GridBagLayout manager
	        JPanel newPanel = new JPanel(new GridBagLayout());
	         
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.anchor = GridBagConstraints.WEST;
	        constraints.insets = new Insets(10, 10, 10, 10);
	         
	        // add components to the panel
	        constraints.gridx = 0;
	        constraints.gridy = 0;     
	        newPanel.add(labelFirstname, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textFirstname, constraints);
	        
	        constraints.gridx = 0;
	        constraints.gridy = 1;     
	        newPanel.add(labelLastname, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textLastname, constraints);
	        
	        constraints.gridx = 0;
	        constraints.gridy = 2;     
	        newPanel.add(labelUsername, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textUsername, constraints);
	         
	        constraints.gridx = 0;
	        constraints.gridy = 3;     
	        newPanel.add(labelPassword, constraints);
	         
	        constraints.gridx = 1;
	        newPanel.add(fieldPassword, constraints);
	        
	        constraints.gridx = 0;
	        constraints.gridy = 4;     
	        newPanel.add(labelArtist, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textArtist, constraints);
	        
	         
	        constraints.gridx = 0;
	        constraints.gridy = 5;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.CENTER;
	        newPanel.add(buttonRegister, constraints);
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Registration Panel"));
	         
	        // add the panel to this frame
	        add(newPanel);
	         
	        pack();
	        setLocationRelativeTo(null);
	    }
	     
	    public static void main(String[] args) {
	        // set look and feel to the system look and feel
	        try {
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	         
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new MenuDisplay().setVisible(true);
	            }
	        });
	    }
	}

