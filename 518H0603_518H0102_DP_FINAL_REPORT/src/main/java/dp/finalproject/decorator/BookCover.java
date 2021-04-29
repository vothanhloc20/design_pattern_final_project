package dp.finalproject.decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kangc
 */
public interface BookCover {
    public void setBookCover(String cover);
    public float calculate(float price);
}

// Component