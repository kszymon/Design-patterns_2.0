package pl.DevFoundry.BehaviouralPatterns.Observer.order;

import pl.DevFoundry.BehaviouralPatterns.Observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
