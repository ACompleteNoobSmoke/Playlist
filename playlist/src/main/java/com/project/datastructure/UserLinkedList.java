package com.project.datastructure;

import com.project.model.User;

public class UserLinkedList {
	
	int size; //Size of the User List
	UserNode Head; //Node To Add To List
	
	//Initialize User Linked List
	public UserLinkedList() {
		this.size = 0;
		this.Head = null;
	}
	
	//Check If List Is Empty
	public boolean isEmpty() {
		return size == 0 && Head == null;
	}
	
	//Insert At The Top(Head) Of The List
	public void insertHead(User newUser) {
		UserNode newNode = null;
		if(isEmpty()) {
			newNode = new UserNode(newUser);
		}else {
			newNode = new UserNode(newUser, Head);
		}
		Head = newNode;
		size++;
	}
	
	//Insert At The Bottom(Tail) Of The List
	public void insertTail(User newUserTail) {
		UserNode newNodeTail = new UserNode(newUserTail);
		if(isEmpty()) {
			insertHead(newUserTail);
			return;
		}else if(Head.getNextNode() == null && size == 1) {
			Head.setNextNode(newNodeTail);
		}else {
			UserNode Current = Head;
			while(Current.nextNode != null) {
				Current = Current.nextNode;
			}
			Current.setNextNode(newNodeTail);
		}
		size++;
	}
	
	//Check For Existing UserName
	public boolean checkExistingUsername(UserNode thisNode, String userName) {
		if(thisNode.getUser().getUserName().equals(userName)) {
			return true;
		}
		return false;
	}
	
	//Goes Through User List To See If Username Exists
	public boolean existingUsername(String userName) {
		boolean userNameExists = false;
		if(isEmpty()) {
			return false;
		}else if(Head.getNextNode() == null && size == 1) {
			return checkExistingUsername(Head, userName);
		}else {
			UserNode Current = Head;
			while(Current != null) {
				userNameExists = checkExistingUsername(Current, userName);
				if(userNameExists) {
					return true;
				}
				Current = Current.getNextNode();
			}
		}
		return userNameExists;
	}
	
	//Check For Existing User Based On Username & Password
	public boolean checkForLogin(UserNode thisNode, String userName, String passWord) {
		if(thisNode.getUser().getUserName().equals(userName) && 
				thisNode.getUser().getPassword().equals(passWord)) {
			return true;
		}
		return false;
	}
	
	//Goes Through User List To See If Username & Password Exists
	public User listToLogin(String userName, String passWord) {
		User logginIn = null;
		boolean login = false;
		if(isEmpty()) {
			return null;
		}else if(Head.getNextNode() == null && size == 1) {
			login = checkForLogin(Head, userName, passWord);
			if(login) { return Head.getUser();}
		}else {
			UserNode Current = Head;
			while(Current != null) {
				login = checkForLogin(Current, userName, passWord);
				if(login) {
					logginIn = Current.getUser();
					break;
				}
				Current = Current.getNextNode();
			}
		}
		return logginIn;
	}
	
	//View User Saved On List
	public void showAll() {
		if(isEmpty()) {
			System.out.println("\nDatabase Is Currently Empty\n");
			return;
		}else if(size == 1 && Head.getNextNode() == null) {
			System.out.println(Head.getUser());
		}else {
			UserNode Current = Head;
			while(Current != null) {
				System.out.println(Current.getUser());
				Current = Current.getNextNode();
			}
		}
	}

}
