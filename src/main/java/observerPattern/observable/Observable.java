package observerPattern.observable;

import observerPattern.observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String state);
    public void changeState(String state);
}
