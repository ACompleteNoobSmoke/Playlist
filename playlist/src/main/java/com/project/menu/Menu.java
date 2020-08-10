package com.project.menu;

public class Menu {
	
	//Main Menu
	public int mainMenu() {
		int mainPick = 0;
		while(mainPick < 1 || mainPick > 4) {
			System.out.println("*** Main Menu ***");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. View All User");
			System.out.println("4. Exit");
			System.out.print("\nAction: ");
			mainPick = UserInputs.getInt();
		}
		return mainPick;
	}
	
	//User Menu
	public int userMenu() {
		int userPick = 0;
		while(userPick < 1) {
			System.out.println("*** User Menu ***");
			
		}
	}

}
