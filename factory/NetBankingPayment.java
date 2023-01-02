package designPattern.factory;

public class NetBankingPayment implements Payment {

    @Override
    public void pay(int amount) {
       
       System.out.println("Payment Through Net Banking"); 
    }
    

}