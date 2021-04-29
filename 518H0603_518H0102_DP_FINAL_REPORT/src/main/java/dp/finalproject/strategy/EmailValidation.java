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
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import dp.finalproject.singleton.LoggerSingleton;

public class EmailValidation implements IValidation {
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-.]+(?:\\\\.[a-zA-Z0-9-]+)*$";
	private final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	private LocalDateTime now = LocalDateTime.now();

	public EmailValidation() {
	}

	@Override
	public boolean validate(String data, String password) {
		LoggerSingleton log = LoggerSingleton.getInstance();
		System.out.print(!pattern.matcher(data).matches());
		if (!pattern.matcher(data).matches()) {
			log.errorLog("Email", "invalid email");
			return false;
		} else {
			return true;
		}
	}
}