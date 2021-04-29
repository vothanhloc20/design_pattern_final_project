/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.model;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author kangc
 */
public class CartItem {
    private int id;
    private String ISBN;
    private Book book;
    private int quantity;
    private float price;
    
    public CartItem() {}
    
    public CartItem(int id, String ISBN, Book book, int quantity, float price){
        this.id = id;
        this.ISBN = ISBN;
        this.book = book;
        this.quantity = quantity;
        this.price = price;
    }
    
    
    
    public int getCartID() {
        return this.id;
    }
    
    public void setCartID(int id){
        this.id = id;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book){
        this.book = book;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float itemPrice(int quantity, float price) {
        float totalPrice = (quantity * price) + (price*10);
        return totalPrice;
    }
}
