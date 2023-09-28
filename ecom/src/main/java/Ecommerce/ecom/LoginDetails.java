package Ecommerce.ecom;

public class LoginDetails {
	String user_Email;
	String user_password;
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public LoginDetails(String user_Email, String user_password) {
		super();
		this.user_Email = user_Email;
		this.user_password = user_password;
	}
	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginDetails [user_Email=" + user_Email + ", user_password=" + user_password + "]";
	}

}
