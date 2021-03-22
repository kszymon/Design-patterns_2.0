package pl.devFoundry.behaviouralPatterns.observer.notification;

import pl.devFoundry.behaviouralPatterns.observer.order.Order;

public class TextMessage implements Observer {
    @Override
    public void update(Order order){
        System.out.println("SMS - zamównie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
