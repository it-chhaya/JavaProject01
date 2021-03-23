package model;

public class User {
	
	private String user;
	private String password;
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user=" + user + ", password=" + password + "]";
	}
	
}
