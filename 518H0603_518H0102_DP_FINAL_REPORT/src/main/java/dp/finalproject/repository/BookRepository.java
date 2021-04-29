/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.repository;

import dp.finalproject.model.Book;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kangc
 */
public class BookRepository {
    public static List<Book> books = Arrays.asList(
    		new Book("978-56619-909-4", "NXB Tuổi Trẻ", "Vũ Trọng Phụng", "Q1, TP.HCM", "1979/05/05", "Số Đó", 155),
    		new Book("750-52109-201-4", "NXB Kim Đồng", "Trần Đăng Khoa", "Q3, TP.HCM", "1979/05/05", "Số Đó", 155),
    		new Book("920-52119-929-5", "NXB Hà Nội", "Tô Hoài", "Q2, TP.HCM", "1979/05/05", "Dế Mèn Phiêu Lưu Ký", 200)
    		
    		);
    
    public List<Book> findAllBooks(){
        return books;
    }
    
    public Book findBookByISBN(String ISBN){
        for (Book book : books) {
            if(book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }
    
//    public static void printAll() {
//    	for (Book book: books) {
//    		System.out.println("Name==========================Price=========================Publisher\n");
//    		System.out.println(book.getTitle()+"=========================="+book.getPrice()+"========================="+book.getPublisherName());
//    	}
//    }
}
