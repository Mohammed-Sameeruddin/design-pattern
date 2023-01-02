package designPattern.factory;

public class CreditPayment implements Payment {

    @Override
    public void pay(int amount) {
       
        System.out.println("Payment through Credit Card");
        
    }
    
}
