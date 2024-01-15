import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.*;
import java.sql.*;
import javax.swing.text.Document;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
class search{
	JOptionPane pane=new JOptionPane();
	JComboBox combobox=null;
	JLabel combobox_label=null;
	JTextField textfield_search=null;
	JLabel search_label=null;
	JButton buttan_back=null;
	JButton buttan_search=null;
	JButton buttan_print=null;
	JLabel 	label_name=null;
	JLabel 	label_father_name=null;
	JLabel 	label_city=null;
	JLabel 	label_village=null;
	JLabel label_your_number=null;
	JLabel label_passport_number=null;
	
	
	JLabel	label_name2=null;
	
	JLabel label_father_name2=null;
	JLabel label_village2=null;
	JLabel label_your_number2=null;
	JLabel label_parents_number2=null;
	JLabel label_passport_number2=null;
	JLabel label_wing=null;
	JLabel label_floor=null;
	JLabel label_room=null;
	JLabel label_history=null;
	JLabel label_reference=null;
	JLabel label_wing2=null;
	JLabel label_floor2=null;
	JLabel label_room2=null;
	JLabel label_history2=null;
	JLabel label_reference2=null;
	JLabel label_university=null;
	JLabel label_college=null;
	JLabel label_college2=null;
	JLabel label_department=null;
	JLabel label_instead_of_aasha=null;
	JLabel label_university2=null;
	JLabel label_department2=null;
	JLabel label_instead_of_aasha2=null;
	JLabel label_class=null;
	JLabel label_class2=null;
	JLabel label_city2=null;
	
	JLabel label_parents_number=null;
	JLabel labelpicture_person=null;
	JLabel labelpicture_dormitory=null;
	JLabel labelpicture_university=null;
	
	ImageIcon imageicon_person=null;
	ImageIcon imageicon_dormitory=null;
	ImageIcon imageicon_university=null;
	Font font=null;
	JFrame frame=null;
	searchobj seaobj=new searchobj();
	search(){


 font=new Font("ALGERIAC",Font.ITALIC,23);


String [] search={"ID","Name","University","class"};
 combobox = new JComboBox(search);
combobox.setBounds(200,20,200,30);

combobox_label=new JLabel("search ");
combobox_label.setBounds(90,20,200,30);
combobox_label.setFont(font);

textfield_search=new JTextField();
textfield_search.setBounds(200,30,200,30);

 search_label=new JLabel("Search ID");
search_label.setBounds(80,30,200,30);
search_label.setFont(font);

 buttan_back=new JButton();
buttan_back.setBounds(800,40,100,30);
buttan_back.setText("Back");

buttan_back.addActionListener(seaobj);

 buttan_search=new JButton();
buttan_search.setBounds(560,40,100,30);
buttan_search.setText("Search");

buttan_search.addActionListener(seaobj);


 buttan_print=new JButton();
buttan_print.setBounds(680,40,100,30);
buttan_print.setText("Print");
///////////////
////////////

imageicon_person=new ImageIcon("man (4).png");
	 	labelpicture_person=new JLabel(imageicon_person);
labelpicture_person.setBounds(130,15,128,128);


 imageicon_dormitory=new ImageIcon("dormitory.png");
		labelpicture_dormitory=new JLabel(imageicon_dormitory);
labelpicture_dormitory.setBounds(70,20,128,128);



 imageicon_university=new ImageIcon("university.png");
 	labelpicture_university=new JLabel(imageicon_university);
labelpicture_university.setBounds(70,20,128,128);
////////////////////////////////////////
/////////////////////////////////////
////////////////////////////////////////
	 	label_name=new JLabel("name");
	label_name.setBounds(10,150,100,30);
	label_name.setFont(font);
	   	label_father_name=new JLabel("father name");
		label_father_name.setBounds(10,185,200,30);
		label_father_name.setFont(font);
	 	label_city=new JLabel("city");
			label_city.setBounds(10,215,100,30);
			label_city.setFont(font);
		 label_village=new JLabel("village");
		label_village.setBounds(10,250,100,30);
		label_village.setFont(font);
		 	label_your_number=new JLabel("your number");
		label_your_number.setBounds(10,285,200,30);
		label_your_number.setFont(font);
	 label_parents_number=new JLabel("parents number");
			label_parents_number.setBounds(10,320,200,30);
			label_parents_number.setFont(font);
			label_passport_number=new JLabel("passport number");
		label_passport_number.setBounds(10,355,200,30);
		label_passport_number.setFont(font);
		////////////////////////////////////
		////////////////////////////
		/////////////////////////
		//////////////////////////
		
		label_name2=new JLabel("name");
	label_name2.setBounds(210,150,200,30);
	label_name2.setFont(font);
 	label_father_name2=new JLabel("father name");
		label_father_name2.setBounds(210,185,200,30);
		label_father_name2.setFont(font);
 	label_city2=new JLabel("city");
	label_city2.setBounds(210,215,200,30);
	label_city2.setFont(font);
	label_village2=new JLabel("village");
	label_village2.setBounds(210,250,200,30);
	label_village2.setFont(font);
 	label_your_number2=new JLabel("your number");
label_your_number2.setBounds(210,285,200,30);
label_your_number2.setFont(font);
	 	label_parents_number2=new JLabel("parents number");
label_parents_number2.setBounds(210,320,200,30);
label_parents_number2.setFont(font);
label_passport_number2=new JLabel("passport number");
	label_passport_number2.setBounds(210,355,200,30);
	label_passport_number2.setFont(font);
		
		//////////////////////////////
		label_wing=new JLabel("wing");
	label_wing.setBounds(10,160,100,20);
	label_wing.setFont(font);
		label_floor=new JLabel("floor");
		label_floor.setBounds(10,195,100,20);
		label_floor.setFont(font);
	label_room=new JLabel("room");
			label_room.setBounds(10,230,100,20);
			label_room.setFont(font);
		 	label_history=new JLabel("history");
		label_history.setBounds(10,265,100,20);
		label_history.setFont(font);
label_reference=new JLabel("reference");
		label_reference.setBounds(10,300,100,20);
		label_reference.setFont(font);
		
		
		
		
	label_wing2=new JLabel("wing");
	label_wing2.setBounds(150,160,150,20);
	label_wing2.setFont(font);
 	label_floor2=new JLabel("floor");
		label_floor2.setBounds(150,195,150,20);
		label_floor2.setFont(font);
		label_room2=new JLabel("room");
	label_room2.setBounds(150,230,150,20);
	label_room2.setFont(font);
 	label_history2=new JLabel("history");
label_history2.setBounds(150,265,150,20);
label_history2.setFont(font);
 	label_reference2=new JLabel("reference");
label_reference2.setBounds(150,300,150,20);
label_reference2.setFont(font);
		///////////////////////////////////////
		 		label_university=new JLabel("university");
		label_university.setBounds(10,160,200,30);
		label_university.setFont(font);
		 	label_college=new JLabel("college");
			label_college.setBounds(10,195,200,30);
		label_college.setFont(font);
		label_department=new JLabel("department");
		label_department.setBounds(10,230,200,30);
		label_department.setFont(font);
			label_class=new JLabel("class");
		label_class.setBounds(10,265,200,30);
		label_class.setFont(font);
			label_instead_of_aasha=new JLabel("instead aasha");
		label_instead_of_aasha.setBounds(10,300,200,30);
		label_instead_of_aasha.setFont(font);
		
		
	 	label_university2=new JLabel("university");
	label_university2.setBounds(200,160,200,30);
	label_university2.setFont(font);
		 	label_college2=new JLabel("college");
			label_college2.setBounds(200,195,200,30);
			label_college2.setFont(font);
			
 	label_department2=new JLabel("department");
		label_department2.setBounds(200,230,200,30);
		label_department2.setFont(font);
 	label_class2=new JLabel("class");
	label_class2.setBounds(200,265,200,30);
	label_class2.setFont(font);
label_instead_of_aasha2=new JLabel("instead ");
label_instead_of_aasha2.setBounds(200,300,200,30);
label_instead_of_aasha2.setFont(font);
		
		
		/////////////////////////////////////
		
		
		JPanel  panel=new JPanel();
		//panel.setLayout(gridlayout);
		panel.setLayout(null);
		panel.add(label_name);
		panel.add(label_father_name);
		panel.add(label_city);
		panel.add(label_village);
		panel.add(label_your_number);
		panel.add(label_parents_number);
		panel.add(label_passport_number);
		panel.add(label_name2);
		panel.add(label_father_name2);
		panel.add(label_city2);
		panel.add(label_village2);
		panel.add(label_your_number2);
		panel.add(label_parents_number2);
		panel.add(label_passport_number2);
		panel.add(labelpicture_person);
		
///////////////////////////////
JPanel panel2=new JPanel();
	panel2.setLayout(null);
panel2.add(label_university);
panel2.add(label_college);
panel2.add(label_department);
panel2.add(label_class);
panel2.add(label_instead_of_aasha);
panel2.add(label_university2);
panel2.add(label_college2);
panel2.add(label_department2);
panel2.add(label_class2);
panel2.add(label_instead_of_aasha2);
panel2.add(labelpicture_university);

//////////////////////////////
		JPanel panel3=new JPanel();
		panel3.setLayout(null);
		panel3.add(label_wing);
panel3.add(label_floor);
panel3.add(label_room);
panel3.add(label_history);
panel3.add(label_reference);
panel3.add(label_wing2);
panel3.add(label_floor2);
panel3.add(label_room2);
panel3.add(label_history2);
panel3.add(label_reference2);
panel3.add(labelpicture_dormitory);


//////////panel5
JPanel panel5=new JPanel();
/////////
panel5.setLayout(null);
panel5.add(buttan_print);
panel5.add(buttan_search);
panel5.add(buttan_back);
//panel5.add(combobox_label);
//panel5.add(combobox);
panel5.add(textfield_search);
panel5.add(search_label);







//////////////////////////add panels

		
JPanel panel4=new JPanel();

	
panel.setBounds(10,20,400,400);
panel2.setBounds(690,20,330,400);
panel3.setBounds(410,20,280,400);
panel4.setBounds(10,20,300,700);
panel5.setBounds(10,420,1010,110);
panel4.setLayout(null);
		panel4.add(panel);
		panel4.add(panel2);
		panel4.add(panel3);
		panel4.add(panel5);
	////////////////titleborder	
	

Color col=new Color(0,0,0);
Border border=BorderFactory.createLineBorder(col,1);
TitledBorder titleborder= new TitledBorder(border,"Student");
titleborder.setTitleJustification(TitledBorder.CENTER);


Color coll=new Color(0,0,0);
Border border2=BorderFactory.createLineBorder(coll.BLACK,1);
TitledBorder titleborder2= new TitledBorder(border2,"University");
titleborder2.setTitleJustification(TitledBorder.CENTER);


Color colll=new Color(0,0,0);
Border border3=BorderFactory.createLineBorder(colll.BLACK,1);
TitledBorder titleborder3= new TitledBorder(border3,"Dormitory");
titleborder3.setTitleJustification(TitledBorder.CENTER);


Color collll=new Color(0,0,0);
Border border4=BorderFactory.createLineBorder(collll.BLACK,1);
TitledBorder titleborder4= new TitledBorder(border4);
titleborder4.setTitleJustification(TitledBorder.CENTER);
panel.setBorder(titleborder);
panel2.setBorder(titleborder2);
panel3.setBorder(titleborder3);
panel5.setBorder(titleborder4);

		

		
		
		
		frame=new JFrame();
		
		frame.add(panel4);
		
		frame.setTitle("search Student");
		frame.setSize(1040,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	

}			
			
	
	
	
	
class searchobj implements ActionListener{
	public void actionPerformed(ActionEvent eeee){
		
		
   Object obg = eeee.getSource();
		if (obg==buttan_back){
				frame.setVisible(false);
				mainlist mainl= new mainlist();
				
		}
		
		 if (obg== buttan_search){
			
			
			String ID=textfield_search.getText();
			
			
			try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
			if(conn!=null)
			{			String search = textfield_search.getText();	
					System.out.println("OK");
					
			String person ="select name,father_name,city,village,student_number,parents_number,passport_number  from students where ID="+search;
				PreparedStatement ps = conn.prepareStatement(person);
				System.out.println("OK");

			ResultSet rs = ps.executeQuery();
	System.out.println("OK");			
			//ps.setInt(1,ID);
		
		while (rs.next())
			{
		String name=rs.getString(1);
		String father_name=	rs.getString(2);
		String village	=rs.getString(3);
		String city 	=rs.getString(4);
		String parents_number =	rs.getString(5);
		String student_number=	rs.getString(6);
		String passport_number=	rs.getString(7);
			
				  label_name2.setText(name);
    			   label_father_name2.setText(father_name);
			  label_village2.setText(village);
			   label_city2.setText(city);
			   label_parents_number2.setText(parents_number);
			   label_passport_number2.setText(passport_number);
			  label_your_number2.setText(student_number);
			
			}
			
			System.out.println("OK");
			///////////////
			String dormitoryy ="select wing,floor,room,history,reference from dormitory where ID="+search;
				PreparedStatement ss = conn.prepareStatement(dormitoryy);
					System.out.println("OK");
					
		
		ResultSet rr = ss.executeQuery();
					System.out.println("OK");
		
		
		while (rr.next()!=false)
			{
		String wing	=rr.getString(1);
		String floor=	rr.getString(2);
		String room=	rr.getString(3);
		String history =	rr.getString(4);
		String reference =	rr.getString(5);
			

			
			   label_wing2.setText(wing);
			   label_floor2.setText(floor);
			   label_room2.setText(room);
			  label_history2.setText(history);
		
		  label_reference2.setText(reference);
			
						
	//ss.setInt(6,ID);
			}
			System.out.println("OK");
			
			////////////////////////
			
			String universityy ="select university,college,department,classes,instead_aasha from university where ID="+search;
				PreparedStatement pss = conn.prepareStatement(universityy);
					System.out.println("OK");
			
			
			
			ResultSet rss = pss.executeQuery();
					System.out.println("OK");
			
		while (rss.next())
			{
		String university=rss.getString(1);
		String college=rss.getString(2);
		String department=rss.getString(3);
		String classes=rss.getString(4);
		String instead_aasha=rss.getString(5);
		


			
			 label_university2.setText(university);
			   label_college2.setText(college);
			  label_department2.setText(department);
			  label_class2.setText(classes);
			   label_instead_of_aasha2.setText(instead_aasha);
			}
			
		

		
				
			
			
			if(rs!=null && rr!=null && rss!=null)
			{
				System.out.println("Data inserted...");
			}
							else{
								pane.showMessageDialog(frame,"Sorry, data not inserted");
							}
							
				
				}
						else
						{
							
							pane.showMessageDialog(frame,"Sorry, there is no connection established");
						}
						
						
						
			}			
						
					
					catch(ClassNotFoundException notfound)
					{
						pane.showMessageDialog(frame,"Sorry, class Probelm");
					}
					catch(SQLException sqlexp)
					{
						pane.showMessageDialog(frame,"Sorry, some sql probem");
					}
					catch(Exception exp)
					{
						pane.showMessageDialog(frame,"Some General Exception");
					}
				
			
		
	}
	
	
		}
	}
}


