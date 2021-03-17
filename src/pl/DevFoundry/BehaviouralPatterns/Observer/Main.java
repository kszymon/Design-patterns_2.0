package pl.DevFoundry.BehaviouralPatterns.Observer;

import pl.DevFoundry.BehaviouralPatterns.Observer.notification.Email;
import pl.DevFoundry.BehaviouralPatterns.Observer.notification.MobileApp;
import pl.DevFoundry.BehaviouralPatterns.Observer.notification.TextMessage;
import pl.DevFoundry.BehaviouralPatterns.Observer.order.Order;
import pl.DevFoundry.BehaviouralPatterns.Observer.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("---------------------------------------------");

        order.changeOrderStatus(OrderStatus.WYSLANO);

        order.unregisterObserver(email);

        System.out.println("---------------------------------------------");

        order.changeOrderStatus(OrderStatus.ODERBANE);
    }
}
