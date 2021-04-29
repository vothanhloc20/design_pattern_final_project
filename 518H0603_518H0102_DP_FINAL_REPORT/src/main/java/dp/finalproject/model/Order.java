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
public class Order {
    private UUID userID;
    private Date orderDate;
    private String status;
    private Cart cart;
    
    public Order(){};
    public Order(UUID userID, Date orderDate, String status, Cart cart){
        this.userID = userID;
        this.orderDate = orderDate;
        this.status = status;
        this.cart = cart;
    }
    
    public UUID getUserID() {
        return this.userID;
    }
    
    public void setUserID(UUID userID){
        this.userID = userID;
    }
    
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
}
