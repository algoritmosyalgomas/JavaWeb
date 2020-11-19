package util;

public class MySqlProperties {
	
	private String driver;
	private String url;
	private String user;
	private String password;

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MySqlProperties [driver=" + driver + ", url=" + url + ", user=" + user + ", password=" + password + "]";
	}

}
