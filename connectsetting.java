import javax.swing.JFrame;
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
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class connectsetting{
	connectsettingobj conobj=new connectsettingobj();
	
	JLabel 	label_about_we=null;
	JLabel label_change_password=null;
	
	JLabel label_back=null;
	
	
	
	JButton buttan_back=null;
	JButton buttan_about_we=null;
	JButton buttan_change_password=null;


	ImageIcon imageicon_about_we=null;
	ImageIcon imageicon_change_password=null;
	ImageIcon imageicon_back=null;
	
	Font font=null;
	Font font2=null;
	JFrame frame=null;
	
	connectsetting(){


 font=new Font("ALGERIAC",Font.ITALIC,23);
 font2=new Font("ALGERIAC",Font.ITALIC,30);
JPanel  panel=new JPanel();

/////////////
///////////////
////////////about

imageicon_about_we=new ImageIcon("about us.png");
	 	buttan_about_we=new JButton(imageicon_about_we);
buttan_about_we.setBounds(80,70,128,128);
buttan_about_we.addActionListener(conobj);



label_about_we=new JLabel("About Us");
	label_about_we.setBounds(80,200,200,50);
	label_about_we.setFont(font2);








 imageicon_change_password=new ImageIcon("change password.png");
		buttan_change_password=new JButton(imageicon_change_password);
buttan_change_password.setBounds(325,70,128,128);
buttan_change_password.addActionListener(conobj);


	 	
	   	label_change_password=new JLabel("Change Password");
		label_change_password.setBounds(260,200,300,50);
		label_change_password.setFont(font2);





 imageicon_back=new ImageIcon("back.png");
		buttan_back=new JButton(imageicon_back);
buttan_back.setBounds(570,70,128,128);
buttan_back.addActionListener(conobj);



	 	label_back=new JLabel("Back");
	label_back.setBounds(600,200,100,50);
	label_back.setFont(font2);








		panel.setLayout(null);
			panel.add(buttan_about_we);
			panel.add(buttan_change_password);
			panel.add(buttan_back);
			panel.add(label_about_we);
			panel.add(label_change_password);
			panel.add(label_back);
		
		frame=new JFrame();
		
		frame.add(panel);
		
		frame.setTitle(" Setting ");
		frame.setSize(800,350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
				
class connectsettingobj implements ActionListener{
	public void actionPerformed(ActionEvent eee){
		
		
		
		
   Object obj = eee.getSource();
			
			if (obj==buttan_about_we){
							frame.setVisible(false);
				abuot_we we=new abuot_we();
			}
			
			else if (obj==buttan_change_password){
							frame.setVisible(false);
		changepassword changee=new changepassword();
			}
			
			else if (obj==buttan_back){
							frame.setVisible(false);
			mainlist listt=new mainlist();
			}
			
			
			
			
		}
		
		
		
	}
	
	
}
