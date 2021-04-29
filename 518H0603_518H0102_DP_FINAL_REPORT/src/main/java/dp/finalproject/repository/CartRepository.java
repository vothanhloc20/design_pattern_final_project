package dp.finalproject.repository;

import dp.finalproject.model.Cart;
import dp.finalproject.model.CartItem;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kangc
 */
public class CartRepository {
    public static final List<CartItem> cart = new ArrayList<>();
    public List<CartItem> findAllItems(){
        return cart;
    }
    public CartItem findItemsById(int id){
        for(CartItem item: cart){
            if(item.getCartID() == id){
                return item;
            }
        }
        return null;
    }
    public void delete(int id){
        int deleted = -1;
        for (int i = 0; i< cart.size();i++){
            if(cart.get(id).getCartID() == id){
                deleted = i;
                break;
            }
        }
        cart.remove(deleted);
    }
    
    public void save(CartItem item) {
        int id = cart.size() + 1;
        item.setCartID(id);
        cart.add(item);
    }
}
