package designPattern.factory;

public class CreditFactory implements PaymentFactory{
    @Override
    public Payment createPayment(String type) {
        return new CreditPayment();
    }
}
