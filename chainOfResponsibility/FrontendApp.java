package designPattern.chainOfResponsibility;

public class FrontendApp {
    private final AppHandler appHandler;

    public FrontendApp(AppHandler appHandler){
        this.appHandler = appHandler;
    }

    public boolean showDashboard() {
        if(appHandler.handle()){
            System.out.println("Display the dashboard page");
            return true;
        }
        System.out.println("Display the error page");
        return false;
    }
}
