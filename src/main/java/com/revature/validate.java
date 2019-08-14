package com.revature;

public class validate {

	public static void main (String[] args) {
		String name = "   ";
		if (name == null || name.trim().equals(""))
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("valid");
		}
		

	}
   
}
