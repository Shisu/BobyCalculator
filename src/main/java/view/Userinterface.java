package view;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class Userinterface extends JFrame {
	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 7230752036880952955L;
	private JTextField weight;
	private JTextField textField;

	public Userinterface() {
		getContentPane().setLayout(new MigLayout("", "[434px]", "[87px][87px][87px]"));
		
		textField = new JTextField();
		getContentPane().add(textField, "flowx,cell 0 1");
		textField.setColumns(10);
		
		JLabel lblHightInM = new JLabel("hight in m");
		getContentPane().add(lblHightInM, "cell 0 1");
		
		weight = new JTextField();
		weight.setText("");
		getContentPane().add(weight, "flowx,cell 0 0");
		weight.setColumns(10);
		
		JLabel lblWeightInKg = new JLabel("weight in kg");
		getContentPane().add(lblWeightInKg, "flowx,cell 0 0,grow");
		
		JButton btnConfirm = new JButton("confirm");
		getContentPane().add(btnConfirm, "cell 1 3");
		

	}
}