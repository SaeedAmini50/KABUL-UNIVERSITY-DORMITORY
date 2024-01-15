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

import java.sql.*;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
class createaccount{

	
createaccountobj createobj=new createaccountobj();
	JComboBox combobox=null;
	JLabel label_combobox=null;
	
	JButton buttan_back=null;
	JButton buttan_create_account=null;
	
	TitledBorder titleborder=null;
	Border border=null;
	
	
	JLabel 	label_name=null;
	JLabel 	label_user_name=null;
	JLabel 	label_password=null;
	JLabel 	label_answer=null;
	
	JTextField	textfield_name=null;
	JTextField textfield_user_name=null;
	JTextField textfield_password=null;
	JTextField textfield_answer=null;
	
	JFrame frame=null;
	
JOptionPane option=new JOptionPane();

	Font font=null;
createaccount(){

	String passwordd=option.showInputDialog(frame,"please enter your password");

System.out.println(passwordd);

if(passwordd.equalsIgnoreCase("123")){
	
	
 font=new Font("ALGERIAC",Font.ITALIC,20);







label_combobox=new JLabel("Security Question");
label_combobox.setBounds(100,140,200,30);
label_combobox.setFont(font);

String [] question={"What is your favorite sport name?","What is your school name?","What is your best teacher's name?","Who do you motivate from?"};
 combobox = new JComboBox(question);
combobox.setBounds(320,140,230,30);



 buttan_back=new JButton();
buttan_back.setBounds(320,220,150,25);
buttan_back.setText("Back");
buttan_back.addActionListener(createobj);
 buttan_create_account=new JButton();
buttan_create_account.setBounds(100,220,150,25);
buttan_create_account.setText("Create Account");
buttan_create_account.addActionListener(createobj);


	 	label_user_name=new JLabel("User Name");
	label_user_name.setBounds(100,20,200,30);
	label_user_name.setFont(font);
	   	label_name=new JLabel("Name");
		label_name.setBounds(100,60,200,30);
		label_name.setFont(font);
	 	label_password=new JLabel("Password");
			label_password.setBounds(100,100,200,30);
			label_password.setFont(font);
		 label_answer=new JLabel("Answer");
		label_answer.setBounds(100,180,200,30);
		label_answer.setFont(font);



textfield_user_name=new JTextField();
	textfield_user_name.setBounds(320,20,230,30);

 	textfield_name=new JTextField();
		textfield_name.setBounds(320,60,230,30);
	
		
 	textfield_password=new JTextField();
		textfield_password.setBounds(320,100,230,30);
		
 	
 	textfield_answer=new JTextField();
		textfield_answer.setBounds(320,180,230,30);
		
		
		
			
Color collll=new Color(0,0,0);
border=BorderFactory.createLineBorder(collll.BLACK,1);
titleborder= new TitledBorder(border,"Create Account");
titleborder.setTitleJustification(TitledBorder.CENTER);
			
			
			
			
			
			
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
panel.add(buttan_create_account);

panel.setBorder(titleborder);

		
		
		
	 frame=new JFrame();
		
		frame.add(panel);
		frame.setTitle("Create Account");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
}
else{
	
				//frame.setVisible(false);
				login log=new login();
}
}
class createaccountobj implements ActionListener{
	public void actionPerformed(ActionEvent eeee){
		
		
   Object obg = eeee.getSource();
  
			String username = textfield_user_name.getText();
			String name = textfield_password.getText();
			String password = textfield_name.getText();
				String security_question= String.valueOf(combobox.getSelectedItem());
			String answer = textfield_answer.getText();
	
		if (obg==buttan_back){
				frame.setVisible(false);
				login log=new login();
		}
		
	 if (obg== buttan_create_account){
		
					try
					{
						
						Class.forName("oracle.jdbc.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
						
						if(con!=null)
						{
							System.out.println("1");
							
							String query = "insert into users values(?,?,?,?,?)";
							System.out.println("1");
							PreparedStatement ps = con.prepareStatement(query);
							ps.setString(1,username);
							ps.setString(2,name);
							ps.setString(3,password);
							ps.setString(4,security_question);
							ps.setString(5,answer);
							
							System.out.println("1");
							
							int result = ps.executeUpdate();
							System.out.println("1");
							if(result!=0)
							{
								option.showMessageDialog(frame,"Account Created");
							}
							else{
								option.showMessageDialog(frame,"Excuse me,account didnot created");
							}
							
						}
						else
						{
							
							option.showMessageDialog(frame,"Sorry, there is no connection established");
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