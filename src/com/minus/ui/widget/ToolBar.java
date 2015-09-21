package com.minus.ui.widget;

/*
 * 
 * Sets up JToolBar for Minus.java
 * 
 * 
 * 
 * 
 */

/*
 * ToolBar.java for Minus.java
 * 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.border.Border;


@SuppressWarnings("serial")
public class ToolBar extends JPanel {
	
	private JToolBar toolbar;
	private JButton icon;
	private JTabbedPane tab;
	
	
	private Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
	
	
	public ToolBar()
	{
		
		setLayout(new BorderLayout());
		add(setJToolBar(),BorderLayout.NORTH); // add JToolbar to panel
		setBorder(border);
		setBackground(getColor()); // sets up color for panel.
		setVisible(true);
		
		
	}
	
	private JButton setJButtonNewFileIcon()
	{
		icon = new JButton();
		icon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/new.png")));
		
		return icon;
		
	}

	private JButton setJButtonFileIcon()
	{

		icon = new JButton();
		icon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/folder.png")));
		
		return icon;
	}
	
	private JButton setJButtonSaveIcon()
	{
		
		icon = new JButton();
		icon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/save.png")));


		return icon;
		
	}
	
	private JButton setJButtonPrintIcon()
	{
		
		icon = new JButton();
		icon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/printer.png")));

		return icon;
		
	}
	
	private JButton setJButtonSearchIcon()
	{
		
		icon = new JButton();
		icon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons/search.png")));

		return icon;
		
	}
	
	
	private JToolBar setJToolBar()
	{
		toolbar = new JToolBar();
		toolbar.setBorder(border);
		toolbar.setBackground(getColor());
		toolbar.add(setJButtonNewFileIcon());
		toolbar.addSeparator();
		toolbar.addSeparator();
		toolbar.add(setJButtonFileIcon());
		toolbar.addSeparator();
		toolbar.addSeparator();
		toolbar.add(setJButtonSaveIcon());
		toolbar.addSeparator();
		toolbar.addSeparator();
		toolbar.add(setJButtonPrintIcon());
		toolbar.addSeparator();
		toolbar.addSeparator();
		toolbar.add(setJButtonSearchIcon());


		return toolbar;
	
		
	}
	
	private Color getColor()
	{
		
		return Color.DARK_GRAY;
		
		
		
	}
	


	
	

}