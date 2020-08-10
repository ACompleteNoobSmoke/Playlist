package com.project.Methods;

import com.project.DataStructure.LinkedListDatabase;
import com.project.Menu.MenuDisplay;
import com.project.Menu.UserInput;
import com.project.Model.User;

public class MenuAction {
	
	static MenuDisplay menu;
	static LinkedListDatabase userList;
	
	public MenuAction() {
		menu = new MenuDisplay();
		userList = new LinkedListDatabase();
	}
	

	
	//Gets User Object Based On Username and Password Entered
		public User login() {
			String username = "";
			String password = "";
			User loginUser = null;
			System.out.println("*** Login ***");
			while(username.isBlank()) {
				username = UserInput.getUsername();
			}
			while(password.isBlank()) {
				password = UserInput.getPassword();
			}
			loginUser = userList.searchList(username, password);
			return loginUser;
		}
		
		
		//Register, Creates and Saves Object To The LinkedList
		public User register() {
			String firstName = "";
			String lastName = "";
			String userName = "";
			String passWord = "";
			String favoriteArtist = "";
			User registeredUser = null;
			boolean nameTaken = true;
			System.out.println("*** Register ***");
			while(firstName.isBlank()) {
				firstName = UserInput.getFirstName();
			}
			while(lastName.isBlank()) {
				lastName = UserInput.getLastName();
			}
			while(nameTaken) {
				userName = UserInput.getUsername();
				nameTaken = userList.checkUsername(userName);
				if(nameTaken) {
					System.err.println("Username Already Taken!");
				}
			}
			while(passWord.isBlank()) {
				passWord = UserInput.getPassword();
			}
			while(favoriteArtist.isBlank()) {
				favoriteArtist = UserInput.getFavoriteArtist();
			}
			
			registeredUser = new User(firstName, lastName, userName, passWord, favoriteArtist);
			userList.insertTail(registeredUser);
			
			return registeredUser;
		}
		
		
		//Displays the User Objects Currently Stored In User Linked List
		public void userInDatabase() {
			System.out.println("*** View All User ***");
			userList.viewAll();
		}
		
		
		//Shuts Down Program.
		public void closeProgram() {
			System.out.println("\nClose Program....");
			UserInput.closeScanner();
			System.exit(0);
		}

}
