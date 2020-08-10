package com.project.methods;

import com.project.menu.Menu;
import com.project.model.User;

public class UserAction {
	
	
	public void userMainMenu(User profile) {
		Menu menu = new Menu();
		int i = menu.userMenu(profile);
		if(i >= 0 ) {
			return;
		}
		
	}

}
