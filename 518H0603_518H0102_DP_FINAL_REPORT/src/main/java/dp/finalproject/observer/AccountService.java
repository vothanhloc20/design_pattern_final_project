/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.observer;

import dp.finalproject.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kangc
 */
public class AccountService implements Subject {

	private User user;
	private List<Observer> observers = new ArrayList<>();

	public AccountService(String email, String ip) {
		user = new User();
		user.setEmail(email);
		user.setIp(ip);
	}

	@Override
	public void attach(Observer observer) {
		if (!this.observers.contains(observer))
			this.observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		if (this.observers.contains(observer)) {
			this.observers.remove(observer);
		}
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : this.observers) {
			observer.update(user);
		}
	}

	public void changeStatus(LoginStatus status) {
		user.setStatus(status);
		System.out.println("Status is changed");
		this.notifyAllObserver();
	}

	public void login(String ip, String email) {

		if (!this.isValidIP(ip)) {
			user.setStatus(LoginStatus.INVALID);
		} else if (this.isValidEmail(email)) {
			user.setStatus(LoginStatus.SUCCESS);
		} else {
			user.setStatus(LoginStatus.FAILURE);
		}
		System.out.println("\nStatus: " + user.getStatus());
		System.out.println("\nLogin is handled");
		this.notifyAllObserver();
	}

	private boolean isValidIP(String ip) {
		return ip.equals(user.getIp());
	}

	private boolean isValidEmail(String email) {
		return email.equalsIgnoreCase(user.getEmail());
	}
}
