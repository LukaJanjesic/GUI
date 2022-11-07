package GUIPractice;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiJframe2 extends JFrame{
	private JLabel item1;
	
	public GuiJframe2() {
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
        item1.setToolTipText("This is gonna show up when you hover over it");
        add(item1);
	}
}
