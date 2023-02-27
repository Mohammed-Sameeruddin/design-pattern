package designPattern.chainOfResponsibility;

public class App {

    public static void main(String ...args){
        AppHandler handler = new DBHandler(false);
        handler.setNextHandler(new BackendHandler(true));

        FrontendApp app = new FrontendApp(handler);

        if(app.showDashboard()){
            System.out.println("Application started successfully");
        }else {
            System.out.println("Internal server error");
        }
    }

}
