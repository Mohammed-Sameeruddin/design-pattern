package designPattern.example;

public class BalanceHandler extends Handler{

    public final PaymentCard paymentCard;

    BalanceHandler(PaymentCard paymentCard){
        this.paymentCard = paymentCard;
    }
    @Override
    public boolean handle(int pin, int amount) {
        if(!paymentCard.isBalanceSufficient(amount)){
            System.out.println("Insufficient balance");
            return false;
        }
        return handleNext(pin,amount);
    }
}
