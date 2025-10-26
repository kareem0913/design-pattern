package observerPattern.observer;

public class ObserverImpl implements Observer{
    @Override
    public void update(String state) {
        System.out.println("ObserverImpl: " + state);
    }
}
