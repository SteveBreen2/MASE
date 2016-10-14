package Menu;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class UserLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	private String correctUsername = "Steve";
	private String correctPassword = "Password";
	private String password;
	private String username;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Set Password");
		this.password = password;
		System.out.println(this.password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void attemptLogin() {
		if (correctUsername.equals(username) && correctPassword.equals(password)) {
			System.out.println("Yes");

		} else
			System.out.println("No");
		
	}

	public String printOut() {
		System.out.println("worked");
		return "1";
	}

}
