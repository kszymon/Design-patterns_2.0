package pl.devFoundry.behaviouralPatterns.observer.order;

import pl.devFoundry.behaviouralPatterns.observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
