/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.strategy;

import dp.finalproject.model.User;
import dp.finalproject.repository.UserRepository;
import dp.finalproject.singleton.LoggerSingleton;
import java.time.LocalDateTime;

/**
 *
 * @author kangc
 */
public class ExistenceUserValidation implements IValidation {
	UserRepository userRepo = new UserRepository();
	LoggerSingleton log = LoggerSingleton.getInstance();

	public ExistenceUserValidation() {
	};

	@Override
	public boolean validate(String email, String password) {
		User foundUser = userRepo.findUserByEmail(email);
		boolean passwordValid = userRepo.passwordCheck(password);
		try {
			if (foundUser == null && passwordValid == false) {
				log.errorLog(foundUser, "signed in unsuccessfully");
				System.out.print(foundUser.getFullName() + " signed in unsuccessfully");
				return false;
			}
			log.sign(foundUser, " signed in successfully!!!");
			System.out.print("\n" + foundUser.getFullName() + " signed in successfully");
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
