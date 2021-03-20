package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	private String userid;
	private String name;
	private String mobile;
	private String email;
	private String password;
	private int status;

	@Id
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public User(String userid, String name, String mobile, String email, String password, int status) {
		super();
		this.userid = userid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public User() {
		super();

	}

}
