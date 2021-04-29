/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.repository;

import dp.finalproject.model.User;
import dp.finalproject.observer.LoginStatus;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kangc
 */
public class UserRepository {
    public static List<User> users = Arrays.asList(
    		new User("518H0603@student.tdtu.edu.vn", "123456", "Chung Chí Cường", "0981569270", "huyện Bình Chánh, TP.HCM", "192.168.20.11", LoginStatus.SUCCESS),
    		new User("518H0102@student.tdtu.edu.vn", "123456", "Phan An Duy", "0888423162", "Q3, TP.HCM", "192.168.121.12", LoginStatus.SUCCESS),
    		new User("admin@student.tdtu.edu.vn", "admin", "Admin", "None", "None", "192.168.29.11", LoginStatus.SUCCESS)
    		
    		);
    
    public List<User> findAllUsers(){
        return users;
    }
    
    public User findUserByEmail(String email){
        for (User user : users) {
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
    public boolean passwordCheck(String password) {
    	for (User user : users) {
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
