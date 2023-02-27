package designPattern.example;

public abstract class Handler {

    private Handler next;

    public Handler setHandler(Handler next){
        this.next = next;
        return next;
    }

    public abstract boolean handle(int pin,int amount);

    protected boolean handleNext(int pin, int amount) {
        if(next == null){
            return true;
        }
        return next.handle(pin,amount);
    }
}
