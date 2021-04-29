/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.model;

import dp.finalproject.observer.LoginStatus;

/**
 *
 * @author kangc
 */
public class User {
    String email;
    String password;
    String fullName;
    String phone;
    String address;
    String ip;
    LoginStatus status;
    
    public User() {super();};
    public User(String email, String password, String fullName, String phone, String address, String ip, LoginStatus status){
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.ip = ip;
        this.status = status;
    }
    public String getIp() {
    	return this.ip;
    }
    public void setIp(String ip) {
    	this.ip = ip;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return this;
    }
    public LoginStatus getStatus() {
		return status;
	}

	public void setStatus(LoginStatus status) {
		this.status = status;
	}
}
