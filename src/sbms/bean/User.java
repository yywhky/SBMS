package sbms.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login(){
		System.out.print("User login123456!");
	}
	
	

}
