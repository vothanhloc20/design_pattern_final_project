/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.strategy;

import dp.finalproject.singleton.LoggerSingleton;

/**
 *
 * @author kangc
 */
public class BlankValidation implements IValidation {
    LoggerSingleton log = LoggerSingleton.getInstance();
    public BlankValidation(){};
    
    @Override
    public boolean validate(String string, String password) {
    	boolean isValid = ((string == null || string.isEmpty()) && (password == null || password.isEmpty()));
        if (isValid == true) {
        	log.errorLog("Email or Password", "can't be blank!!");
        	return false;
        }
        else {
        	return true;
        }
    }
}
