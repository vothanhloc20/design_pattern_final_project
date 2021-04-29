/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.model;

/**
 *
 * @author kangc
 */
public class Publisher {
    private String name;
    private String address;
    private String phone;
    private String url;
    
    public Publisher(String name, String address, String phone, String url){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.url = url;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url){
        this.url = url;
    }
    
}
