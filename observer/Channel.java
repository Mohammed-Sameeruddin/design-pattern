package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{

    private List<ISubscribers> subscribers = new ArrayList<>();
    private String title;
    @Override
    public void subscribe(ISubscribers subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscribed");
    }

    @Override
    public void unsubscribe(ISubscribers subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Unsubscribed");
    }

    @Override
    public void notifySubscribers() {
        for(ISubscribers subscriber: subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers();
        System.out.println("Notified to all subscribers");
    }
}
