package pl.devFoundry.behaviouralPatterns.observer.notification;

import pl.devFoundry.behaviouralPatterns.observer.order.Order;

public class MobileApp implements Observer{

    @Override
    public void update(Order order){
        System.out.println("Aplikacja mobilna - zamównie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
