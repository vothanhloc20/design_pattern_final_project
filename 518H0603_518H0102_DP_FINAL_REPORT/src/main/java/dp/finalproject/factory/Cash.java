/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.finalproject.factory;

/**
 *
 * @author kangc
 */
public class Cash implements Payment{
    
    @Override
    public String getPaymentMethod() {
        return "Payment: Cash";
    }
}