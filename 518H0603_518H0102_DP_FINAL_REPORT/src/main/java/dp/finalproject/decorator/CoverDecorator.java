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
public class CoverDecorator implements BookCover {
   protected BookCover decoratedCover;
    
   public CoverDecorator(BookCover decoratedCover){
      this.decoratedCover = decoratedCover;
   }

   @Override
   public void setBookCover(String cover){
      decoratedCover.setBookCover(cover);
   }
   
   @Override
   public float calculate(float price) {
       return decoratedCover.calculate(price);
   }
}

// Decorator