/**
 * 
 * 
 */

package com.minus.platform;

import java.io.File;

import com.minus.main.Minus;
import com.minus.textarea.TextView;
import com.minus.util.FileUtils;


public final class TabManager {
	
	private TextView textarea;
	private File file;
	private int count;
	private String title;
	
	/**
	 * Creates a new file
	 */
	private TabManager(final String title)
	{
		this.title = title;
		this.textarea = new TextView();
		//Minus.tab.add(title, new MinusScrollPane(textarea));
	}
	
	/**
	 * Adds a file existing
	 * @param file
	 */
	private TabManager(File file) 
	{
		this.file = file;
		this.textarea = new TextView();
		//start values default
		//Minus.tab.add(file.getName(), new MinusScrollPane(textarea));
		//Buffer.open(file, textarea);
		String extension = FileUtils.getExtensionFile(file);
		//textarea.setSyntaxEditingStyle(extension);
		
	} 
	
	
	
	/**
	 * Returns Textarea of tab selected
	 * @return JTextArea - textarea
	 */
	public TextView getTextArea()
	{
		return textarea;
	}
	/**
	 * Returns the file selected
	 * @return File - file
	 */
	public File getFile()
	{
		return file;
	}
                             
	/*----------------------------------------------Factory Static --------------------------------------------------------------*/
	/*----------------------------------------------Factory Static --------------------------------------------------------------*/
	/*----------------------------------------------Factory Static --------------------------------------------------------------*/
	
	/**
	 * Create a file opened by the user.
	 * @param File 
	 * @return TabManager
	 * @throws NullPointerException
	 *          if the file is null
	 */
	public static TabManager createOpenFile(final File file)
	{
		if(file == null) {
			throw new NullPointerException("File is missing");
		}
		return new TabManager(file);
	}
	/**
	 * Create a new file
	 * @param Title
	 * @return TabManager
	 * @throws NullPointerException
	 *          if title is null
	 */
	public static TabManager createNewFile(final String title)
	{
		if(title == null) {
			throw new NullPointerException("Title can't to be null");
		}
		return new TabManager(title);
	}


	


}
