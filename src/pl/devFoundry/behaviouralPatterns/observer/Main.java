package pl.devFoundry.behaviouralPatterns.observer;

import pl.devFoundry.behaviouralPatterns.observer.notification.Email;
import pl.devFoundry.behaviouralPatterns.observer.notification.MobileApp;
import pl.devFoundry.behaviouralPatterns.observer.notification.TextMessage;
import pl.devFoundry.behaviouralPatterns.observer.order.Order;
import pl.devFoundry.behaviouralPatterns.observer.order.OrderStatus;

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
