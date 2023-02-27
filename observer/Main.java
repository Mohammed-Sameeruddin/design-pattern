package designPattern.observer;

public class Main {
    public static void main(String ...args){
        IChannel channel = new Channel();

        ISubscribers subscriber1 = new Subscriber();
        ISubscribers subscriber2 = new Subscriber();

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.upload("Uploaded New Video");
    }
}
