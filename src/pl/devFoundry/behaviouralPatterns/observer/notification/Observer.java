package pl.devFoundry.behaviouralPatterns.observer.notification;

import pl.devFoundry.behaviouralPatterns.observer.order.Order;

public interface Observer {

    void update(Order order);
}
