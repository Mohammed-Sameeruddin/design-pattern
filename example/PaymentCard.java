package designPattern.example;

public class PaymentCard {

    public int balance;

    public int pin;

    PaymentCard(int pin,int balance){
        this.balance = balance;
        this.pin = pin;
    }

    public boolean isPinValid(int pin){
        return this.pin == pin;
    }

    public boolean isBalanceSufficient(int amount){
        return this.balance >= amount;
    }
}
