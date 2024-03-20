package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * The `Observable` class represents an abstract base class for objects that can be observed by one or more observers.
 * It provides methods to attach, detach, and notify observers.
 */
public abstract class Observable {

    private List<Observer> observers;

    /**
     * Constructs a new Observable object.
     */
    public Observable() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Attaches an observer to this Observable object.
     * 
     * @param observer the observer to attach
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Detaches an observer from this Observable object.
     * 
     * @param observer the observer to detach
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all attached observers that a change has occurred.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
}
