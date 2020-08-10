package com.project.model;

public class User {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String favoriteArtist;
	
	public User(String firstName, String lastName, String userName, String password, String favoriteArtist) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.userName = userName;
	    this.password = password;
	    this.favoriteArtist = favoriteArtist;
	}
	
	public String getFirstName() {return this.firstName;}
	public String getLastName() {return this.lastName;}
	public String getUserName() {return this.userName;}
	public String getPassword() {return this.password;}
	public String getFavoriteArtist() {return this.favoriteArtist;}
	
	public void printAll() {
	    System.out.println(this.userName);
	    System.out.println(this.favoriteArtist);
	}
	
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	
	public void setUserName(String userName) {
	    this.userName = userName;
	}
	
	public boolean containsUserName(String userName) {
	    if (this.userName.equalsIgnoreCase(userName)) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public boolean containsFavoriteArtist(String favoriteArtist) {
	    if (this.favoriteArtist == favoriteArtist) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public String toString() {
		return "First Name: " + firstName + "\n" +
	           "Last Name: " + lastName + "\n" +
			   "Username: " + userName + "\n" +
	           "Favorite Artist: " + favoriteArtist + "\n";
	}
}

