package com.project.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	
	//Scanner to get input from 
	static Scanner scan = new Scanner(System.in);
	
	//Use to get integer inputs from user.
	//Implements try/catch to catch if the user enters values that are not an integer.
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
	
	//Use to get String inputs from user.
	public static String getString() {
		String newString = " ";
		newString = scan.nextLine();
		return newString;
	}
	
	//Gets First Name Input.
	public static String getFirstName() {
		String firstName = "";
		System.out.print("Enter First Name: ");
		firstName = scan.nextLine();
		return firstName;
	}
	
	//Gets Last Name Input.
	public static String getLastName() {
		String lastName = "";
		System.out.print("Enter Last Name: ");
		lastName = scan.nextLine();
		return lastName;
	}
	
	//Gets Username Input.
	public static String getUsername() {
		String userName = "";
		System.out.print("Enter Username: ");
		userName = scan.nextLine();
		return userName;
	}
	
	//Gets Password Input.
	public static String getPassword() {
		String passWord = "";
		System.out.print("Enter Password: ");
		passWord = scan.nextLine();
		return passWord;
	}
	
	
	//Gets Favorite Artist Input.
	public static String getFavoriteArtist() {
		String favorite = "";
		System.out.print("Enter Favorite Artist: ");
		favorite = scan.nextLine();
		return favorite;
	}
	
	//Close the scanner after usage.
	public static void closeScanner() {
		scan.close();
	}

}
