package designPattern.chainOfResponsibility;

public abstract class AppHandler {
    private AppHandler next;

    public AppHandler setNextHandler(AppHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle();

    protected boolean handleNext() {
        if(next == null){
            return true;
        }
        return next.handle();
    }
}
