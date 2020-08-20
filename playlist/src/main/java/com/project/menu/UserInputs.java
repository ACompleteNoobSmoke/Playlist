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

	// Get The Project Type Whether It's An LP, EP, Mixtape, etc
	public static String getType() {
		Menu menu = new Menu();
		int typeChoice = menu.projectMenu();
		String type = "";
		switch (typeChoice) {
			case 1:
				type = "Album";
				break;
			case 2:
				type = "Mixtape";
				break;
			case 3:
				type = "Extended Play(EP)";
				break;
			case 4:
				type = "Single";
				break;
			case 5:
				type = "Unreleased(Leaks)";
				break;
		}
		return type;
	}

	// Get The Genre Of Music
	public static String getGenre() {
		Menu menu = new Menu();
		int genreChoice = menu.genreMenu();
		String genre = "";
		switch (genreChoice) {
			case 1:
				genre = "Hip-Hop/Rap";
				break;
			case 2:
				genre = "Rock";
				break;
			case 3:
				genre = "Rhythm & Blues";
				break;
			case 4:
				genre = "EDM/Techno";
				break;
			case 5:
				genre = "Funk";
				break;
			case 6:
				genre = "Classical";
				break;
			case 7:
				genre = "Instrumental";
				break;
			case 8:
				genre = "Other";
				break;
		}
		return genre;
	}

	// Get Title Of The Album, Mixtape or EP
	// If Project Is Single & Unreleased Then Assigned Respective Type By Default
	public static String getProjectName(String projectType) {
		ProjectType projecttype = null;
		if (projectType.equals("Album")) {
			projecttype = () -> {
				String albumName = UserInputs.getAlbumTitle();
				return albumName;
			};
		} else if (projectType.equals("Mixtape")) {
			projecttype = () -> {
				String mixName = UserInputs.getMixtapeTitle();
				return mixName;
			};
		} else if (projectType.equals("Extended Play(EP)")) {
			projecttype = () -> {
				String epName = UserInputs.getEPTitle();
				return epName;
			};
		} else if (projectType.equals("Single")) {
			projecttype = () -> {
				return "Single";
			};
		} else if (projectType.equals("Unreleased(Leaks)")) {
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
