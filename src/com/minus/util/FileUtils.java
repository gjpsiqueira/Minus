package com.minus.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
		//Prevents of instantiation
	}
	/**
	 * Gets the extension of a filename.
     * This method returns the textual part of the filename after the last dot. 
     * There must be no directory separator after the dot.
     * 
	 * @param file - the file to retrieve the extension
	 * @return the extension of the file or an empty string if none exists or null if the filename is null.
	 */
	public static String getExtensionFile(File file)
	{
		if(file == null) {
			throw new NullPointerException("File is null");
		}
		String url = file.getName();
		String[] urlSplit = url.split("/");
		String filename = urlSplit[urlSplit.length - 1];
		String[] nameSplit = filename.split("[.]");
		StringBuffer fileExtension = new StringBuffer();
		// to prevent appending . after extension type
		if (nameSplit.length > 1) {
			for (int index = 1; index < nameSplit.length; index++) {
				if (index != nameSplit.length - 1)
					fileExtension.append(nameSplit[index] + ".");
				else
					fileExtension.append(nameSplit[index]);
			}
		} else {
			fileExtension.append(nameSplit[0]);
		}
		return fileExtension.toString();
	}
	
	public static FileInputStream openInputStream(File file) throws IOException 
	{
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (file.canRead() == false) {
                throw new IOException("File '" + file + "' cannot be read");
            }
        } else {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        return new FileInputStream(file);
    }
	
	
	
	
	
}
