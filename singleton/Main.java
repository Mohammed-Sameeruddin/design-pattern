package designPattern.singleton;

public class Main {
    public static void main(String ...args){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        if(instance1 == instance2 && instance1 == instance3){
            System.out.println("All the 3 instances point to same memory location");
        }else {
            System.out.println("All the 3 are different instances");
        }
    }
}
