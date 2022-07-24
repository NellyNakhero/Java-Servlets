package service;

public class UserValidationService {
	public  Boolean isUserValid(String name, String password) {
		if (name.equalsIgnoreCase("Nelly") && password.equalsIgnoreCase("1234")) {
			return true;
		}
	else {
		return false;
	}
	}
}
