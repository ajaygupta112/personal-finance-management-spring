package services;

import models.User;

public class Authentication {
	private boolean authenticated;
	private User user;
	
	public Authentication(boolean authenticated, User user) {
		super();
		this.authenticated = authenticated;
		this.user = user;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
