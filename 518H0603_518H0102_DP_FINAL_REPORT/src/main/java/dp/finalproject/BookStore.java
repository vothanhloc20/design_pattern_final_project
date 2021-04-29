package dp.finalproject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dp.finalproject.model.Author;
import dp.finalproject.model.User;
import dp.finalproject.model.Book;
import dp.finalproject.observer.AccountService;
import dp.finalproject.repository.AuthorRepository;
import dp.finalproject.repository.BookRepository;
import dp.finalproject.repository.UserRepository;
import dp.finalproject.template.ValidateSession;

import java.util.*;
/**
 *
 * @author kangc
 */
public class BookStore {
    public static void main(String args[]) {
        List<Author> authors = AuthorRepository.authors;
        List<User> user1 = UserRepository.users;
        List<Book> books = BookRepository.books;
//        List<Observer> observers = ArrayList<>();
        ValidateSession logSession = new ValidateSession();
        System.out.println("Welcome To Our BookStore. Please Sign In First: ");
        System.out.println("-------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email:");
        String email = sc.nextLine();
        System.out.println("Enter your Password:");
        String password = sc.nextLine();
        AccountService ac = new AccountService(email, "192.168.20.11");
        logSession.login(email, password);      
        ac.login("192.168.20.11", email);
        System.out.println("-------------------------------------------------");
        System.out.println("Our Available book");
        System.out.println("Name==========================Price=========================Publisher\n");
        for (Book book: books) {
    		System.out.println(book.getTitle()+"=========================="+book.getPrice()+"========================="+book.getPublisherName());
    	}
        }
    }
