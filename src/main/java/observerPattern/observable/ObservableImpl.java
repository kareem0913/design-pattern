package observerPattern.observable;

import observerPattern.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class ObservableImpl implements Observable{
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String state) {
        observers
                .forEach(observer -> observer.update(state));
    }

    @Override
    public void changeState(String state){
        notifyObservers(state);
    }
}
