package designPattern.factory;

public class PaymentFactory {
    public Payment createPayment(String type) {
        if (type == null || type.isEmpty())
            return null;
        switch (type) {
        case "NetBanking":
            return new NetBankingPayment();
        case "Credit":
            return new CreditPayment();
        case "Debit":
            return new DebitPayment();
        default:
            throw new IllegalArgumentException("Unknown type "+type);
        }
    }   
}
