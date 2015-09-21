package com.minus.event;

import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

import com.minus.textarea.TextView;

public abstract class TextViewListener extends TextAction {

	/**
	 * Create a Action with specified name.
	 * @param name associated with this action.
	 */
	public TextViewListener(String name) {
		this(name, null, null, null, null);
		
		if(name == null) {
			throw new IllegalArgumentException("name can't be null");
		}
	}
	
	/**
	 * Create a Action with specified
	 * @param name associated with this action
	 * @param icon associated with this action
	 * @param desc associated with this action
	 * @param mnemonic associated with this action
	 * @param accelerator associated with this action
	 */
	public TextViewListener(String name,Icon icon, String desc,
				Integer mnemonic, KeyStroke accelerator) {
		super(name);
		putValue(SMALL_ICON, icon);
		putValue(SHORT_DESCRIPTION, desc);
		putValue(ACCELERATOR_KEY, accelerator);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	/**
	 * This method is final. Therefore, you can't override.
	 */

	public final void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JTextComponent textComponent = getTextComponent(e);
		if(textComponent instanceof TextView) {
			TextView textView = (TextView) textComponent;
			actionPerformedEvent(e, textView);
			
		}
		
		
		
	}
	/**
	 * 
	 * @param e The action being performed.
	 * @param tv to receive the action.
	 */
	public abstract void actionPerformedEvent(ActionEvent e, TextView tv);
	
	
	
	

}
