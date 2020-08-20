package com.project.menu;

import com.project.model.User;

public class Menu {

	// Main Menu
	public int mainMenu() {
		int mainPick = 0;
		while (mainPick < 1 || mainPick > 4) {
			System.out.println("*** MAIN MENU ***");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. View All User");
			System.out.println("4. Exit");
			System.out.print("\nAction: ");
			mainPick = UserInputs.getInt();
		}
		return mainPick;
	}

	// User Menu
	public int userMenu(User profile) {
		int userPick = 0;
		while (userPick < 1 || userPick > 1) {
			System.out.println("*** USER MENU ***");
			System.out.println("Hello " + profile.getUserName());
			System.out.println("1. Add Song");
			System.out.print("\nAction: ");
			userPick = UserInputs.getInt();
		}
		return userPick;
	}

	// Project Menu
	public int projectMenu() {
		int type = 0;
		while (type < 1 || type > 5) {
			System.out.println("\nAlbum Type");
			System.out.println("_____________");
			System.out.println("1. Album");
			System.out.println("2. Mixtape");
			System.out.println("3. Extended Play(EP)");
			System.out.println("4. Single");
			System.out.println("5. Unreleased(Leaks)");
			System.out.print("\nAction: ");
			type = UserInputs.getInt();
		}
		System.out.println("");
		return type;
	}

	// Generic Genre Type
	public int genreMenu() {
		int genre = 0;
		while (genre < 1 || genre > 8) {
			System.out.println("\nGenre");
			System.out.println("_____");
			System.out.println("1. Hip-Hop/Rap               5. Funk");
			System.out.println("2. Rock                      6. Classical");
			System.out.println("3. Rhythm & Blues            7. Instrumental");
			System.out.println("4. EDM/Techno                8. Other");
			System.out.print("\nAction: ");
			genre = UserInputs.getInt();
		}
		System.out.println("");
		return genre;
	}

}
