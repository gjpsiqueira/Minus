package com.minus.event.popup;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import com.minus.event.TextViewListener;
import com.minus.textarea.TextView;

public class UndoAction extends TextViewListener {
	
	public UndoAction(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		
		
	}
	
	

	@Override
	public void actionPerformedEvent(ActionEvent e, TextView tv) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "I'm Testing Action Button!");
		tv.setText("ABC");
		
	}


	
	

}
