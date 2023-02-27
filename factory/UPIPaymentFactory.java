package designPattern.factory;

public class UPIPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment(String type) {
        return new UPIPayment();
    }
}
