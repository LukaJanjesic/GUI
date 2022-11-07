package GUIPractice;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jbutton2 extends JFrame {
	
	private JButton reg;
	private JButton custom;
	
	public Jbutton2() {
		super("The Title");
		setLayout (new FlowLayout());
		
		reg= new JButton("reg Button");
		add (reg);
		
		Icon W= new ImageIcon (getClass().getResource("W.png"));
		Icon WZ= new ImageIcon (getClass().getResource("WZ.png"));
		custom = new JButton ("Custom", W);
		custom.setRolloverIcon(WZ);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand() ));
		}
	}
}
