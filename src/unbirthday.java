import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String birthday=JOptionPane.showInputDialog("enter birthday");
		if(birthday.equals("03/6")) { 
			JOptionPane.showMessageDialog(null,"happy birthday");	
		}
			else {
	JOptionPane.showMessageDialog(null,"its not your birthday!");
			
			}
	}	
}