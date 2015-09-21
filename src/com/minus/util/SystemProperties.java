package com.minus.util;

public class SystemProperties {
	
	private SystemProperties() {} // Prevents of instantiation
	
	public static String getUserHome()
	{
		return System.getProperty("user.home");
	}
	
	public static String getUserName()
	{
		return System.getProperty("user.name");
	}
	
	public static String getLineSeparator()
	{
		 return System.getProperty("line.separator");
	}
	
	public static String getOsName()
	{
		return System.getProperty("os.name");
	}
	
	public static String getJavaVersion()
	{
		return System.getProperty("java.version");
	}
	
	public static String getJavaVmVendor()
	{
		return System.getProperty("java.vm.vendor");
	}
	
	public static String getJavaHome()
	{
		return System.getProperty("java.home");
	}
	
	
	
	
	
	
	
	
	
	
	
}
