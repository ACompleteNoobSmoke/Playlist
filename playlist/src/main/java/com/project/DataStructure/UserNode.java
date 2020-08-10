package com.project.DataStructure;

import com.project.Model.User;

public class UserNode {

	UserNode next;
	User user;
	
	public UserNode(User newUser, UserNode nextNode) {
		this.user = newUser;
		this.next = nextNode;
	}
	
	public void setNext(UserNode next) {
		this.next = next;
	}
	
	public UserNode getNext() {
		return next;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	
}
