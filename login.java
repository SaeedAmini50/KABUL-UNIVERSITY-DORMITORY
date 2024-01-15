import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.*;
import javax.swing.text.Document;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

class login{
	JFrame frame=null;
	ImageIcon imageicon_user=null;
	JLabel 	label_user=null;
	JTextField	textfield_user=null;
	JTextField	textfield_password=null;
	ImageIcon imageicon_password=null;
	JLabel 	label_password=null;
	JButton	button_login=null;
	ImageIcon imageicon_lock=null;
	ImageIcon imageicon_key=null;
	JButton 	button_sign_up=null;
ImageIcon imageicon_forgot_Password=null;
	 
	JButton 	button_forgot_Password=null;
	actionpage page =new actionpage();
	
	JOptionPane opt = new JOptionPane();
	login(){



////////////user
 imageicon_user=new ImageIcon("man51.png");
	label_user=new JLabel(imageicon_user);
	label_user.setBounds(100,20,64,64);
	
	
	textfield_user= new JTextField(20);
	textfield_user.setBounds(200,40,280,30);
	
	///////////////password
	
	 imageicon_password=new ImageIcon("lockk.png");
		label_password=new JLabel(imageicon_password);
	label_password.setBounds(100,90,64,64);
	
	
	textfield_password=new JTextField(20);
		textfield_password.setBounds(200,110,280,30);
		
		
     //	PlaceHolder placeholder=new PlaceHolder(textfield1,"please enter your password");
	//TextPrompt placeholder=new TextPrompt("please enter your password",textfield1);
	
	
	
/////button with image


   
	
	 imageicon_lock=new ImageIcon("lock.png");
	
	button_login=new JButton(imageicon_lock);
	button_login.setBounds(80,160,200,30);
	button_login.setText("login");
	button_login.addActionListener(page);
	
	
imageicon_key=new ImageIcon("key2.png");
		button_sign_up=new JButton(imageicon_key);
		button_sign_up.setBounds(280,160,200,30);
				button_sign_up.setText("sign up");
				button_sign_up.addActionListener(page);
				
				
		imageicon_forgot_Password=new ImageIcon("lock.png");
	button_forgot_Password=new JButton(imageicon_forgot_Password);
	button_forgot_Password.setBounds(80,200,400,30);
	button_forgot_Password.setText("forgot Password");
	button_forgot_Password.addActionListener(page);
	
	
/////border
		
		Color col=new Color(0,0,0);

		Border border = BorderFactory.createLineBorder(Color.BLACK,3);	
		
TitledBorder titleborder= new TitledBorder(border);
titleborder.setTitleJustification(TitledBorder.LEFT);

		
		
		JPanel 	panel=new JPanel();
        panel.setBorder(titleborder);
		panel.setLayout(null);
		panel.add(label_user);
		panel.add(textfield_user);
		panel.add(label_password);
		panel.add(textfield_password);
		panel.add(button_login);
		panel.add(button_sign_up);
		panel.add(button_forgot_Password);
		
		
		
		
		frame=new JFrame();
		frame.add(panel);
		frame.setTitle("login page");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		



	}
	



  class actionpage implements ActionListener
  {
	public void actionPerformed(ActionEvent ssee){


   Object obg = ssee.getSource();

if(obg==button_forgot_Password)
{	frame.setVisible(false);
		forgotpassword forgotp= new forgotpassword();
}
else if(obg==button_sign_up){
		frame.setVisible(false);
	createaccount createa= new createaccount();
	
}

else if(obg==button_login){
	frame.setVisible(false);
//	mainlist forgotp= new mainlist();

	
				String username = textfield_user.getText();
				String password = textfield_password.getText();
				
				
				try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
						
						
						if(con!=null)
						{
							String query =" select count(*) from users where username = ? and password = ? ";
							
							PreparedStatement ps = con.prepareStatement(query);
							ps.setString(1,username);
							ps.setString(2,password);
							
							
							ResultSet result = ps.executeQuery();
							int value = 0; 
							while(result.next())
							{
								value = result.getInt(1);
								
							}
							//ps.close();
							if(value!=0)
							{
								frame.setVisible(false);
								opt.showMessageDialog(frame,"welcome");
								mainlist  listt = new mainlist();	
								
							}
							else
							{
								opt.showMessageDialog(frame,"Sorry, you cannot access that application");
								
								login  log = new login();
							}
							
						
														
						}
						else
						{
							
							opt.showMessageDialog(frame,"Sorry, there is no connection established");
						}
						
					}
					catch(ClassNotFoundException notfound)
					{
						opt.showMessageDialog(frame,"Sorry, class Probelm");
					}
					catch(SQLException sqlexp)
					{
						opt.showMessageDialog(frame,"Sorry, some sql probem");
					}
					catch(Exception exp)
					{
						opt.showMessageDialog(frame,"Some General Exception");
					}
				
				
			
				
			}
	
}
}
}

