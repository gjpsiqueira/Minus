package com.minus.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import com.minus.util.LanguageEnum;

public class MenuBar extends JMenuBar {
	
	private JMenu file;
	private JMenu edit;
	private JMenu language;
	private JMenu settings;
	private JMenu help;
	
	/* File MenuItem*/
	private JMenuItem newFile;
	private JMenuItem openFile;
	private JMenuItem save;
	private JMenuItem saveAs;
	private JMenuItem close;
	private JMenuItem closeAll;
	private JMenuItem quit;
	
	
	/* Edit MenuItem*/
	private JMenuItem undo;
	private JMenuItem cut;
	private JMenuItem copy;
	private JMenuItem paste;
	private JMenuItem delete;
	private JMenuItem selectAll;
	
	/* Language MenuItem*/

	private JMenuItem languageAll;
	
	/* Settings MenuItem*/
	
	private JMenuItem findAndReplace;
	

	/* Help MenuItem*/
	
	private JMenuItem about;
	
	
	private final String FileMenu = "File";
	private final String EditMenu = "Edit";
	private final String LanguageMenu = "Language";
	private final String SettingsMenu = "Setings";
	private final String HelpMenu = "Help";
	
	public MenuBar()
	{
		
		createJMenu();
		
		createJMenuItemFile();
		createJMenuItemEdit();
		createJMenuItemLanguage();
		
		
	}
	
	private void createJMenu()
	{
		file = new JMenu(FileMenu);
		edit = new JMenu(EditMenu);
		language = new JMenu(LanguageMenu);
		settings = new JMenu(SettingsMenu);
		help = new JMenu(HelpMenu);
		
		add(file);
		add(edit);
		add(language);
		add(settings);
		add(help);
		
		
	}
	
	private void createJMenuItemFile()
	{
		newFile = new JMenuItem("New File");
		openFile = new JMenuItem("Open File");
		save = new JMenuItem("Save");
		saveAs = new JMenuItem("SaveAll");
		close = new JMenuItem("Close");
		closeAll = new JMenuItem("Close All");
		quit = new JMenuItem("Quit");
		
		file.add(newFile);
		file.add(openFile);
		file.add(save);
		file.add(saveAs);
		file.add(close);
		file.add(closeAll);
		file.addSeparator();
		file.add(quit);
		
		
	}
	
	private void createJMenuItemEdit()
	{
		undo = new JMenuItem("Undo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		delete = new JMenuItem("Delete");
		selectAll = new JMenuItem("Select All");
		
		edit.add(undo);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.add(selectAll);
	}
	
	private void createJMenuItemLanguage()
	{
		for(LanguageEnum dir : LanguageEnum.values())
		{
			language.add(new JMenuItem(dir.toString()));
		}
	}
	
	
	

}
