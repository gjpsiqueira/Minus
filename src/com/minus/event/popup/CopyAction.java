package com.minus.event.popup;

import java.awt.event.ActionEvent;

import com.minus.event.TextViewListener;
import com.minus.textarea.TextView;

public class CopyAction extends TextViewListener {

	public CopyAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformedEvent(ActionEvent e, TextView tv) {
		// TODO Auto-generated method stub
		tv.copy();
		
	}

}
