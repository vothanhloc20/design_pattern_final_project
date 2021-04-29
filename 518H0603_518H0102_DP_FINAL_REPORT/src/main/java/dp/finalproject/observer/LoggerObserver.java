/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.observer;

import dp.finalproject.model.User;
import dp.finalproject.singleton.LoggerSingleton;

/**
 *
 * @author kangc
 */
public class LoggerObserver implements Observer {
	LoggerSingleton log = LoggerSingleton.getInstance();

	@Override
	public void update(User user) {
		log.logger(user);
	}
}
