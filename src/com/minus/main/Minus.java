package com.minus.main;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import com.minus.ui.ApplicationWindow;

import javax.swing.*;
/**
 * The main class of the text editor.
 * @author gustavo
 */

public final class Minus {

	// ---------------------------------------------------- static properties
	
	private static ApplicationWindow aw = new ApplicationWindow();
	private static JTabbedPane tab = new JTabbedPane();
	
	//private static Map<String, com.minus.platform.TabManager> openfile = new HashMap<String, com.minus.platform.TabManager>();

	
	
	/**
	 * Start the application
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		try {

			new Minus(); // start the application
			aw.initUI();
		} catch (Exception ex) {
			System.exit(-1);
			ex.printStackTrace();
		}
	}


	
	
	
	

	
	

}
