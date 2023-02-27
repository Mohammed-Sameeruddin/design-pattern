package designPattern.factory;

public class UPIPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("UPI Payment");
    }
}
