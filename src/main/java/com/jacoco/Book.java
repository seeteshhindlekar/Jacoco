package com.jacoco;

public class Book {
	
	public boolean abc(String user, String b) {
		
		boolean status = false;
		if (user.equals("admin")) {
			status = true;
			return status;
		}
		else
		{
			return false;
		}
		
	}

}
