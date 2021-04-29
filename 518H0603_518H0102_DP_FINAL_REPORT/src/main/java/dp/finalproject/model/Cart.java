/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import dp.finalproject.model.Book;
/**
 *
 * @author kangc
 */
public class Cart {
    private UUID cartID;
    private UUID userID;
    private List<CartItem> books;
    
    // Constructor
    public Cart(){}
    public Cart(UUID cartID, UUID userID, List<CartItem> books) {
        this.cartID = cartID;
        this.userID = userID;
        this.books = books;
    }
    
    public UUID getCartID() {
        return this.cartID;
    }
    
    public void setCartID(UUID cartID){
        this.cartID = cartID;
    }
    
    public UUID getUserID() {
        return this.userID;
    }
    
    public void setUserID(UUID userID){
        this.userID = userID;
    }
    
    public List<CartItem> getUrl() {
        return this.books;
    }
    
    public void setUrl(List<CartItem> books){
        this.books = books;
    } 
            
    public float getCartPrice(List<CartItem> items) {
        float totalPrice = 0;
        for (CartItem item: items){
            totalPrice += item.itemPrice(item.getQuantity(), item.getPrice());
        }
        return totalPrice;
    }
    
    public List<Book> getCartBook(List<CartItem> cart) {
        List<Book> listBook = new ArrayList<>();
        for (CartItem item: cart){
            listBook.add(item.getBook());
        }
        return listBook;
    }
}
