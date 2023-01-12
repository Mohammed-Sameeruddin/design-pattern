package designPattern.example;

public class ValidPinHandler extends Handler{
    public final PaymentCard paymentCard;

    ValidPinHandler(PaymentCard paymentCard){
        this.paymentCard = paymentCard;
    }
    @Override
    public boolean handle(int pin,int amount) {
        if(!paymentCard.isPinValid(pin)){
            System.out.println("Invalid PIN");
            return false;
        }
        return handleNext(pin,amount);
    }
}
