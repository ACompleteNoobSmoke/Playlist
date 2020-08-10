package com.project.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputs {
	
	static Scanner scan = new Scanner(System.in);
	
	//Get Integer Inputs From User
	public static int getInt() {
		int newInt = 0;
		try {
			newInt = scan.nextInt();
			scan.nextLine();
		}catch(InputMismatchException e) {
			scan.nextLine();
		}
		return newInt;
	}
	
	//Get String Inputs From User
	public static String getString() {
		String newString = "";
		newString = scan.nextLine();
		return newString;
	}

}
