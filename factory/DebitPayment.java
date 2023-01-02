package designPattern.factory;

public class DebitPayment implements Payment {

    @Override
    public void pay(int amount) {
      
        System.out.println("Payment through Debit Card");
        
    }
    
}
