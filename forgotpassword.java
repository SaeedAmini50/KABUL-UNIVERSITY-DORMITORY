
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
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class forgotpassword{

	
	JComboBox combobox=null;
	JLabel label_combobox=null;
	
	JButton buttan_retrive=null;
	JButton buttan_back=null;
	JButton buttan_search=null;
	
	TitledBorder titleborder=null;
	Border border=null;
	
	JFrame frame=null;
	JLabel 	label_name=null;
	JLabel 	label_user_name=null;
	JLabel 	label_password=null;
	JLabel 	label_answer=null;
	
	JTextField	textfield_name=null;
	JTextField textfield_user_name=null;
	JTextField textfield_password=null;
	JTextField textfield_answer=null;
	String username,password,name,answer,answer1,security_question,security_question1,name1,username1,password1 = null;
	
	Font font=null;
	JOptionPane option=new JOptionPane();
	forgotpasswordobj forgotobg=new forgotpasswordobj(); 
forgotpassword(){


 font=new Font("ALGERIAC",Font.ITALIC,20);







label_combobox=new JLabel("Security Question");
label_combobox.setBounds(100,100,200,30);
label_combobox.setFont(font);

String [] question={"What is your favorite sport name?","What is your school name?","What is your best teacher's name?","Who do you motivate from?"};
 combobox = new JComboBox(question);
combobox.setBounds(320,100,230,30);


 buttan_retrive=new JButton();
buttan_retrive.setBounds(600,140,150,30);
buttan_retrive.setText("Retrive");


 buttan_back=new JButton();
buttan_back.setBounds(600,180,150,30);
buttan_back.setText("Back");
buttan_back.addActionListener(forgotobg);

 buttan_search=new JButton();
buttan_search.setBounds(600,20,150,30);
buttan_search.setText("Search");
buttan_search.addActionListener(forgotobg);


	 	label_user_name=new JLabel("User Name");
	label_user_name.setBounds(100,20,200,30);
	label_user_name.setFont(font);
	   	label_name=new JLabel("Name");
		label_name.setBounds(100,60,200,30);
		label_name.setFont(font);
	 	label_password=new JLabel("Password");
			label_password.setBounds(100,180,200,30);
			label_password.setFont(font);
		 label_answer=new JLabel("Answer");
		label_answer.setBounds(100,140,200,30);
		label_answer.setFont(font);



textfield_user_name=new JTextField();
	textfield_user_name.setBounds(320,20,230,30);

 	textfield_name=new JTextField();
		textfield_name.setBounds(320,60,230,30);
	textfield_name.setEnabled(false);
		
 	textfield_password=new JTextField();
		textfield_password.setBounds(320,180,230,30);
		textfield_password.setEnabled(false);
 	
 	textfield_answer=new JTextField();
		textfield_answer.setBounds(320,140,230,30);
		
		
		
			
Color collll=new Color(0,0,0);
border=BorderFactory.createLineBorder(collll.BLACK,2);
titleborder= new TitledBorder(border);
titleborder.setTitleJustification(TitledBorder.LEFT);
			
			
///////////////////////////////
JPanel panel=new JPanel();
	panel.setLayout(null);
panel.add(label_user_name);
panel.add(label_name);
panel.add(label_password);
panel.add(label_combobox);
panel.add(label_answer);


panel.add(textfield_user_name);
panel.add(textfield_name);
panel.add(textfield_password);
panel.add(combobox);
panel.add(textfield_answer);

panel.add(buttan_back);
panel.add(buttan_search);
//panel.add(buttan_retrive);

panel.setBorder(titleborder);

		
		
		
	 frame=new JFrame();
		
		frame.add(panel);
		frame.setTitle("Forgot Password");
		frame.setSize(800,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
}
class forgotpasswordobj implements ActionListener{
	
	public void actionPerformed(ActionEvent aaee){
		
   Object obg = aaee.getSource();
   if (obg==buttan_back){
	   frame.setVisible(false);
	   login log = new login();
	   
   }
		if (obg==buttan_search)
		{
			
					try
					{
						Class.forName("oracle.jdbc.OracleDriver");
						Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
						if(con1 != null)
						{
							 username = textfield_user_name.getText();
							password = textfield_password.getText();
							name = textfield_name.getText();
							
							// Object oobj = combobox.getSelectItem();
							security_question= String.valueOf(combobox.getSelectedItem());
							answer = textfield_answer.getText();
							
							
							String query1 = "select name,username,security_question,answer,password from users where username = '"+username+"' and security_question = '"+security_question+"' and answer = '"+answer+"'";
							System.out.println("1");
							PreparedStatement ps1 = con1.prepareStatement(query1); 
							System.out.println("1");
							//ps1.setStirng(1,username);
							//ps1.setStirng(2,security_question);
							//ps1.setStirng(3,answer);
							
							ResultSet rs1 = ps1.executeQuery();
							System.out.println("1");
							
								while(rs1.next())
								{
									username1 = rs1.getString("username");
									name1 = rs1.getString("name");
									security_question1 = rs1.getString("security_question");
									answer1 = rs1.getString("answer");
									password1 = rs1.getString("password");
									
								}
								System.out.println("1");
							
							if(username.equalsIgnoreCase(username1) && security_question.equalsIgnoreCase(security_question1) && answer.equalsIgnoreCase(answer1))
							{
								textfield_name.setText(name1);
								textfield_password.setText(password1);
							}
							else{
								option.showMessageDialog(frame,"Sorry,you can not access");
								  frame.setVisible(false);
								login log= new login();
								
							}
							System.out.println("1");
							
							
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
		
		}
		
	}
}



