package com.minus.event.popup;

import java.awt.event.ActionEvent;

import com.minus.event.TextViewListener;
import com.minus.textarea.TextView;

public class SelectAllAction extends TextViewListener {

	public SelectAllAction(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void actionPerformedEvent(ActionEvent e, TextView tv) {
		// TODO Auto-generated method stub
		tv.selectAll();
		
	}

}
