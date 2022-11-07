package GUIPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Mousemotion extends JFrame{
	 private JPanel mousepanel;
	 private JLabel statusbar;
	 
     public Mousemotion() {
    	 super("Title");
    	 
    	 mousepanel = new JPanel();
    	 mousepanel.setBackground(Color.WHITE);
    	 add (mousepanel, BorderLayout.CENTER);
    	 
    	 statusbar= new JLabel ("default");
    	 add(statusbar, BorderLayout.SOUTH);
    	 
    	 HandlerClass handler = new HandlerClass();
    	 mousepanel.addMouseListener(handler);
    	 mousepanel.addMouseMotionListener(handler);
  }
     private class HandlerClass implements MouseListener, MouseMotionListener{
    	 public void mouseClicked(MouseEvent event) {
    		 statusbar.setText(String.format("Clicked at %d,%d",event.getX(),event.getY() ));
    	 }
    	 public void mousePressed(MouseEvent event) {
    		 statusbar.setText("You pressed down the mouse");
    	 }
    	 public void mouseReleased (MouseEvent event) {
    		 statusbar.setText("You released the mouse");
    	 }
    	 public void mouseEntered(MouseEvent event) {
    		 statusbar.setText("You entered the area");
    		 mousepanel.setBackground(Color.RED);
    	 }
    	 public void mouseExited(MouseEvent event) {
    		 statusbar.setText("You exited the area");
    		 mousepanel.setBackground(Color.WHITE);
    	 }
    	 public void mouseDragged(MouseEvent event) {
    		 statusbar.setText("You are dragging the mouse");
    	 }
    	 public void mouseMoved(MouseEvent event) {
    		 statusbar.setText("You moved the mouse");
    	 }
  }
}
