package app;
import java.awt.*;

public class MyAppTest {

	public static void main(String[] args) {
		
		MyApp app = new MyApp();
		app.setTitle("STUDENT PORTAL");
		app.setLayout((LayoutManager)new FlowLayout());
		app.setVisible(true);
		app.setSize(600, 550);
	}
}
