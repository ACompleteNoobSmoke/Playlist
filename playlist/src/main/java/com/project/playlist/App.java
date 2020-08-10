package com.project.playlist;

import com.project.Menu.MenuDisplay;
import com.project.Methods.MenuAction;
import com.project.Model.User;

/**
 * Hello world!
 *
 */
public class App 
{
	static MenuAction menuAction;
	
	public App() {
		menuAction = new MenuAction();
	}
	
	public User getUser(int choice) {
		User newUser = null;
		if(choice == 1) {
			newUser = menuAction.login();
		}else if(choice == 2) {
			newUser = menuAction.register();
		}
		return newUser;
	}
	
	
    public static void main( String[] args )
    { 	App newApp = new App();
    	MenuDisplay menu = new MenuDisplay();
    	User newUser = null;
        while(newUser == null) {
        	int i = menu.mainMenu();
        	if(i > 0 && i < 3) {
        		newUser = newApp.getUser(i);
        	}else if(i == 3) {
        		menuAction.userInDatabase();
        	}else if(i == 4) {
        		menuAction.closeProgram();
        	}
        	
        	if(newUser != null) {
        		menu.userMenu(newUser);
        		newUser = null;
        	}
        	
        }
    }
}
