package com.minus.platform;

import java.io.File;

import com.minus.main.Minus;
import com.minus.textarea.TextView;

public final class TabSelected {

	private TabSelected() {} // Prevents instantiation

	/**
	 * Returns the object <tt>MinusTextArea</tt> from Tab selected by the user
	 * 
	 * @return RSyntaxTextArea
	 */
	public static TextView getTextArea() {
		//TabManager tb = Minus.openfile.get(getTitleTab());
		if (getTitleTab() == null)
			throw new IllegalArgumentException("No tab selected with title "
					+ getTitleTab());
		//return tb.getTextArea();
		
		return null; //command temporary
	}

	/**
	 * Returns the object <tt>File</tt> from Tab selected by the user
	 * 
	 * @return File
	 */
	public static File getFile() {
		//TabManager tb = Minus.openfile.get(getTitleTab());
		if (getTitleTab() == null)
			throw new IllegalArgumentException("No tab registered with title "
					+ getTitleTab());
		//return tb.getFile();
		
		return null; //command temporary

	}

	/**
	 * Returns the title of tab selected
	 * 
	 * @return String
	 */
	private static String getTitleTab() {
		return null;
	}

}
