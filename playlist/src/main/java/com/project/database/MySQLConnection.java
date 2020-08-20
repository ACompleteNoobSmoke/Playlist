package com.project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.project.model.Song;
import com.project.model.User;

public class MySQLConnection {

	// Checks Database to see if a username already exists.
	public boolean checkUserName(String username) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL2", "root",
					"codingroot1!");
			PreparedStatement ps = con.prepareStatement("Select UserName From `UserTable` Where UserName = (?)");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String found = rs.getString("UserName");
				if (found.equals(username)) {
					return true;
				}
			}
			ps.close();
			rs.close();
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL2", "root",
					"codingroot1!");
			String firstName = newUser.getFirstName();
			String lastName = newUser.getLastName();
			String userName = newUser.getUserName();
			String passWord = newUser.getPassword();
			String favoriteArtist = newUser.getFavoriteArtist();
			PreparedStatement ps = con.prepareStatement("Insert Into `UserTable` Values(?, ?, ?, ?, ?)");
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, userName);
			ps.setString(4, passWord);
			ps.setString(5, favoriteArtist);
			ps.execute();
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Insert did not work");
			System.out.println(e);
		}
	}

	// Checks for user by username and password.
	public User loginUser(String username, String password) {
		User loggedIn = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL2", "root",
					"codingroot1!");
			PreparedStatement ps = con
					.prepareStatement("Select * From `UserTable` Where UserName = (?) AND Where PassWord = (?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

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
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			System.out.println("The Check Username Function Did Not Work");
			System.out.println(e);
			return null;
		}

		return loggedIn;
	}

	// Insert A New Song In The Database
	public boolean insertNewSong(String userName, Song newSong) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL2", "root",
					"codingroot1!");
			String songTitle = newSong.getTitle();
			String artist = newSong.getArtist();
			String genre = newSong.getGenre();
			String albumType = newSong.getAlbumType();
			String album = newSong.getAlbum();
			int year = newSong.getYearReleased();
			Song existSong = retrieveSong(userName, songTitle, artist);
			if (existSong != null) {
				return false;
			}

			PreparedStatement ps = con.prepareStatement("INSERT INTO `Songs` VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, userName);
			ps.setString(2, songTitle);
			ps.setString(3, artist);
			ps.setString(4, albumType);
			ps.setString(5, album);
			ps.setInt(6, year);
			ps.setString(7, genre);
			ps.execute();
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Inserting song did not work");
			System.out.println(e);
			return false;
		}
		return true;
	}

	// Use To Get Songs From The Database Based On The Username, Title And Artist
	// Inputed
	public Song retrieveSong(String userName, String songTitle, String artist) {
		Song foundSong = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PlaylistSQL2", "root",
					"codingroot1!");
			PreparedStatement ps = con
					.prepareStatement("Select * From `Songs` Where UserName = (?) AND Song = (?) AND Artist = (?)");
			ps.setString(1, userName);
			ps.setString(2, songTitle);
			ps.setString(3, artist);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String found = rs.getString("UserName");
				if (found.equals(userName)) {
					String albumType = rs.getString("AlbumType");
					String album = rs.getString("Album");
					int year = rs.getInt("Year");
					String genre = rs.getString("Genre");
					foundSong = new Song(songTitle, artist, genre, albumType, album, year);
					break;
				}
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			System.out.println("The Search Function Did Not Work");
			System.out.println(e);
			return null;
		}

		return foundSong;
	}
}
