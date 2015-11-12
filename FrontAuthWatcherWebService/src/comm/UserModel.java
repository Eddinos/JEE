package comm;

public class UserModel {
	private String _lastName;
	private String _surName;
	private String _login;
	private String _pwd;
	private String _role;
	
	public UserModel(String login, String pwd)
	{
		this._login = login;
		this._pwd = pwd;
		this._lastName = "undefined";
		this._surName = "undefined";
		this._role = "ADMIN";
	}
	
	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public String getSurName() {
		return _surName;
	}

	public void setSurName(String surName) {
		this._surName = surName;
	}

	public String getLogin() {
		return _login;
	}

	public void setLogin(String login) {
		this._login = login;
	}

	public String getPwd() {
		return _pwd;
	}

	public void setPwd(String pwd) {
		this._pwd = pwd;
	}

	public String getRole() {
		return _role;
	}

	public void setRole(String role) {
		this._role = role;
	}
}
