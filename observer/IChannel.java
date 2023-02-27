package designPattern.observer;

public interface IChannel {
    void subscribe(ISubscribers subscriber);
    void unsubscribe(ISubscribers subscribers);
    void notifySubscribers();
    void upload(String title);
}
