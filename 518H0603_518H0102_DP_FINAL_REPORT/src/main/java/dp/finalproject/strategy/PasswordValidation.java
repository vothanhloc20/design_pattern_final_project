/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.strategy;

/**
 *
 * @author Hunter
 */
import java.time.LocalDateTime;

import dp.finalproject.singleton.LoggerSingleton;

public class PasswordValidation implements IValidation {

	private LocalDateTime now = LocalDateTime.now();

	@Override
	public boolean validate(String email, String password) {
		LoggerSingleton log = LoggerSingleton.getInstance();
		boolean isValid = true;
		if (password.length() > 15 || password.length() < 8) {
			log.errorLog("Password", "Password must be less than 20 and more than 8 characters in length.");
			isValid = false;
		}
		String upperCaseChars = "(.*[A-Z].*)";
		if (!password.matches(upperCaseChars)) {
			log.errorLog("Password", "Password must have atleast one uppercase character");
			isValid = false;
		}
		String lowerCaseChars = "(.*[a-z].*)";
		if (!password.matches(lowerCaseChars)) {
			log.errorLog("Password", "Password must have atleast one lowercase character");
			isValid = false;
		}
		String numbers = "(.*[0-9].*)";
		if (!password.matches(numbers)) {
			log.errorLog("Passowrd", "Password must have atleast one number");
			isValid = false;
		}
		String specialChars = "(.*[@,#,$,%].*$)";
		if (!password.matches(specialChars)) {
			log.errorLog("Passowrd", "Password must have atleast one special character among @#$%");
			isValid = false;
		}
		return isValid;
	}
}
