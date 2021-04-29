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
public class PaymentFactory {
    private PaymentFactory(){}
    public static final Payment getPaymentMethod(PaymentMethod paymentMethod){
        switch (paymentMethod){
            case BankTransfer:
                return new BankTransfers();
            case Ewallets:
                return new Ewallet();
            case Cash:
                return new Cash();
            default:
                throw new IllegalArgumentException("This payment method is not supported");
        }
    }
}
