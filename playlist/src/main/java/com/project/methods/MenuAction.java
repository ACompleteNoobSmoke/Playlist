package com.project.methods;

import com.project.database.MySQLConnection;
import com.project.datastructure.UserLinkedList;
import com.project.menu.UserInputs;
import com.project.model.User;

public class MenuAction {

	static UserLinkedList userDB;
	static MySQLConnection myDB;

	public MenuAction() {
		userDB = new UserLinkedList();
		myDB = new MySQLConnection();
	}

	// Method For Login Then Returns User
	public User login() {
		User loginUser = null;
		System.out.println("*** LOGIN ***");
		String userName = UserInputs.getUsername();
		String passWord = UserInputs.getPassword();
		loginUser = myDB.loginUser(userName, passWord);
		if (loginUser == null) {
			System.err.println("Incorrect Username Or Password");
		}
		return loginUser;
	}

	// Method For Registration Then Returns User
	public User register() {
		User registerUser = null;
		String userName = "";
		boolean checkUserName = true;
		System.out.println("*** REGISTRATION ***");
		String firstName = UserInputs.getFirstName();
		String lastName = UserInputs.getLastName();
		while (checkUserName) {
			userName = UserInputs.getUsername();
			checkUserName = myDB.checkUserName(userName);
			if (checkUserName) {
				System.err.println("WARNING: Username Exists");
			}
		}
		String passWord = UserInputs.getPassword();
		String favoriteArtists = UserInputs.getFavoriteArtist();
		registerUser = new User(firstName, lastName, userName, passWord, favoriteArtists);
		myDB.insertNewUser(registerUser);
		return registerUser;
	}

	// Method To View All Users In The List -- THIS WILL BE REMOVED LATER
	public void viewAll() {
		System.out.println("*** ALL USERS ***");
		userDB.showAll();
	}

	// This Closes The Program
	public void closeProgram() {
		System.out.println("\nClosing Playlist Program......");
		UserInputs.closeScanner();
		System.exit(0);
	}

}
