package com.minus.textarea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Action;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rtextarea.Gutter;
import org.fife.ui.rtextarea.RecordableTextAction;
*/
import com.minus.event.TextViewListener;
import com.minus.event.popup.CopyAction;
import com.minus.event.popup.SelectAllAction;
import com.minus.event.popup.UndoAction;
import com.minus.ui.*;

public class TextView extends JTextArea {
	
	
	private JPopupMenu popupMenu;
	
	private JMenuItem copyMenuItem;
	private JMenuItem undoMenuItem;
	private JMenuItem redoMenuItem;
	private JMenuItem cutMenuItem;
	private JMenuItem pasteMenuItem;
	private JMenuItem deleteMenuItem;
	private JMenuItem selectAllMenuItem;
	
	/* Action to JMenuItem */
	
	private TextViewListener undoAction;
	private TextViewListener selectAllAction;
	private TextViewListener copyAction;
	
	
	/**
	 * Constructs a new TextArea
	 */
	public TextView()
	{
		
		this(0,0);
		
	}
    /**
     * Constructs a new TextArea with the specified text displayed.
     * A default model is created and rows/columns are set to 0.
     *
     * @param text the text to be displayed, or null
     */
	public TextView(int rows, int columns)
	{
		super(rows, columns);
		init();
	}
	
	/**
	 * Settings default
	 */
	protected void init()
	{
		//initialize 
		setComponentPopupMenu(createPopupMenu());
		setLineWrap(true);
		setWrapStyleWord(true);
		setBackground(Color.WHITE);
		setForeground(Color.BLACK); 
		setSize(new Dimension(300, 100));
	}
	
	/**
	 * Creates a JPopupMenu for this component
	 * @return JPopupMenu
	 */
	private JPopupMenu createPopupMenu()
	{
		createPopupMenuActions();
		createPopupMenuItem();
		popupMenu = new JPopupMenu("ABC");
		popupMenu.add(copyMenuItem);
		popupMenu.add(undoMenuItem);
		popupMenu.add(redoMenuItem);
		popupMenu.add(cutMenuItem);
		popupMenu.add(pasteMenuItem);
		popupMenu.add(deleteMenuItem);
		popupMenu.add(selectAllMenuItem);
		
		
		return popupMenu;
		
	}
	
	private void createPopupMenuItem()
	{
		copyMenuItem = new JMenuItem(copyAction);
		undoMenuItem = new JMenuItem(undoAction);
		redoMenuItem = new JMenuItem("dassdasda");
		cutMenuItem = new JMenuItem("Cdsadasdsadasut");
		pasteMenuItem = new JMenuItem("dsadasdas");
		deleteMenuItem = new JMenuItem("Deldsadasdasdasdasete");
		selectAllMenuItem = new JMenuItem(selectAllAction);
	}
	
	private void createPopupMenuActions()
	{
		undoAction = new UndoAction("Undo");
		selectAllAction = new SelectAllAction("Select All");
		copyAction = new CopyAction("Copy");
	}
	
	/**
	 * Appends a menu item to this TextView
	 */
	public void setMenuItem(JMenuItem label)
	{
		if(label == null) {
			throw new IllegalArgumentException("label cannot be null");
		}
		
		popupMenu.add(label);
	}
	
	/**
	 * Returns the popup menu used to this TextView
	 */
	public JPopupMenu getPopupMenu()
	{
		return popupMenu;
	}

}
