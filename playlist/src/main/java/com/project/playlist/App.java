package com.project.playlist;

import com.project.menu.Menu;
import com.project.methods.MenuAction;
import com.project.methods.UserAction;
import com.project.model.User;

public class App {
	public static void main(String[] args) {
		User newUser = null;
		Menu menu = new Menu();
		MenuAction mainAction = new MenuAction();
		while (newUser == null) {
			int i = menu.mainMenu();
			if (i == 1) {
				newUser = mainAction.login();
			} else if (i == 2) {
				newUser = mainAction.register();
			} else if (i == 3) {
				mainAction.viewAll();
			} else if (i == 4) {
				mainAction.closeProgram();
			}

			if (newUser != null) {
				UserAction userAction = new UserAction();
				userAction.userMainMenu(newUser);
				newUser = null;
			}
		}

	}
}
