package pl.DevFoundry.BehaviouralPatterns.Observer.notification;

import pl.DevFoundry.BehaviouralPatterns.Observer.order.Order;

public class MobileApp implements Observer{

    @Override
    public void update(Order order){
        System.out.println("Aplikacja mobilna - zamównie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
