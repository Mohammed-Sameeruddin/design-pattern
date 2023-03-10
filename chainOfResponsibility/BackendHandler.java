package designPattern.chainOfResponsibility;

public class BackendHandler extends AppHandler{

    public boolean isServiceUp;

    BackendHandler(boolean isServiceUp){
        this.isServiceUp = isServiceUp;
    }

    @Override
    public boolean handle() {
        if(!isServiceUp){
            System.out.println("Backend Service is down");
            return false;
        }
        System.out.println("Backend service is up");
        return handleNext();
    }
}
