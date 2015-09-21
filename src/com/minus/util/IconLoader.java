package com.minus.util;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconLoader {

	public static final Icon file = IconManager.getIcon("icons/page_white.png");
	public static final Icon folder = IconManager.getIcon("icons/folder.png");
	public static final Icon folder_add = IconManager.getIcon("icons/folder_add.png");
	public static final Icon save = IconManager.getIcon("icons/disk.png");
	public static final Icon save_as = IconManager.getIcon("icons/save_as.png");
	public static final Icon close = IconManager.getIcon("icons/cross.png");
	public static final Icon file_manager = IconManager.getIcon("icons/file_manager.png");
	public static final Icon printer = IconManager.getIcon("icons/printer.png");
	
	public static class IconManager {
		
		public static ImageIcon getIcon(String path)
		{
			return new ImageIcon(IconLoader.class.getClassLoader().getResource(path));
		}
	}
}
