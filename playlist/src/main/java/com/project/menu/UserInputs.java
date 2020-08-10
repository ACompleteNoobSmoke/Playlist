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
	
	//Get First Name Input From User
	public String getFirstName() {
		String firstName = "";
		while(firstName.isBlank()) {
			System.out.print("Enter First Name: ");
			firstName = UserInputs.getString();
		}
		return firstName;
	}
		
	//Get Last Name Input From User
	public String getLastName() {
		String lastName = "";
		while(lastName.isBlank()) {
			System.out.print("Enter Last Name: ");
			lastName = getString();
		}
		return lastName;
	}
		
	//Get Username Input From User
	public String getUsername() {
		String userName = "";
		while(userName.isBlank()) {
			System.out.print("Enter Username: ");
			userName = getString();
		}
		return userName;
	}
		
	//Get Password Input From User
	public String getPassword() {
		String passWord = "";
		while(passWord.isBlank()) {
			System.out.print("Enter Password: ");
			passWord = getString();
		}
		return passWord;
	}
	
	//Get Favorite Artist From User
	public String getFavoriteArtist() {
		String favorite = "";
		while(favorite.isBlank()) {
			System.out.print("Enter Favorite Artist: ");
			favorite = getString();
		}
		return favorite;
	}
	
	//Close Scanner
	public void closeScanner() {
		scan.close();
	}

}
