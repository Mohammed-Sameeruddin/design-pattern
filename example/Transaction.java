package designPattern.example;

public class Transaction {
    private final Handler handler;

    Transaction(Handler handler){
        this.handler = handler;
    }

    public void performTransaction(int pin, int amount){
        if(handler.handle(pin,amount)){
            System.out.println("Transaction Successful");
        }else {
            System.out.println("Transaction Failed");
        }
    }
}
