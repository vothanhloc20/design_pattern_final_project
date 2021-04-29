/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.singleton;

/**
 *
 * @author kangc
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import dp.finalproject.model.User;

public class LoggerSingleton {

    private static LoggerSingleton logger = null;

    private final String logFile = "logging.txt";
    private PrintWriter writer;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private LocalDateTime now = LocalDateTime.now();

    public LoggerSingleton() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
        }
    }

    public static synchronized LoggerSingleton getInstance() {
        if (logger == null)
            logger = new LoggerSingleton();
        return logger;
    }

    public void sign(Object account, String action) {
        writer.println("User (" + account + "): " + action + " at - " + now);
    }

    public void errorLog(Object type, String error) {
        writer.println(type + " match error: " + error + " at - " + now);
    }
    public void mailer(User user) {
        System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
    }

    public void protector(User user) {
        System.out
                .println("Protector: User " + user.getEmail() + " is invalid. " + "IP " + user.getIp() + " is blocked");
    }

    public void printConsole(String type) {
        System.out.println(type + " validate failed at: " + now);
    }

	public void logger(User user) {
		System.out.println(user.getFullName() + " triggered logger on loging in.");
	}
}
