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
public class BookWrapDecorator extends CoverDecorator {
    private boolean isWrapped = false;
    public BookWrapDecorator(BookCover cover){
        super(cover);
    }
    
    @Override
    public void setBookCover(String cover){
        decoratedCover.setBookCover(cover);
        // User Option
        setWrapped(decoratedCover);
    }
    
    @Override
    public float calculate(float price) {
        if (this.isWrapped){
            price += price * 0.2;
            return decoratedCover.calculate(price);
        }
        else {
            return decoratedCover.calculate(price); 
        }
    }
    
    public void setWrapped(BookCover decoratedCover) {
        this.isWrapped = true;
    }
}

// Concrete Decorator
