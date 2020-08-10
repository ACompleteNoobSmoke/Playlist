package com.project.DataStructure;

import com.project.Model.User;

public class LinkedListDatabase {
	
	int size;
	UserNode Head;
	
	//Initializes A New List
	public LinkedListDatabase() {
		this.size = 0;
		this.Head = null;
	}
	
	//Checks To See Is The List Is Currently Empty
	public boolean isEmpty() {
		return size == 0 || Head == null;
	}
	
	
	//Insert User Object At The Top(Head) Of The List.
	public void insertHead(User newUser) {
		UserNode newNode = null;
		if(isEmpty()) {
			newNode = new UserNode(newUser, null);
		}else {
			newNode = new UserNode(newUser, Head);
		}
		Head = newNode;
		size++;
	}
	
	//Insert User Object At The Bottom(Tail) Of The List
	public void insertTail(User newUserTail) {
		UserNode newNodeTail = new UserNode(newUserTail, null);
		if(isEmpty()) {
			insertHead(newUserTail);
			return;
		}else if(size == 1 && Head.getNext() == null) {
			Head.setNext(newNodeTail);
		}else {
			UserNode current = Head;
			while(current.next != null) {
				current = current.next;
			}
			current.setNext(newNodeTail);
		}
		size++;
	}
	
	
	//Checks List To See If Username Already Exist In The List.
	//If so it returns True so that the User inputs another Username.
	//If not then they are allowed to use the Username entered.
	public boolean checkUsername(String username) {
		boolean check = false;
		if(isEmpty()) {
			return false;
		}else if(Head.getUser().getUserName().equals(username)) {
			check = true;
		}else {
			UserNode current = Head;
			while(current != null) {
				if(current.getUser().getUserName().equals(username)) {
					check = true;
					break;
				}
				current = current.getNext();
			}
		}
		return check;
	}
	
	
	//Searches The List And Returns User If They Exist Based On Their Username & Password
	public User searchList(String username, String password) {
		User foundUser = null;
		if(isEmpty()) {
			return null;
		}else if(Head.next == null && size == 1) {
			if(Head.getUser().getUserName().equals(username) && 
					Head.getUser().getUserName().equals(password)) {
				foundUser = Head.getUser();
			}
		}else {
			UserNode current = Head;
			while(current != null) {
				if(current.getUser().getUserName().equals(username) && current.getUser().getPassword().equals(password)) {
					foundUser = current.getUser();
					break;
				}
				current = current.next;
			}
		}
		return foundUser;
	}
	
	
	//View All User In The List.
	public void viewAll() {
		if(isEmpty()) {
			System.err.println("\nList Is Empty\n");
			return;
		}
		
		UserNode current = Head;
		for(int i = 0; i < size; i++) {
			System.out.println(current.getUser());
			current = current.getNext();
		}
	}

}
