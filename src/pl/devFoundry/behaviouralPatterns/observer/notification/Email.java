package pl.devFoundry.behaviouralPatterns.observer.notification;

import pl.devFoundry.behaviouralPatterns.observer.order.Order;

public class Email implements Observer{

    @Override
    public void update(Order order){
        System.out.println("E-mail- zamównie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
