package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestReourceBundle {

	public static void main (String[] args) {
		Locale locale = new Locale("vi");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Labels", locale);
		
		System.out.println(resourceBundle.getString("hello"));
	}
}
