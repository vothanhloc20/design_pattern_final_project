/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.decorator;

/**
 *
 * @author kangc
 */
public class HardCover implements BookCover{
    @Override
    public void setBookCover(String cover) {
        System.out.println("Cover Of this book: "+cover);
    }
    
    public float calculate(float price) {
        price += (price * 0.3);
        return price;
    }
}

// Concrete Component