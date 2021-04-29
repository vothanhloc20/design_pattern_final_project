/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.template;

import dp.finalproject.strategy.EmailValidation;
import dp.finalproject.strategy.PasswordValidation;
import dp.finalproject.strategy.BlankValidation;
import dp.finalproject.strategy.ExistenceUserValidation;
import dp.finalproject.strategy.IValidation;


/**
 *
 * @author kangc
 */
public abstract class ValidationTemplate {
    private static boolean isValid = true;
    protected void checkBlank(String email, String password){
        IValidation bv = new BlankValidation();
        if (bv.validate(email, password) == true) {
            isValid = true;
        }
        else {
        	isValid = false;
            System.out.println("Email And Password can't be blank");
        }
    }
    
    protected void checkEmail(String input, String password){
    	IValidation ev = new EmailValidation();
        if (ev.validate(input, password) == true){
            isValid = true;
        }
        else {
        	isValid = false;
            System.out.println("Email is invalid");
        }
    }
    
    protected void checkPassword(String input){}
    protected void checkExistence(String input, String password) {
        IValidation ev = new ExistenceUserValidation();
        if (ev.validate(input, password) == true){
            isValid = true;
        }
        else {
        	isValid = false;
            System.out.println("Password is wrong or invalid");
        }
    }

    
    public final void login(String email, String password) {
    	if (isValid == true) {
    		checkBlank(email, password);
    	}
        if (isValid == true) {
        	checkEmail(email, password);
        }
        if (isValid == true) {
        	checkPassword(password);
        }
        if (isValid == true) {
        	checkExistence(email, password);
        }
    }
}
