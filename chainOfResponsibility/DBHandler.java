package designPattern.chainOfResponsibility;

public class DBHandler extends AppHandler{
    public boolean isConnected;
    @Override
    public boolean handle() {
        if(!isConnected){
            System.out.println("Failed to connect to the database");
            return false;
        }
        System.out.println("Database connection successful");
        return handleNext();
    }
}
