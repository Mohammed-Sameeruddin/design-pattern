package designPattern.factory;

public interface PaymentFactory {
    Payment createPayment(String type);
}
