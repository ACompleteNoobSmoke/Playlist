package com.project.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputs {

	static Scanner scan = new Scanner(System.in);

	// Get Integer Inputs From User
	public static int getInt() {
		int newInt = 0;
		try {
			newInt = scan.nextInt();
			scan.nextLine();
		} catch (InputMismatchException e) {
			scan.nextLine();
		}
		return newInt;
	}

	// Get String Inputs From User
	public static String getString() {
		String newString = "";
		newString = scan.nextLine();
		return newString;
	}

	// Get First Name Input From User
	public static String getFirstName() {
		String firstName = "";
		while (firstName.isBlank()) {
			System.out.print("Enter First Name: ");
			firstName = UserInputs.getString();
		}
		return firstName;
	}

	// Get Last Name Input From User
	public static String getLastName() {
		String lastName = "";
		while (lastName.isBlank()) {
			System.out.print("Enter Last Name: ");
			lastName = getString();
		}
		return lastName;
	}

	// Get Username Input From User
	public static String getUsername() {
		String userName = "";
		while (userName.isBlank()) {
			System.out.print("Enter Username: ");
			userName = getString();
		}
		return userName;
	}

	// Get Password Input From User
	public static String getPassword() {
		String passWord = "";
		while (passWord.isBlank()) {
			System.out.print("Enter Password: ");
			passWord = getString();
		}
		return passWord;
	}

	// Get Favorite Artist From User
	public static String getFavoriteArtist() {
		String favorite = "";
		while (favorite.isBlank()) {
			System.out.print("Enter Favorite Artist: ");
			favorite = getString();
		}
		return favorite;
	}

	// Get Artist Name from User
	public static String getArtistName() {
		String artistName = "";
		while (artistName.isBlank()) {
			System.out.print("Enter Artist Name: ");
			artistName = getString();
		}
		return artistName;
	}

	// Get Song Title From User
	public static String getSongTitle() {
		String songTitle = "";
		while (songTitle.isBlank()) {
			System.out.print("Enter Song Title: ");
			songTitle = getString();
		}
		return songTitle;
	}

	// Get Album Title From User
	public static String getAlbumTitle() {
		String albumTitle = "";
		while (albumTitle.isBlank()) {
			System.out.print("Enter Album Title: ");
			albumTitle = getString();
		}
		return albumTitle;
	}

	// Get Mixtape Title From User
	public static String getMixtapeTitle() {
		String mixtapeTitle = "";
		while (mixtapeTitle.isBlank()) {
			System.out.print("Enter Mixtape Title: ");
			mixtapeTitle = getString();
		}
		return mixtapeTitle;
	}

	// Get EP Title From User
	public static String getEPTitle() {
		String mixtapeTitle = "";
		while (mixtapeTitle.isBlank()) {
			System.out.print("Enter EP Title: ");
			mixtapeTitle = getString();
		}
		return mixtapeTitle;
	}

	// Get Year Released From User
	public static int getYear() {
		int yearReleased = 0;
		while (yearReleased < 1960 || yearReleased > 2020) {
			System.out.print("Enter Year Released (1960 - 2020): ");
			yearReleased = getInt();
		}
		return yearReleased;
	}

	public static String getType() {
		Menu nMenu = new Menu();
		int project = nMenu.projectMenu();
		ProjectType projecttype = null;
		if (project == 1) {
			projecttype = () -> {
				String albumName = UserInputs.getAlbumTitle();
				return albumName;
			};
		} else if (project == 2) {
			projecttype = () -> {
				String mixName = UserInputs.getMixtapeTitle();
				return mixName;
			};
		} else if (project == 3) {
			projecttype = () -> {
				String epName = UserInputs.getEPTitle();
				return epName;
			};
		} else if (project == 4) {
			projecttype = () -> {
				return "Single";
			};
		} else if (project == 5) {
			projecttype = () -> {
				return "Unreleased";
			};
		}

		String pType = projecttype.projectType();
		return pType;
	}

	// Close Scanner
	public static void closeScanner() {
		scan.close();
	}

}
