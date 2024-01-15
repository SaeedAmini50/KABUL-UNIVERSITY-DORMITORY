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
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
class addstudent{
	
	

	
	JComboBox combobox=null;
	JLabel combobox_label=null;
	JTextField textfield_search=null;
	JLabel search_label=null;
	JButton buttan_back=null;
	JButton buttan_add_student=null;
	JButton buttan_print=null;
	
	
	JLabel 	label_name=null;
	JLabel 	label_father_name=null;
	JLabel 	label_city=null;
	JLabel 	label_village=null;
	JLabel label_your_number=null;
	JLabel label_passport_number=null;
	
	JTextField  textfield_ID_student=null;
	JTextField  textfield_ID_dormitory=null;
	JTextField  textfield_ID_university=null;
	
	JLabel label_ID_student=null;
	JLabel label_ID_dormitory=null;
	JLabel label_ID_university=null;
	
	
	JTextField	textfield_name=null;
	JTextField textfield_father_name=null;
	JTextField textfield_village=null;
	JTextField textfield_your_number=null;
	JTextField textfield_parents_number=null;
	JTextField textfield_passport_number=null;
	JTextField textfield_city=null;
	
	
	JFrame frame=null;
	
//JOptionPane pane=new JOptionPane();
	JLabel label_wing=null;
	JLabel label_floor=null;
	JLabel label_room=null;
	JLabel label_history=null;
	JLabel label_reference=null;
	
	JTextField textfield_wing=null;
	JTextField textfield_floor=null;
	JTextField textfield_room=null;
	JTextField textfield_history=null;
	JTextField textfield_reference=null;
	
	
	JLabel label_university=null;
	JLabel label_college=null;
	JLabel label_department=null;
	JLabel label_instead_of_aasha=null;
	
	
	JTextField textfield_university=null;
	JTextField textfield_college=null;
	JTextField textfield_department=null;
	JTextField textfield_instead_of_aasha=null;
	
	JTextField textfield_class=null;
	
	JLabel label_city2=null;
	JLabel label_class=null;
	
	JOptionPane pane=null;
	
	JLabel label_parents_number=null;
	JLabel labelpicture_person=null;
	JLabel labelpicture_dormitory=null;
	JLabel labelpicture_university=null;
	
	ImageIcon imageicon_person=null;
	ImageIcon imageicon_dormitory=null;
	ImageIcon imageicon_university=null;
	Font font=null;
	
addstudentobg addobj=new addstudentobg();
	addstudent(){


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
search_label.setBounds(60,30,200,30);
search_label.setFont(font);

 buttan_back=new JButton();
buttan_back.setBounds(570,60,150,30);
buttan_back.setText("Back");
buttan_back.addActionListener(addobj);

 buttan_add_student=new JButton();
buttan_add_student.setBounds(320,60,150,30);
buttan_add_student.setText("AddStudent");
buttan_add_student.addActionListener(addobj);

 buttan_print=new JButton();
buttan_print.setBounds(680,40,100,30);
buttan_print.setText("Print");
////////////////
///////////////////
/////////////
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

	 	label_ID_student=new JLabel("ID");
	label_ID_student.setBounds(10,150,100,30);
	label_ID_student.setFont(font);


	 	label_name=new JLabel("name");
	label_name.setBounds(10,185,200,30);
	label_name.setFont(font);
	   	label_father_name=new JLabel("father name");
		label_father_name.setBounds(10,215,200,30);
		label_father_name.setFont(font);
	 	label_city=new JLabel("city");
			label_city.setBounds(10,250,100,30);
			label_city.setFont(font);
		 label_village=new JLabel("village");
		label_village.setBounds(10,285,200,30);
		label_village.setFont(font);
		 	label_your_number=new JLabel("your number");
		label_your_number.setBounds(10,320,200,30);
		label_your_number.setFont(font);
	 label_parents_number=new JLabel("parents number");
			label_parents_number.setBounds(10,355,200,30);
			label_parents_number.setFont(font);
			label_passport_number=new JLabel("passport number");
		label_passport_number.setBounds(10,390,200,30);
		label_passport_number.setFont(font);
		////////////////////////////////////
		////////////////////////////
		/////////////////////////
		//////////////////////////
		
		textfield_ID_student=new JTextField();
		textfield_ID_student.setBounds(200,150,180,30);
		textfield_ID_student.setFont(font);
	textfield_ID_student.setEnabled(false);
		
	textfield_name=new JTextField();
	textfield_name.setBounds(200,185,180,30);
	textfield_name.setFont(font);
 	textfield_father_name=new JTextField();
		textfield_father_name.setBounds(200,215,180,30);
		textfield_father_name.setFont(font);
 	textfield_city=new JTextField();
	textfield_city.setBounds(200,250,180,30);
	textfield_city.setFont(font);
	textfield_village=new JTextField();
	textfield_village.setBounds(200,285,180,30);
	textfield_village.setFont(font);
 	textfield_your_number=new JTextField();
textfield_your_number.setBounds(200,320,180,30);
textfield_your_number.setFont(font);
	 	textfield_parents_number=new JTextField();
textfield_parents_number.setBounds(200,355,180,30);
textfield_parents_number.setFont(font);
textfield_passport_number=new JTextField();
	textfield_passport_number.setBounds(200,390,180,30);
	textfield_passport_number.setFont(font);
		
		//////////////////////////////
		
	 	label_ID_dormitory=new JLabel("ID");
	label_ID_dormitory.setBounds(10,160,100,30);
	label_ID_dormitory.setFont(font);
		
		label_wing=new JLabel("wing");
	label_wing.setBounds(10,195,100,30);
	label_wing.setFont(font);
		label_floor=new JLabel("floor");
		label_floor.setBounds(10,230,100,30);
		label_floor.setFont(font);
	label_room=new JLabel("room");
			label_room.setBounds(10,265,100,30);
			label_room.setFont(font);
		 	label_history=new JLabel("history");
		label_history.setBounds(10,300,100,30);
		label_history.setFont(font);
label_reference=new JLabel("reference");
		label_reference.setBounds(10,335,100,30);
		label_reference.setFont(font);
		
		
		
		
		
		
		textfield_ID_dormitory=new JTextField();
		textfield_ID_dormitory.setBounds(120,160,150,30);
		textfield_ID_dormitory.setFont(font);
		textfield_ID_dormitory.setEnabled(false);
		
	textfield_wing=new JTextField();
	textfield_wing.setBounds(120,195,150,30);
	textfield_wing.setFont(font);
 	textfield_floor=new JTextField();
		textfield_floor.setBounds(120,230,150,30);
		textfield_floor.setFont(font);
		textfield_room=new JTextField();
	textfield_room.setBounds(120,265,150,30);
	textfield_room.setFont(font);
 	textfield_history=new JTextField();
textfield_history.setBounds(120,300,150,30);
textfield_history.setFont(font);
 	textfield_reference=new JTextField();
textfield_reference.setBounds(120,335,150,30);
textfield_reference.setFont(font);
		///////////////////////////////////////
		
		
	 	label_ID_university=new JLabel("ID");
	label_ID_university.setBounds(10,160,200,30);
	label_ID_university.setFont(font);
		
		 	label_university=new JLabel("university");
		label_university.setBounds(10,195,200,30);
		label_university.setFont(font);
		 	label_college=new JLabel("college");
			label_college.setBounds(10,230,200,30);
		label_college.setFont(font);
		label_department=new JLabel("department");
		label_department.setBounds(10,265,200,30);
		label_department.setFont(font);
			label_class=new JLabel("class");
		label_class.setBounds(10,300,200,30);
		label_class.setFont(font);
			label_instead_of_aasha=new JLabel("instead aasha");
		label_instead_of_aasha.setBounds(10,335,200,30);
		label_instead_of_aasha.setFont(font);
		
		
		
		
		textfield_ID_university=new JTextField();
		textfield_ID_university.setBounds(170,160,150,30);
		textfield_ID_university.setFont(font);
		textfield_ID_university.setEnabled(false);
		
		
	 	textfield_university=new JTextField();
	textfield_university.setBounds(170,195,150,30);
	textfield_university.setFont(font);
	textfield_college=new JTextField();
	textfield_college.setBounds(170,230,150,30);
	textfield_college.setFont(font);
	textfield_department=new JTextField();
		textfield_department.setBounds(170,265,150,30);
		textfield_department.setFont(font);
 	textfield_class=new JTextField();
	textfield_class.setBounds(170,300,150,30);
	textfield_class.setFont(font);
textfield_instead_of_aasha=new JTextField();
textfield_instead_of_aasha.setBounds(170,335,150,30);
textfield_instead_of_aasha.setFont(font);
		
		
		/////////////////////////////////////
		
		
		JPanel  panel=new JPanel();
		//panel.setLayout(gridlayout);
		panel.setLayout(null);
		panel.add(label_ID_student);
		panel.add(label_name);
		panel.add(label_father_name);
		panel.add(label_city);
		panel.add(label_village);
		panel.add(label_your_number);
		panel.add(label_parents_number);
		panel.add(label_passport_number);
				panel.add(textfield_ID_student);
		panel.add(textfield_name);
		panel.add(textfield_father_name);
		panel.add(textfield_city);
		panel.add(textfield_village);
		panel.add(textfield_your_number);
		panel.add(textfield_parents_number);
		panel.add(textfield_passport_number);
		panel.add(labelpicture_person);
		
///////////////////////////////
JPanel panel2=new JPanel();
	panel2.setLayout(null);
panel2.add(label_ID_university);
panel2.add(label_university);
panel2.add(label_college);
panel2.add(label_department);
panel2.add(label_class);
panel2.add(label_instead_of_aasha);
panel2.add(textfield_ID_university);
panel2.add(textfield_university);
panel2.add(textfield_college);
panel2.add(textfield_department);
panel2.add(textfield_class);
panel2.add(textfield_instead_of_aasha);
panel2.add(labelpicture_university);

//////////////////////////////
		JPanel panel3=new JPanel();
		panel3.setLayout(null);
panel3.add(label_ID_dormitory);
panel3.add(label_wing);
panel3.add(label_floor);
panel3.add(label_room);
panel3.add(label_history);
panel3.add(label_reference);


panel3.add(textfield_ID_dormitory);
panel3.add(textfield_wing);
panel3.add(textfield_floor);
panel3.add(textfield_room);
panel3.add(textfield_history);
panel3.add(textfield_reference);

panel3.add(labelpicture_dormitory);


//////////panel5
JPanel panel5=new JPanel();
/////////
panel5.setLayout(null);
//panel5.add(buttan_print);
panel5.add(buttan_add_student);
panel5.add(buttan_back);
//panel5.add(combobox_label);
//panel5.add(combobox);
//panel5.add(textfield_search);
//panel5.add(search_label);







//////////////////////////add panels

		
JPanel panel4=new JPanel();

	
panel.setBounds(10,20,400,450);
panel2.setBounds(690,20,330,450);
panel3.setBounds(410,20,280,450);
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
TitledBorder titleborder= new TitledBorder(border,"AddStudent");
titleborder.setTitleJustification(TitledBorder.CENTER);


Color coll=new Color(0,0,0);
Border border2=BorderFactory.createLineBorder(coll.BLACK,1);
TitledBorder titleborder2= new TitledBorder(border2,"AddUniversity");
titleborder2.setTitleJustification(TitledBorder.CENTER);


Color colll=new Color(0,0,0);
Border border3=BorderFactory.createLineBorder(colll.BLACK,1);
TitledBorder titleborder3= new TitledBorder(border3,"AddDormitory");
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
		//frame.setLayout(borderlayout);
		frame.add(panel4);
		//frame.add(panel,BorderLayout.WEST);
		frame.setTitle("Add Student");
		frame.setSize(1040,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	

}			
			
	
	
	
class addstudentobg implements ActionListener{
	public void actionPerformed(ActionEvent eeee){
		
		
				   
				String ID = textfield_ID_student.getText();
				String name = textfield_name.getText();
    			String father_name = textfield_father_name.getText();
			String village = textfield_village.getText();
			String city = textfield_city.getText();
			String parents_number = textfield_parents_number.getText();
			String passport_number = textfield_passport_number.getText();
			String student_number = textfield_your_number.getText();
			
			
			
			String wing = textfield_wing.getText();
			String floor = textfield_floor.getText();
			String room = textfield_room.getText();
			String history = textfield_history.getText();
			String instead_aasha = textfield_instead_of_aasha.getText();
		String reference = textfield_reference.getText();
			
			
		
			
			String university = textfield_university.getText();
			String college = textfield_college.getText();
			String search = textfield_search.getText();
			String department = textfield_department.getText();
			String classes= textfield_class.getText();
			
		
		

		
					
   Object obg = eeee.getSource();
			
		 String IDDD=null;
		 
		 	int IDD =0;
		if (obg==buttan_back){
			
			frame.setVisible(false);
			mainlist mainl= new mainlist();
		}
		if(obg==buttan_add_student){
			
			//System.out.println("add student");
		
			
			
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
			if(conn!=null)
			{
		
					System.out.println("OK");
			String person ="insert into students (ID,name,father_name,city,village,student_number,parents_number,passport_number)values(student_ID.nextval,?,?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(person);
				System.out.println("OK");

			//ps.setInt(1,ID);
		//	ps.getString("student_ID.nextval");
			
			
			ps.setString(1,name);
			ps.setString(2,father_name);
			ps.setString(3,city);
			ps.setString(4,village);
			ps.setString(5,student_number);
			ps.setString(6,parents_number);
			ps.setString(7,passport_number);
			
			
			System.out.println("OK");	
		int rs = ps.executeUpdate();
			System.out.println("OKk");
			String ID_person ="select student_ID.currval from students";
			PreparedStatement pssp = conn.prepareStatement(ID_person);
			ResultSet rssr=pssp.executeQuery();
			System.out.println("OK");
		
			
			System.out.println("OK");
			while (rssr.next()){
				 
			 IDD = rssr.getInt(1);
	
			}
			int ID2=IDD;
			  IDDD=Integer.toString(IDD);
			  
			 textfield_ID_student.setText(IDDD);
			 textfield_ID_dormitory.setText(IDDD);
			 textfield_ID_university.setText(IDDD);
	 
		System.out.println(ID2);
		System.out.println(IDD);
		System.out.println(IDDD);
		//System.out.println(IDDD2);
			String IDDD2=textfield_ID_student.getText();
		//int intsoft =infs.getInt("soft");
			//String stringsoft=Integer.toString(intsoft);
			//field_soft.setText(stringsoft);
			///////////////
			
			String dormitoryy =" insert into dormitory(ID,wing,floor,room,history,reference)values("+ID2+",?,?,?,?,?)";
				PreparedStatement ss = conn.prepareStatement(dormitoryy);
					System.out.println("OK");
					
		
			//ss.setInt(1,ID);
			ss.setString(1,wing);
			ss.setString(2,floor);
			ss.setString(3,room);
			ss.setString(4,history);
			ss.setString(5,reference);
	//ss.setInt(6,ID);
			
			System.out.println("OK");
			
			////////////////////////
			int rr = ss.executeUpdate();
					System.out.println("OK");
			String universityy ="insert into university(ID,university,college,department,classes,instead_aasha)values("+ID2+",?,?,?,?,?)";
				PreparedStatement pss = conn.prepareStatement(universityy);
					System.out.println("OKkkk");
			
			
			//pss.setInt(1,ID);
			pss.setString(1,university);
			pss.setString(2,college);
			pss.setString(3,department);
			pss.setString(4,classes);
			pss.setString(5,instead_aasha);
			
			
			int rss = pss.executeUpdate();
					System.out.println("OKkkkkkk");
			
			
			
			
			if(rs!=0 && rr!=0 && rss!=0 && rssr!=null){
	pane.showMessageDialog(frame,"DATA INSERTED...");
	frame.setVisible(false);
	mainlist mainl= new mainlist();
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