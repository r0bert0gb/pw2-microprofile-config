package pw2.roberto;

import org.eclipse.microprofile.config.inject.ConfigProperty;

public class User {

	private String name;

	private String message;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
