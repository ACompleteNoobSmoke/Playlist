package com.project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.project.model.User;

public class MySQLConnection {

	// Checks Database to see if a username already exists.
	public boolean checkUserName(String username) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL", "root",
					"codingroot1!");
			Statement stmt = con.createStatement();
			String query = "Select UserName From UserTable Where UserName = " + "'" + username + "';";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String found = rs.getString("UserName");
				if (found.equals(username)) {
					return true;
				}
			}
			con.close();
		} catch (Exception e) {
			System.out.println("The Check Username Function Did Not Work");
			System.out.println(e);
			return true;
		}

		return false;
	}

	// Insert new user information into the database.
	public void insertNewUser(User newUser) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL", "root",
					"codingroot1!");
			Statement stmt = con.createStatement();
			String firstName = newUser.getFirstName();
			String lastName = newUser.getLastName();
			String userName = newUser.getUserName();
			String passWord = newUser.getPassword();
			String favoriteArtist = newUser.getFavoriteArtist();
			String query = "Insert into UserTable Values( " + "'" + firstName + "', " + "'" + lastName + "'," + "'"
					+ userName + "', " + "'" + passWord + "'," + "'" + favoriteArtist + "');";
			stmt.execute(query);
			con.close();
		} catch (Exception e) {
			System.out.println("It did not work");
			System.out.println(e);
		}
	}

	// Checks for user by username and password.
	public User loginUser(String username, String password) {
		User loggedIn = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL", "root",
					"codingroot1!");
			Statement stmt = con.createStatement();
			String query = "Select * From UserTable Where UserName = " + "'" + username + "'" + " AND PassWord = '"
					+ password + "';";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String foundUserName = rs.getString("UserName");
				if (foundUserName.equals(username)) {
					String foundPassWord = rs.getString("PassWord");
					if (foundPassWord.equals(password)) {
						String firstName = rs.getString("FirstName");
						String lastName = rs.getString("LastName");
						String favoriteArtist = rs.getString("FavoriteArtist");
						loggedIn = new User(firstName, lastName, username, password, favoriteArtist);
						break;
					} else {
						System.err.println("\nIncorrect Password!!\n");
						return null;
					}
				}
			}
			con.close();
		} catch (Exception e) {
			System.out.println("The Check Username Function Did Not Work");
			System.out.println(e);
			return null;
		}

		return loggedIn;
	}

	// public boolean insertNewSong(String username, )
}
