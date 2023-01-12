package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements ISubscribers{


    private List<IChannel> channels = new ArrayList<>();
    @Override
    public void update() {
        System.out.println("Video uploaded");
    }

    @Override
    public void subscribeChannel(IChannel channel) {
        this.channels.add(channel);
    }
}
