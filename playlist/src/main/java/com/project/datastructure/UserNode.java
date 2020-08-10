package com.project.datastructure;

import com.project.model.User;

public class UserNode {
	
	User user;
	UserNode nextNode;
	
	public UserNode(User user) {
		this.user = user;
		this.nextNode = null;
	}
	
	public UserNode(User user, UserNode nextNode) {
		this.user = user;
		this.nextNode = nextNode;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setNextNode(UserNode node) {
		this.nextNode = node;
	}
	
	public UserNode getNextNode() {
		return nextNode;
	}

}
