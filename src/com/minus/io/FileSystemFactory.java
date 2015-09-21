package com.minus.io;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class FileSystemFactory {
	
	private static FileSystemView fileSystemView;
	
	static {
		
		fileSystemView = FileSystemView.getFileSystemView();
	}
	
	private FileSystemFactory() {}
	
	/**
	 * Return all roots partitions on this system
	 * @return File[]
	 */
	public static File[] getRootPatch()
	{
		
		File[] root = fileSystemView.getRoots();
	
		return root;
		
	}
	
	/**
	 * Return the subfiles from root partitions
	 * @return File[]
	 * @throws If there's no path for this root.
	 */
	public static File[] getFiles(File rootChild)
	{
		if(rootChild == null)
			throw new NullPointerException("There's no path for this root.");
		File[] file = fileSystemView.getFiles(rootChild, true);
		return file;
	}

}
