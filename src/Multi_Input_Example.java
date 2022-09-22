import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Multi_Input_Example {

	public static void main(String[] args) {
		JTextField Field1 = new JTextField();
		JTextField Field2 = new JTextField();
		JTextField Field3 = new JTextField();
		
		Object[] dialog = {
				"Enter a String", Field1,
				"Enter an Integer", Field2,
				"Enter a Double", Field3
		};
		JOptionPane.showMessageDialog(null, dialog);
		
		String strField1 = Field1.getText();
		int intField2 = Integer.parseInt(Field2.getText());
		double doubleField3 = Double.parseDouble(Field3.getText());
		
		JOptionPane.showMessageDialog(null, "Your entries:" + "\nString: " + strField1 +
				"\nInteger: " + intField2 + "\nDouble: " + doubleField3);
	}
}
