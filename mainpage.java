import javax.swing.UIManager;

class mainpage{

public static void main(String []entec)throws Exception
{
UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
	
	login log = new login();

}
}