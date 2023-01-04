package designPattern.factory;

public class DebitFactory implements PaymentFactory{
    @Override
    public Payment createPayment(String type) {
        return new DebitPayment();
    }
}
