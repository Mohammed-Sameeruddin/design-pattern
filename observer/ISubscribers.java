package designPattern.observer;

public interface ISubscribers {
    void update();
    void subscribeChannel(IChannel channel);
}
