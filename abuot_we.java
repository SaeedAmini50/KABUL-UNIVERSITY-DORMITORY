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
import javax.swing.JComboBox;
class abuot_we{
	

	JLabel label_nameteacher=null;
	JLabel label_name2teacher=null;
	
	
	JLabel 	label_phonenumberteacher=null;
	JLabel 	label_phoneteacher=null;
	
	
	JLabel 	label_Emailteacher=null;
	JLabel label_Emailaddressteacher=null;
	
	JLabel label_addressteacher=null;
	JLabel label_address2teacher=null;

	
	
	JLabel label_teacher=null;
	JLabel label_progromer=null;

	
	JLabel labelpicture_person=null;
	JLabel label_name=null;
	JLabel label_name2=null;
	JLabel labelpicture_dormitory=null;
	JLabel label_name_application=null;
	JButton buttan_back=null;
	JLabel 	label_Version=null;
	JLabel 	label_copy_right=null;
	
	
	JLabel 	label_phonenumber=null;
	JLabel 	label_phone=null;
	
	
	JLabel 	label_Email=null;
	JLabel label_Emailaddress=null;
	
	JLabel label_address=null;
	JLabel label_address2=null;


	ImageIcon imageicon_programer=null;
	ImageIcon imageicon_teacher=null;
	
	Font font=null;
	Font font2=null;
	JFrame frame=null;
	abuot_weobj weobj=new abuot_weobj();
	abuot_we(){


 font=new Font("ALGERIAC",Font.ITALIC,23);
 font2=new Font("ALGERIAC",Font.ITALIC,30);
JPanel  panel=new JPanel();

 buttan_back=new JButton();
buttan_back.setBounds(490,580,100,30);
buttan_back.setText("Back");
buttan_back.addActionListener(weobj);

/////////////
///////////////
////////////

imageicon_programer=new ImageIcon("pro.png");
	 	labelpicture_person=new JLabel(imageicon_programer);
labelpicture_person.setBounds(20,180,128,128);


 imageicon_teacher=new ImageIcon("teacher.jpg");
		labelpicture_dormitory=new JLabel(imageicon_teacher);
labelpicture_dormitory.setBounds(20,400,128,128);




/////////////


	 	label_progromer=new JLabel("Progromer");
	label_progromer.setBounds(250,140,400,50);
	label_progromer.setFont(font2);
	   	label_teacher=new JLabel("Teacher Introduction");
		label_teacher.setBounds(210,350,400,50);
		label_teacher.setFont(font2);








	 	label_name=new JLabel("name :");
	label_name.setBounds(170,180,100,30);
	label_name.setFont(font);
	   	label_name2=new JLabel("Saeed Amini");
		label_name2.setBounds(350,180,200,30);
		label_name2.setFont(font);


	 	label_phone=new JLabel("Phone Number :");
	label_phone.setBounds(170,220,200,30);
	label_phone.setFont(font);
	   	label_phonenumber=new JLabel("0093791506750");
		label_phonenumber.setBounds(350,220,200,30);
		label_phonenumber.setFont(font);


	 	label_Email=new JLabel("Email:");
	label_Email.setBounds(170,260,200,30);
	label_Email.setFont(font);
	   	label_Emailaddress=new JLabel("saeedamini506750@email.com");
		label_Emailaddress.setBounds(350,260,400,30);
		label_Emailaddress.setFont(font);



	 	label_address=new JLabel("Address :");
	label_address.setBounds(170,300,200,30);
	label_address.setFont(font);
	   	label_address2=new JLabel("Kabul University Dormitory");
		label_address2.setBounds(350,300,400,30);
		label_address2.setFont(font);


	 	label_name_application=new JLabel("Database For Kabul University Dormitory ");
			label_name_application.setBounds(20,10,700,40);
			label_name_application.setFont(font2);
		
		
		
 label_Version=new JLabel("Version 1.1");
		label_Version.setBounds(20,50,200,40);
		label_Version.setFont(font2);
		
		
		
		
 label_copy_right=new JLabel("Copy Right @ 2022/3/6");
		label_copy_right.setBounds(20,90,400,40);
		label_copy_right.setFont(font2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	 	label_nameteacher=new JLabel("name :");
	label_nameteacher.setBounds(170,400,100,30);
	label_nameteacher.setFont(font);
	   	label_name2teacher=new JLabel("Moheb fouroq");
		label_name2teacher.setBounds(350,400,200,30);
		label_name2teacher.setFont(font);


	 	label_phoneteacher=new JLabel("Phone Number :");
	label_phoneteacher.setBounds(170,440,200,30);
	label_phoneteacher.setFont(font);
	   	label_phonenumberteacher=new JLabel("0093793500378");
		label_phonenumberteacher.setBounds(350,440,200,30);
		label_phonenumberteacher.setFont(font);


	 	label_Emailteacher=new JLabel("Email:");
	label_Emailteacher.setBounds(170,480,200,30);
	label_Emailteacher.setFont(font);
	   	label_Emailaddressteacher=new JLabel("mohebfouroq@email.com");
		label_Emailaddressteacher.setBounds(350,480,400,30);
		label_Emailaddressteacher.setFont(font);



	 	label_addressteacher=new JLabel("Address :");
	label_addressteacher.setBounds(170,520,200,30);
	label_addressteacher.setFont(font);
	   	label_address2teacher=new JLabel("Hearat University");
		label_address2teacher.setBounds(350,520,400,30);
		label_address2teacher.setFont(font);

/////////////////////////////////


		panel.add(label_name);
		panel.add(label_name2);
		panel.add(label_name_application);
		panel.add(label_Version);
		panel.add(label_copy_right);
		panel.add(label_phone);
		panel.add(label_phonenumber);
		panel.add(label_Email);
		panel.add(label_Emailaddress);
		panel.add(label_address);
		panel.add(label_address2);
		panel.add(labelpicture_dormitory);
		panel.add(labelpicture_person);
		
		panel.add(label_nameteacher);
		panel.add(label_name2teacher);
		
		panel.add(label_phoneteacher);
		panel.add(label_phonenumberteacher);
		panel.add(label_Emailteacher);
		panel.add(label_Emailaddressteacher);
		panel.add(label_addressteacher);
		panel.add(label_address2teacher);
		panel.add(label_teacher);
		panel.add(label_progromer);
		panel.add(buttan_back);
		
		panel.setLayout(null);
		
		
		frame=new JFrame();
		
		frame.add(panel);
		//frame.add(panel,BorderLayout.WEST);
		frame.setTitle(" About We ");
		frame.setSize(700,700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	

	}
	
	
				
class abuot_weobj implements ActionListener{
	public void actionPerformed(ActionEvent eee){
		
		
		
		
   Object obj = eee.getSource();
						frame.setVisible(false);
			if (obj==buttan_back){
				
				connectsetting conn=new connectsetting();
			}
	
	
	
	}
	
	}	
}
