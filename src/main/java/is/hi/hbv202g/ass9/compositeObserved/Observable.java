package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

/**
 * The Observable class represents an observable object that can be observed by one or more observers.
 * It provides methods to attach, detach, and notify observers.
 */
public abstract class Observable {

    private List<Observer> observers;

    /**
     * Constructs a new Observable object.
     * Initializes the list of observers.
     */
    public Observable() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Attaches an observer to this Observable object.
     * The observer will be notified when the state of the observable object changes.
     *
     * @param observer the observer to attach
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Detaches an observer from this Observable object.
     * The observer will no longer be notified when the state of the observable object changes.
     *
     * @param observer the observer to detach
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all attached observers that the state of the observable object has changed.
     * Each observer's update() method will be called.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
}
