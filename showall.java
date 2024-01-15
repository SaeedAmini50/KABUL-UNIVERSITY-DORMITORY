import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import java.sql.*;

class showall{
	Connection con=null;
	PreparedStatement ps=null;
		PreparedStatement pss = null;
		PreparedStatement psa = null;
		PreparedStatement psd = null;
		PreparedStatement pse = null;
					String name  = null;
					String father_name=null;
					String city=null;
					String village=null;
					String student_number=null;
					String parents_number=null;
					String passport_number=null;
					String wing=null;
					String floor=null;
					String room=null;
					String history=null;
					String reference=null;
					String university=null;
					String college=null;
					String department=null;
					String classes=null;
					String instead_aasha=null;
					int ID=0;
	ResultSet rs=null;
	ResultSet rss=null;
	ResultSet rsa=null;
	ResultSet rse=null;
	ResultSet rsd=null;
	
	JRadioButton radioo1=null;
	JRadioButton radioo2=null;
	JRadioButton radioo3=null;
	JRadioButton radioo4=null;
	JRadioButton radioo5=null;
	
	DefaultTableModel table=null;
	JTable tbl=null;
	JPanel panel=null;
	JPanel panel2=null;
	JScrollPane scroll =null;
	Color coll=null;
	Border border2=null;
	TitledBorder titleborder2=null;
	JButton buttan_back=null;
	JButton button_print=null;
	JFrame frame=null;
	showallobj showobj=new showallobj();
	JOptionPane pane=new JOptionPane();
	
	
showall(){

panel =new JPanel();


	 table = new DefaultTableModel();

	
tbl = new JTable(table);

tbl.setBounds(20,20,950,500);
	 scroll = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			
		table.addColumn("ID");
		table.addColumn("Name");
		table.addColumn("fathername");
		table.addColumn("city");
		table.addColumn("village");
		table.addColumn("your number");
		table.addColumn("parents number");
		table.addColumn("passport number");
		table.addColumn("wing");
		table.addColumn("floor");
		table.addColumn("room");
		table.addColumn("history");
		table.addColumn("reference");
		table.addColumn("college");
		table.addColumn("univercity");
		table.addColumn("department");
		table.addColumn("class");
		table.addColumn("instead_of_aasha");
		
		
		
	
	 //String IDD=Integer.toString(ID);
		

					String IDD="ID";		
					 name  ="name" ;
					 father_name="father_name";
					 city="city";
					 village="village";
					 student_number="student number";
					 parents_number="parents number";
					 passport_number="passport number";
					 wing="wing";
					 floor="floor";
					 room="room";
					 history="history";
					 reference="reference";
					 university="univercity";
					 college="college";
					 department="department";
					 classes="class";
					 instead_aasha="instead_of_aasha";
					
	table.addRow(new Object[] {IDD,name,father_name,city,village,student_number,parents_number,passport_number,wing,floor,room,history,reference,university,college,department,classes,instead_aasha,ID});




 coll=new Color(0,0,0);
 border2=BorderFactory.createLineBorder(coll.BLACK,2);
titleborder2= new TitledBorder(border2,"  AllStudents  ");
titleborder2.setTitleJustification(TitledBorder.CENTER);



 button_print=new JButton();
button_print.setText("Print");
button_print.setBounds(650,600,150,30);
button_print.addActionListener(showobj);



 buttan_back=new JButton();
buttan_back.setBounds(850,600,150,30);
buttan_back.setText("Back");
buttan_back.addActionListener(showobj);



//////////////////
panel2=new JPanel();

panel.setLayout(null);
panel2.setLayout(null);
/////////

panel.add(new JScrollPane (tbl));
panel.setBorder(titleborder2);
panel.add(tbl);
panel.add(scroll);

////////////////////
panel2.add(panel);
panel.setBounds(50,50,1000,540);




panel2.add(button_print);
panel2.add(buttan_back);

/////////////radio button


ButtonGroup group_radioo_Button=new ButtonGroup();


radioo5=new JRadioButton("ShowAll");
radioo5.addActionListener(showobj);
 radioo1=new JRadioButton("class 1");
radioo1.addActionListener(showobj);
 radioo2=new JRadioButton("class 2");
radioo2.addActionListener(showobj);
 radioo3=new JRadioButton("class 3");
radioo3.addActionListener(showobj);
 radioo4=new JRadioButton("class 4");
radioo4.addActionListener(showobj);


	group_radioo_Button.add(radioo5);
	group_radioo_Button.add(radioo1);
	group_radioo_Button.add(radioo2);
	group_radioo_Button.add(radioo3);
	group_radioo_Button.add(radioo4);

radioo5.setBounds(450,600,100,30);
radioo1.setBounds(50,600,100,30);
radioo2.setBounds(150,600,100,30);
radioo3.setBounds(250,600,100,30);
radioo4.setBounds(350,600,100,30);

panel2.add(radioo5);
	panel2.add(radioo1);
	panel2.add(radioo2);
	panel2.add(radioo3);
	panel2.add(radioo4);
	

///////////////////////////
	
			
		




/////////////////////////////
frame =new JFrame();
 frame.add(panel2);
frame.setSize(1100,700);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("show all student");
frame.setLocationRelativeTo(null);
frame.setVisible(true);


}
class showallobj implements ActionListener{
	
	public void actionPerformed(ActionEvent ssa){
try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						 con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
}
			catch(ClassNotFoundException exp)
			{
				System.out.println("Sorry no class");
			}
			catch(SQLException sqlexp)
			{
				System.out.println("SQL problem");
			}
			catch(Exception excep)
			{
				System.out.println("General Exception ");
			}

			
			if(con!=null)
			{
   Object obg = ssa.getSource();

if(obg==radioo5){


			try
		{
			
			
			
				
				
			String person =" select students.name,students.father_name,students.city,students.village,students.student_number,students.parents_number,students.passport_number,dormitory.wing,dormitory.floor,dormitory.room,dormitory.history,dormitory.reference,university.university,university.college,university.department,university.classes,university.instead_aasha,university.ID  from students , university, dormitory where students.ID = dormitory.ID  and students.ID = university.ID";



				 ps = con.prepareStatement(person);
			
	rs = ps.executeQuery();
			
				 	while(rs.next()!=false)
				{
					 name  = rs.getString(1);
					 father_name=rs.getString(2);
					 city=rs.getString(3);
					 village=rs.getString(4);
					 student_number=rs.getString(5);
					 parents_number=rs.getString(6);
					 passport_number=rs.getString(7);
					 wing=rs.getString(8);
					 floor=rs.getString(9);
					 room=rs.getString(10);
					 history=rs.getString(11);
					 reference=rs.getString(12);
					 university=rs.getString(13);
					 college=rs.getString(14);
					 department=rs.getString(15);
					 instead_aasha=rs.getString(17);
					 ID=rs.getInt(18);


	table.addRow(new Object[] {ID,name,father_name,city,village,student_number,parents_number,passport_number,wing,floor,room,history,reference,university,college,department,classes,instead_aasha,ID});

				}	
			

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
if(obg==radioo1){
	
		try
		{
			
			String person1 ="select students.name,students.father_name,students.city,students.village,students.student_number,students.parents_number,students.passport_number,dormitory.wing,dormitory.floor,dormitory.room,dormitory.history,dormitory.reference,university.university,university.college,university.department,university.classes,university.instead_aasha,university.ID  from students , university, dormitory where students.ID = dormitory.ID  and students.ID = university.ID and university.classes='1'";



				 pss = con.prepareStatement(person1);
			
	rss = pss.executeQuery();
			
				 	while(rss.next()!=false)
				{
					 name  = rss.getString(1);
					 father_name=rss.getString(2);
					 city=rss.getString(3);
					 village=rss.getString(4);
					 student_number=rss.getString(5);
					 parents_number=rss.getString(6);
					 passport_number=rss.getString(7);
					 wing=rss.getString(8);
					 floor=rss.getString(9);
					 room=rss.getString(10);
					 history=rss.getString(11);
					 reference=rss.getString(12);
					 university=rss.getString(13);
					 college=rss.getString(14);
					 department=rss.getString(15);
					 classes=rss.getString(16);
					 instead_aasha=rss.getString(17);
					 ID=rss.getInt(18);


	table.addRow(new Object[] {ID,name,father_name,city,village,student_number,parents_number,passport_number,wing,floor,room,history,reference,university,college,department,classes,instead_aasha,ID});

				}	
			

						
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
	
if(obg==radioo2){

		try
		{
			
			
			
				
				
			String person2 =" select students.name,students.father_name,students.city,students.village,students.student_number,students.parents_number,students.passport_number,dormitory.wing,dormitory.floor,dormitory.room,dormitory.history,dormitory.reference,university.university,university.college,university.department,university.classes,university.instead_aasha,university.ID  from students , university, dormitory where students.ID = dormitory.ID  and students.ID = university.ID and university.classes='2'";



				 psa = con.prepareStatement(person2);
			
	rsa = psa.executeQuery();
			
				 	while(rsa.next()!=false)
				{
					 name  = rsa.getString(1);
					 father_name=rsa.getString(2);
					 city=rsa.getString(3);
					 village=rsa.getString(4);
					 student_number=rsa.getString(5);
					 parents_number=rsa.getString(6);
					 passport_number=rsa.getString(7);
					 wing=rsa.getString(8);
					 floor=rsa.getString(9);
					 room=rsa.getString(10);
					 history=rsa.getString(11);
					 reference=rsa.getString(12);
					 university=rsa.getString(13);
					 college=rsa.getString(14);
					 department=rsa.getString(15);
					 classes=rsa.getString(16);
					 instead_aasha=rsa.getString(17);
					 ID=rsa.getInt(18);


	table.addRow(new Object[] {ID,name,father_name,city,village,student_number,parents_number,passport_number,wing,floor,room,history,reference,university,college,department,classes,instead_aasha,ID});

				}	
			

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


if(obg==radioo3){

		try
		{
			
			
			
				
				
			String person3 =" select students.name,students.father_name,students.city,students.village,students.student_number,students.parents_number,students.passport_number,dormitory.wing,dormitory.floor,dormitory.room,dormitory.history,dormitory.reference,university.university,university.college,university.department,university.classes,university.instead_aasha,university.ID  from students , university, dormitory where students.ID = dormitory.ID  and students.ID = university.ID and university.classes='3'";



				 psd = con.prepareStatement(person3);
			
	rsd = psd.executeQuery();
			
				 	while(rsd.next()!=false)
				{
					 name  = rsd.getString(1);
					 father_name=rsd.getString(2);
					 city=rsd.getString(3);
					 village=rsd.getString(4);
				 student_number=rsd.getString(5);
					 parents_number=rsd.getString(6);
					 passport_number=rsd.getString(7);
					 wing=rsd.getString(8);
					 floor=rsd.getString(9);
					 room=rsd.getString(10);
					 history=rsd.getString(11);
					 reference=rsd.getString(12);
					 university=rsd.getString(13);
					 college=rsd.getString(14);
					 department=rsd.getString(15);
					 classes=rsd.getString(16);
					 instead_aasha=rsd.getString(17);
					 ID=rsd.getInt(18);


	table.addRow(new Object[] {ID,name,father_name,city,village,student_number,parents_number,passport_number,wing,floor,room,history,reference,university,college,department,classes,instead_aasha,ID});

				}	
			

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
	
if(obg==radioo4){

		try
		{
			
				
				
			String person4 =" select students.name,students.father_name,students.city,students.village,students.student_number,students.parents_number,students.passport_number,dormitory.wing,dormitory.floor,dormitory.room,dormitory.history,dormitory.reference,university.university,university.college,university.department,university.classes,university.instead_aasha,university.ID  from students , university, dormitory where students.ID = dormitory.ID  and students.ID = university.ID and university.classes='4'";



				 pse = con.prepareStatement(person4);
			
	rse = pse.executeQuery();
			
				 	while(rse.next()!=false)
				{
					 name  = rse.getString(1);
					 father_name=rse.getString(2);
					 city=rse.getString(3);
					 village=rse.getString(4);
					 student_number=rse.getString(5);
					 parents_number=rse.getString(6);
					 passport_number=rse.getString(7);
					 wing=rse.getString(8);
					 floor=rse.getString(9);
					 room=rse.getString(10);
					 history=rse.getString(11);
					 reference=rse.getString(12);
					 university=rse.getString(13);
					 college=rse.getString(14);
					 department=rse.getString(15);
					 classes=rse.getString(16);
					 instead_aasha=rse.getString(17);
					 ID=rse.getInt(18);


	table.addRow(new Object[] {ID,name,father_name,city,village,student_number,parents_number,passport_number,wing,floor,room,history,reference,university,college,department,classes,instead_aasha,ID});

				}	
			

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

	
if(obg==buttan_back)
{	
System.out.println("welcome");
frame.setVisible(false);
		mainlist mainl= new mainlist();
}
			
			
if(obg==button_print){
pane.showMessageDialog(frame,"excuseme,you can not print");
	}
}

						else
						{
							
							pane.showMessageDialog(frame,"Sorry, there is no connection ");
						}
	}
	
		
	
}
}