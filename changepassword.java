import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
class changepassword{
	JOptionPane pane =new  JOptionPane();
	JComboBox combobox=null;
	JLabel label_combobox=null;
	
	JButton buttan_back=null;
	JButton buttan_save=null;
	JButton buttan_check=null;
	
	TitledBorder titleborder=null;
	Border border=null;
	
	
JOptionPane optionusername=new JOptionPane();
JOptionPane optionpassword=new JOptionPane();
	
	
	JLabel 	label_user_name=null;
	JLabel 	label_old_password=null;
	JLabel 	label_repeat_password=null;
	JLabel 	label_new_password=null;
	
	JFrame frame=null;
	
	JTextField	textfield_old_password=null;
	JTextField textfield_user_name=null;
	JTextField textfield_new_password=null;
	JTextField textfield_repeat_password=null;
	

JOptionPane option=new JOptionPane();
	chengepasswordobj chengeobj=new chengepasswordobj();
	Font font=null;
	changepassword(){

			
//username= String.valueOf(optionusername.getSelectedItem());
//password= String.valueOf(optionpassword.getSelectedItem());

							
					/*		
						
							
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
					
						if(conn!=null)
						{
							
							
							String query3 = "select username,password from users where username = '"+username+"' and  password='"+password +"'";
							PreparedStatement pss = conn.prepareStatement(query3);
							ResultSet result1 = pss.executeQuery();
							result1.getString(username);
							result1.getString(password);
							
							
						}
							
					
*/
	

	font=new Font("ALGERIAC",Font.ITALIC,20);





	buttan_back=new JButton();
	buttan_back.setBounds(370,220,120,25);
buttan_back.setText("Back");
buttan_back.addActionListener(chengeobj);

 buttan_save=new JButton();
buttan_save.setBounds(100,220,120,25);
buttan_save.setText("Save");
buttan_save.addActionListener(chengeobj);



 buttan_check=new JButton();
buttan_check.setBounds(240,220,120,25);
buttan_check.setText("check");
buttan_check.addActionListener(chengeobj);


	 	label_user_name=new JLabel("User Name");
	label_user_name.setBounds(100,20,200,30);
	label_user_name.setFont(font);
	 	label_old_password=new JLabel("Old Password");
			label_old_password.setBounds(100,60,200,30);
			label_old_password.setFont(font);
		 label_new_password=new JLabel("new password");
		label_new_password.setBounds(100,100,200,30);
		label_new_password.setFont(font);


		 label_repeat_password=new JLabel("Repeat password");
		label_repeat_password.setBounds(100,140,200,30);
		label_repeat_password.setFont(font);


textfield_user_name=new JTextField();
	textfield_user_name.setBounds(320,20,230,30);

 	textfield_old_password=new JTextField();
		textfield_old_password.setBounds(320,60,230,30);
	
		
 	textfield_new_password=new JTextField();
		textfield_new_password.setBounds(320,100,230,30);
		textfield_new_password.setEnabled(false);
 	
 	textfield_repeat_password=new JTextField();
		textfield_repeat_password.setBounds(320,140,230,30);
		textfield_repeat_password.setEnabled(false);
			
		
Color collll=new Color(0,0,0);
border=BorderFactory.createLineBorder(collll.BLACK,2);
titleborder= new TitledBorder(border);
titleborder.setTitleJustification(TitledBorder.LEFT);
		//titleborder.setBounds(20,20,580,280);	
			
///////////////////////////////
JPanel panel=new JPanel();
	panel.setLayout(null);
panel.add(label_user_name);
panel.add(label_old_password);
panel.add(label_repeat_password);
panel.add(label_new_password);



panel.add(textfield_user_name);
panel.add(textfield_old_password);
panel.add(textfield_new_password);

panel.add(textfield_repeat_password);

panel.add(buttan_back);
panel.add(buttan_save);
panel.add(buttan_check);

panel.setBorder(titleborder);

		
		
		
		 frame=new JFrame();
		
		frame.add(panel);
		frame.setTitle("Chenge password");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
}

							
class chengepasswordobj implements ActionListener{
	public void actionPerformed(ActionEvent eee){
		
		
   Object obg = eee.getSource();
   
			   
					
		
		if (obg==buttan_back){
				frame.setVisible(false);
				connectsetting conn= new connectsetting();
		}
		
		if (obg==buttan_check){
			
			String username=   textfield_user_name.getText();
		String password  =textfield_old_password.getText();
		
			   String username1=null;
			   String password1=null;
				
					
					try
					{
					
				
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
						
							
						if(con!=null){
							System.out.println("OK");
							String query =" select username,password from users where username='"+username+"' and password='"+password+"'";
							System.out.println("OK");
							PreparedStatement ps = con.prepareStatement(query);
							System.out.println("OK");
						ResultSet res = ps.executeQuery();
							System.out.println("OK");
							while(res.next()){
								 username1=res.getString("username");
				                  password1=res.getString("password");
		}
		
		if(username.equalsIgnoreCase(username1) && password.equalsIgnoreCase(password1)){ 
		textfield_new_password.setEnabled(true);
		textfield_repeat_password.setEnabled(true);
		
		option.showMessageDialog(frame,"YOU CAN TO CHANGE PASSWORD");
					System.out.println("OKk");
		}
						}
					}
					
					catch(ClassNotFoundException notfound)
					{
						option.showMessageDialog(frame,"Sorry, class Probelm");
					}
					catch(SQLException sqlexp)
					{
						option.showMessageDialog(frame,"Sorry, some sql probem");
					}
					catch(Exception exp)
					{
						option.showMessageDialog(frame,"Some General Exception");
					}
			
				
		}
				
		if (obg==buttan_save){
			

										try{
											
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
						
						
				String password = textfield_new_password.getText();
					String password_repeat = textfield_repeat_password.getText();
			String username=   textfield_user_name.getText();
							String query3 = "update users set  password=? where  username=?";
							
							System.out.println("OK");
							PreparedStatement pss = conn.prepareStatement(query3);
							
							
							
							System.out.println("OK");
								
							
					pss.setString(1,password);
					pss.setString(2,username);

						int ree ;	
					if(password.equalsIgnoreCase(password_repeat) ){
							System.out.println("OK");;	
						
						 ree = pss.executeUpdate();
					
							
						System.out.println("okkk");
			if(ree !=0 )
			{
							option.showMessageDialog(frame,"YOUR PASSWORD CHANGED");
			}
					}
							else{
								pane.showMessageDialog(frame,"Sorry,password do not changed");
							}
							
						
						System.out.println("ok");
						
					
					}
				
					catch(ClassNotFoundException notfound)
					{
						option.showMessageDialog(frame,"Sorry, class Probelm");
					}
					catch(SQLException sqlexp)
					{
						option.showMessageDialog(frame,"Sorry, some sql probem");
					}
					catch(Exception exp)
					{
						option.showMessageDialog(frame,"Some General Exception");
					}
					}
					
	}		
			
			
		}
	
	
	
	
}




