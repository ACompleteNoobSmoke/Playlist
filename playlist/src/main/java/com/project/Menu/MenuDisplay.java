package com.project.Menu;

import com.project.Model.User;

public class MenuDisplay {
	
	//Main Menu
	public int mainMenu() {
		int menuChoice = 0;
		while(menuChoice < 1 || menuChoice > 4) {
			System.out.println("*** Main Menu ***");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. View All User");
			System.out.println("4. Exit");
			System.out.print("\nAction: ");
			menuChoice = UserInput.getInt();
		}
		return menuChoice;
	}
	
	
	//User Menu
	public int userMenu(User profile) {
		int userPick = 0;
		while(userPick < 1) {
			System.out.println("*** User Menu ***");
			System.out.println("Hello " + profile.getUserName() + "\n");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. View");
			System.out.println("5. Sign Out");
			System.out.print("\nAction: ");
			userPick = UserInput.getInt();
		}
		return userPick;
	}
	
	

}
