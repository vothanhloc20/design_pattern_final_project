package dp.finalproject.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangc
 */
public class Book {
    private String ISBN;
    private String publisherName;
    private String authorName;
    private String authorAddress;
    private String year;
    private String title;
    private double price;
    
    public Book(){}
    public Book(String ISBN, String publisherName, String authorName, String authorAddress, String year, String title, double price) {
        this.ISBN = ISBN;
        this.publisherName = publisherName;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
        this.year = year;
        this.title = title;
        this.price = price;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public String getPublisherName() {
        return this.publisherName;
    }
    
    public void setPublisherName(String publisherName){
        this.publisherName = publisherName;
    }
    
    public String getAuthorName() {
        return this.authorName;
    }
    
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    
    public String getAuthorAddress() {
        return this.authorAddress;
    }
    
    public void setAuthorAddress(String ISBN){
        this.authorAddress = authorAddress;
    }
    
    public String getYear() {
        return this.year;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    } 
}
