/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.repository;

import dp.finalproject.model.Book;
import dp.finalproject.model.CartItem;
import static dp.finalproject.repository.BookRepository.books;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kangc
 */
public class CartItemRepository {
    public static final List<Book> cartItem = new ArrayList<>();
    public List<Book> findAllItems(){
        return cartItem;
    }
    public Book findBookByISBN(String ISBN){
        for(Book book: cartItem){
            if(book.getISBN() == ISBN){
                return book;
            }
        }
        return null;
    }
    public void delete(String ISBN){
        int deleted = -1;
        for (int i = 0; i< cartItem.size();i++){
            if(cartItem.get(i).getISBN() == ISBN){
                deleted = i;
                break;
            }
        }
        cartItem.remove(deleted);
    }
    
    public void save(Book book, String ISBN) {
        book.setISBN(ISBN);
        cartItem.add(book);
    }
}
