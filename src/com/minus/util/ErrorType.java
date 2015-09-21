package com.minus.util;

public enum ErrorType {
	
	FILE_NOT_FOUND("The system cannot find the file specified"),
	ERROR_FILE_GENERAL("There was an error to try open the file"),
	NULL_EXCEPTION("Internal Error."),
	ERROR_PROCESS("Error to process command"),
	ERROR_SYSTEM("Error System");
	
	private final String show;
	
	private ErrorType(String show)
	{
		this.show = show;
	}
	
	public String show()
	{
		return show;
	}

}
