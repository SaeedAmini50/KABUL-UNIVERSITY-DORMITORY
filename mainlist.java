import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class mainlist{
	
	Font font=null;
		Color col=null;
	Border border=null;
	Border border2=null;
	ImageIcon imageicon=null;
JButton button_Add_Student=null;
	JLabel label_Add_Student=null;
	ImageIcon imageicon_Show_Students=null;
JButton button_Show_Students=null;
	JLabel label_Show_Students=null;
ImageIcon imageicon_search=null;
	JButton button_Search_Student=null;
	JLabel label_Search_Student=null;
	ImageIcon imageicon_edit=null;
	JButton button_Edit_Student=null;
	JLabel label_Edit_Student=null;
	ImageIcon imageicon_Setting=null;
	JButton button_Setting;
	JLabel label_Setting=null;
	ImageIcon imageicon_about_we=null;
	JButton button_About_we=null;
	JLabel label_About_We=null;
JFrame  frame=null;

mainlistobj mainobj = new mainlistobj();
 	mainlist(){
		
		/////font
 font=new Font("ALGERIAC",Font.ITALIC,25);
 
/////title border
 col=new Color(0,0,0);
 border=BorderFactory.createLineBorder(col,3);
TitledBorder titleborder= new TitledBorder(border," For Students  ");
		titleborder.setTitleJustification(TitledBorder.LEFT);



border2=BorderFactory.createLineBorder(col,3);
TitledBorder titleborder2= new TitledBorder(border2," For Setting  ");
		titleborder2.setTitleJustification(TitledBorder.LEFT);


/////////////////////////// add
 imageicon=new ImageIcon("add student.png");
button_Add_Student=new JButton(imageicon);
button_Add_Student.setBounds (50,20,128,128);
button_Add_Student.addActionListener(mainobj);


 label_Add_Student=new JLabel("Add Student");
label_Add_Student.setBounds (50,150,200,35);
label_Add_Student.setFont(font);



///////////show
imageicon_Show_Students=new ImageIcon("people.png");
 button_Show_Students=new JButton(imageicon_Show_Students);
button_Show_Students.setBounds (320,20,128,128);

button_Show_Students.addActionListener (mainobj);


 label_Show_Students=new JLabel("Show Students");
label_Show_Students.setBounds (300,150,250,35);
label_Show_Students.setFont(font);

/////////search
 imageicon_search=new ImageIcon("search.png");
button_Search_Student=new JButton(imageicon_search);
button_Search_Student.setBounds (600,20,128,128);

button_Search_Student.addActionListener (mainobj);

 label_Search_Student=new JLabel("Search Student");
label_Search_Student.setBounds (580,150,250,35);
label_Search_Student.setFont(font);


///////////////////
////////////////////
////////////////////
////////////////////


////////edit

 imageicon_edit=new ImageIcon("edit.png");
 button_Edit_Student=new JButton(imageicon_edit);
button_Edit_Student.setBounds (50,20,128,128);

button_Edit_Student.addActionListener (mainobj);

 label_Edit_Student=new JLabel("Edit Student");
label_Edit_Student.setBounds (50,150,200,35);
label_Edit_Student.setFont(font);

/////setting
imageicon_Setting=new ImageIcon("setting.png");
 button_Setting=new JButton(imageicon_Setting);
button_Setting.setBounds (320,20,128,128);

button_Setting.addActionListener (mainobj);

label_Setting=new JLabel("Setting");
label_Setting.setBounds (330,150,250,35);
label_Setting.setFont(font);
////show room


imageicon_about_we=new ImageIcon("dormitory.png");
 button_About_we=new JButton(imageicon_about_we);
button_About_we.setBounds (600,20,128,128);
button_About_we.addActionListener (mainobj);


label_About_We=new JLabel("Show Room");
label_About_We.setBounds (600,150,200,35);
label_About_We.setFont(font);



JPanel panel=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();
panel3.add(panel);
panel3.add(panel2);

/////
panel.setBounds(20,20,780,210);
panel2.setBounds(20,270,780,210);


panel2.setBorder(titleborder2);












panel.add(label_Add_Student);
panel.add(label_Show_Students);
panel.add(label_Search_Student);
panel2.add(label_Edit_Student);
panel2.add(label_Setting);
panel2.add(label_About_We);
panel.setLayout(null);
panel2.setLayout(null);
panel.add(button_Add_Student);
panel.add(button_Show_Students);
panel.add(button_Search_Student);
panel2.add(button_Edit_Student);
panel2.add(button_Setting);
panel2.add(button_About_we);
panel.setBorder(titleborder);

 frame=new JFrame();
panel3.setLayout(null);
frame.add(panel3);
frame.setSize(850,550);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("mainpage");
frame.setLocationRelativeTo(null);
frame.setVisible(true);

}
class mainlistobj implements ActionListener{
	
	public void actionPerformed(ActionEvent eedd){
		
   Object obg = eedd.getSource();
		if (obg==button_Add_Student){
			frame.setVisible(false);
			addstudent adds=new addstudent();   
		}
		else if (obg==button_Edit_Student){
			frame.setVisible(false);
				editstudent edits=new editstudent(); 
		}
		
		else if (obg==button_Search_Student){
			frame.setVisible(false);
			search sea=new search(); 
		}
		
		else if (obg==button_Setting){
			frame.setVisible(false);
			connectsetting conn=new connectsetting(); 
		}
		
		else if (obg==button_Show_Students){
			frame.setVisible(false);
				showall showa=new showall(); 
		}
		else if (obg==button_About_we){
			frame.setVisible(false);
			choseroom choser=new choseroom(); 
		}
	}
}
}