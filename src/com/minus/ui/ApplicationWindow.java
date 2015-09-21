package com.minus.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;

import javax.swing.*;

import com.minus.main.Minus;
import com.minus.textarea.TextView;
import com.minus.textarea.TextViewLine;
import com.minus.ui.widget.ToolBar;
import com.minus.ui.widget.WidgetFactory;

public class ApplicationWindow extends JFrame {
	
	private JSplitPane jsp;
	//private JTabbedPane tabbed = Minus.getTab();
	private JScrollPane scroll;
	private TextViewLine tvl;
	private TextView tv;

	private static final String TITLEDEFAULT = "Minus Text Editor - minus@";

	/**
	 * Create a JFrame with specified settings
	 */
	public ApplicationWindow() 
	{
	
		
	}
	
	public void initUI()
	{
		setJMenuBar(new MenuBar());
		add(new ToolBar(),BorderLayout.NORTH);
		setTitle(TITLEDEFAULT);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setSize(new Dimension(800, 500));
		


		
		
		
	}
	

	
	
	
	
	

	

	
	

}
