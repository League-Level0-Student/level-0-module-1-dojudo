import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null,"hello"+ name);
}
}