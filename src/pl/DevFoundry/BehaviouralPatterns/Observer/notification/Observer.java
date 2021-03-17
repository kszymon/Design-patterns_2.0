package pl.DevFoundry.BehaviouralPatterns.Observer.notification;

import pl.DevFoundry.BehaviouralPatterns.Observer.order.Order;

public interface Observer {

    void update(Order order);
}
