/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.observer;

/**
 *
 * @author kangc
 */
public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();
}
