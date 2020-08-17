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
		System.out.println("*** USER MENU ***");
		System.out.println("Hello " + profile.getUserName());
		System.err.println("UNDER CONSTRUCTION!!!");
		System.err.println("PRESS ANY NUMBER TO RETURN TO MAIN PAGE");
		userPick = UserInputs.getInt();
		return userPick;
	}

	// Project Menu
	public int projectMenu() {
		int type = 0;
		while (type < 1 || type > 5) {
			System.out.println("1. Album");
			System.out.println("2. Mixtape");
			System.out.println("3. Extended Play(EP)");
			System.out.println("4. Single");
			System.out.println("5. Unreleased(Leaks)");
			System.out.print("\nAction: ");
			type = UserInputs.getInt();
		}
		return type;
	}

}
