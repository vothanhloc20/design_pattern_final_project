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
public class Author {
    private String name;
    private String address;
    private String url;
    
    public Author(String name, String address, String url){
        this.name = name;
        this.address = address;
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
    
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url){
        this.url = url;
    }
    
}
