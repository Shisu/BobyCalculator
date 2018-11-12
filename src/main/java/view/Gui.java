package view;
public class Gui {

	public Gui(){
		Userinterface frame = new Userinterface();
		frame.setTitle("Body Calculator");
		frame.setSize(1000, 620);
		frame.setResizable(false);
		frame.setLocation(50, 50);
		frame.setVisible(true);
	}
}