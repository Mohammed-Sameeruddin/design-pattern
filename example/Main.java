package designPattern.example;

public class Main {

    public static void main(String ...args){
        PaymentCard paymentCard = new PaymentCard(1234,1000);
        Handler handler = new ValidPinHandler(paymentCard);
        handler.setHandler(new BalanceHandler(paymentCard));

        Transaction transaction = new Transaction(handler);
        transaction.performTransaction(1234,1000);
    }
}
