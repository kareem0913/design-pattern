package observerPattern;

import observerPattern.observable.Observable;
import observerPattern.observable.ObservableImpl;
import observerPattern.observer.Observer;
import observerPattern.observer.ObserverImpl;

public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();
        Observer observer = new ObserverImpl();
        observable.registerObserver(observer);
        observable.changeState("State 1");
    }
}
