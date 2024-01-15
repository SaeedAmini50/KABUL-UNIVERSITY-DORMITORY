import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
class choseroom{
	String floor;
	String wing;
	String room;
	DefaultTableModel model =null;	 
	JOptionPane pane=new JOptionPane();
	JLabel label_wing=null;
	ImageIcon imageicon=null;
	JLabel label_imageicon=null;
	Dimension dim=null;
JLabel label_floor=null;
JLabel label_room=null;
JPanel panel =null;
JButton button_show=null;
JButton buttan_back=null;
JComboBox combobox_Room1=null;
JComboBox combobox_Room2=null;
JComboBox combobox_Room3=null;
JComboBox combobox_Room4=null;
JComboBox combobox_floor=null;
JComboBox combobox_wing =null;
JFrame frame=null;


choseroomobj choseobj=new choseroomobj();
Actions actoin=new Actions();

	choseroom(){


 imageicon = new ImageIcon("dormitory.png");
 label_imageicon=new JLabel(imageicon);
label_imageicon.setBounds(400,20,128,128);
///////////
dim = new Dimension(150,25);

///////
 
 label_wing= new JLabel("chose the wing:");
label_wing.setBounds(20,20,100,20);
label_floor= new JLabel("chose the floor:");
label_floor.setBounds(20,70,100,20);
JLabel label_room= new JLabel("chose the room:");
label_room.setBounds(20,130,100,20);

 panel =new JPanel();
 button_show=new JButton();
button_show.setText("show");
button_show.setBounds(270,220,100,30);
//button_show.addItemListener(actoin);
button_show.addActionListener(choseobj);

buttan_back=new JButton();
buttan_back.setBounds(400,220,100,30);
buttan_back.setText("Back");
buttan_back.addActionListener(choseobj);
//buttan_back.addItemListener(actoin);


String [] wing={};
combobox_wing = new JComboBox(wing);
//combobox_wing.setPreferredSize(dim);
combobox_wing.setBounds(150,20,200,20);
combobox_wing.setEnabled(false);


			combobox_wing.setEnabled(true);
			combobox_wing.removeAllItems();
			combobox_wing.addItem("A");
			combobox_wing.addItem("B");
			combobox_wing.addItem("C");
			combobox_wing.addItem("D");


//combobox_wing.addActionListener(choseobj);
combobox_wing.addItemListener(actoin);

String [] floor={"Floor-1","Floor-2","Floor-3","Floor-4"};
 combobox_floor = new JComboBox(floor);
combobox_floor.setBounds(150,70,200,20);
combobox_floor.setEnabled(false);
combobox_floor.addItemListener(actoin);

String [] Room1={"100","103"};
 combobox_Room1 = new JComboBox(Room1);
combobox_Room1.setBounds(150,130,200,20);
combobox_Room1.setEnabled(false);

	 model = new DefaultTableModel();
	
	
JTable tbl = new JTable(model);

tbl.setBounds(20,290,550,300);
		JScrollPane scroll = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("fathername");
		model.addColumn("university");
		model.addColumn("college");
		model.addColumn("classes");
		
		
		
		String ID="ID";
		String name="Name";
		String fathername="FatherName";
		String university="University";
		String college="College";
		String classes="Class";
		
					//	model.addRow(new Object[] {name,fathername,university,college,classes,ID});

model.addRow(new Object[] {name,fathername,university,college,classes,ID});
	//model.addRow(new Object[] {ID,name,fathername,university,college,classes});




panel.add(combobox_wing);
panel.add(combobox_floor);


panel.add(label_imageicon);




panel.setLayout(null);
panel.add(label_wing);
panel.add(label_floor);
panel.add(label_room);
panel.add(button_show);
panel.add(buttan_back);


panel.add(scroll);
panel.add(tbl);
panel.add(combobox_Room1);

	
 frame =new JFrame();
 frame.add(panel);
frame.setSize(600,600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("chose Room");
frame.setLocationRelativeTo(null);
frame.setVisible(true);


}

	
class Actions implements ItemListener{
	public void itemStateChanged(ItemEvent  aee){
		 
   Object obg = aee.getSource();
		 if(obg==combobox_wing){
			 
			 combobox_floor.setEnabled(true);
		 }
		if (obg==combobox_floor){

						int index_floor=combobox_floor.getSelectedIndex(); 			 
		

			 			
			 if(index_floor==0){
			panel.add(combobox_Room1);
			combobox_Room1.setEnabled(true);
			combobox_Room1.removeAllItems();
			combobox_Room1.addItem("100");
			combobox_Room1.addItem("103");
			combobox_Room1.addItem("106");
			combobox_Room1.addItem("110");
			combobox_Room1.addItem("102");
			combobox_Room1.addItem("101");
			combobox_Room1.addItem("107");
			combobox_Room1.addItem("108");
			combobox_Room1.addItem("109");
			combobox_Room1.addItem("111");
			combobox_Room1.addItem("112");
			combobox_Room1.addItem("113");
			combobox_Room1.addItem("114");
			combobox_Room1.addItem("115");
			combobox_Room1.addItem("116");
			combobox_Room1.addItem("117");
						
			 floor="1";
			
			
			 }
			 else if(index_floor==1){
				 
				// panel.add(combobox_Room2);
				panel.add(combobox_Room1);
				combobox_Room1.setEnabled(true);
			combobox_Room1.removeAllItems();
			combobox_Room1.addItem("200");
			combobox_Room1.addItem("203");
			combobox_Room1.addItem("206");
			combobox_Room1.addItem("210");
			combobox_Room1.addItem("202");
			combobox_Room1.addItem("201");
			combobox_Room1.addItem("207");
			combobox_Room1.addItem("208");
			combobox_Room1.addItem("209");
			combobox_Room1.addItem("211");
			combobox_Room1.addItem("212");
			combobox_Room1.addItem("213");
			combobox_Room1.addItem("214");
			combobox_Room1.addItem("215");
			combobox_Room1.addItem("216");
			combobox_Room1.addItem("217");
			
			 floor="2";
			 }
			 else if (index_floor==2){
				 // panel.add(combobox_Room3);
				panel.add(combobox_Room1);
				combobox_Room1.setEnabled(true);
			combobox_Room1.removeAllItems();
			combobox_Room1.addItem("300");
			combobox_Room1.addItem("303");
			combobox_Room1.addItem("306");
			combobox_Room1.addItem("310");
			combobox_Room1.addItem("302");
			combobox_Room1.addItem("301");
			combobox_Room1.addItem("307");
			combobox_Room1.addItem("308");
			combobox_Room1.addItem("309");
			combobox_Room1.addItem("311");
			combobox_Room1.addItem("312");
			combobox_Room1.addItem("313");
			combobox_Room1.addItem("314");
			combobox_Room1.addItem("315");
			combobox_Room1.addItem("316");
			combobox_Room1.addItem("317");
			
			 floor="3";
			 
			 
			 }
			 else if (index_floor==3){
				 // panel.add(combobox_Room4);
panel.add(combobox_Room1);
				 combobox_Room1.setEnabled(true);
			combobox_Room1.removeAllItems();
			combobox_Room1.addItem("400");
			combobox_Room1.addItem("403");
			combobox_Room1.addItem("406");
			combobox_Room1.addItem("410");
			combobox_Room1.addItem("402");
			combobox_Room1.addItem("401");
			combobox_Room1.addItem("407");
			combobox_Room1.addItem("408");
			combobox_Room1.addItem("409");
			combobox_Room1.addItem("411");
			combobox_Room1.addItem("412");
			combobox_Room1.addItem("413");
			combobox_Room1.addItem("414");
			combobox_Room1.addItem("415");
			combobox_Room1.addItem("416");
			combobox_Room1.addItem("417");
			
			
			 floor="4";
			 }
		
	
		
}

		 }
	}

	
class choseroomobj implements ActionListener{
	public void actionPerformed(ActionEvent eeee){
		room= String.valueOf(combobox_Room1.getSelectedItem());
		wing= String.valueOf(combobox_wing.getSelectedItem());
		
		
   Object obgg =eeee.getSource();
		if (obgg==buttan_back){
				frame.setVisible(false);
				mainlist mainl= new mainlist();
		}
		
	

if (obgg==button_show){
				
				
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saeed");
		
			if(con!=null)
			{
		
			String person ="  select students.name,students.father_name,university.university,university.college,university.classes,students.ID  from students , university, dormitory where students.ID = dormitory.ID  and students.ID = university.ID and room='"+room+"' and floor='"+floor+"' and wing='"+wing+"'";



				PreparedStatement ps = con.prepareStatement(person);
			
	ResultSet rs = ps.executeQuery();
			
				 	while(rs.next()){
					
					String name  = rs.getString(1);
					String father_name=rs.getString(2);
					String university=rs.getString(3);
					String college=rs.getString(4);
					String classes=rs.getString(5);
					int ID=rs.getInt(6);


model.addRow(new Object[] {name,father_name,university,college,classes,ID});

				}	
			
						}
						
						else
						{
							
							pane.showMessageDialog(frame,"Sorry, there is no connection ");
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