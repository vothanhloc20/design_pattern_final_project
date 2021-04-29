package dp.finalproject.template;

import dp.finalproject.strategy.IValidation;
import dp.finalproject.strategy.PasswordValidation;

public class RegisterSession extends ValidationTemplate{
	private boolean isValid = false;
	public RegisterSession() {} 

    public void checkPassword(String email,String password) {
    	IValidation pv = new PasswordValidation();
        if (pv.validate(email, password) == true){
            isValid = true;
        } 
        else {
        	isValid = false;
            System.out.println("Password is invalid");
        }
    }
    
    public void checkRegistration(String email, String password) {
    	this.login(email, password);
    }
}
