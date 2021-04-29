/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.repository;

import dp.finalproject.model.Author;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kangc
 */
public class AuthorRepository {
    public static List<Author> authors = Arrays.asList(
    		new Author("Vũ Trọng Phụng", "Q1, TP.HCM", "http://vutrongphung.com"),
    		new Author("Tô Hoài", "Q2, TP.HCM", "http://tohoai.com"),
    		new Author("Trần Đăng Khoa", "Q3, TP.HCM", "http://trandangkhoa.com")
    );
    
    public List<Author> findAllAuthors(){
        return authors;
    }
    
    public Author findAuthorByAuthorname(String email){
        for (Author author : authors) {
            if(author.getName().equals(email)){
                return author;
            }
        }
        return null;
    }
}
