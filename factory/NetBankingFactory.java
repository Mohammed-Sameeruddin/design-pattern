package designPattern.factory;

public class NetBankingFactory implements PaymentFactory {

    @Override
    public Payment createPayment(String type) {
        return new NetBankingPayment();
    }
}
