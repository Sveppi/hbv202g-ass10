package is.hi.hbv202g.ass9.compositeObserved;

/**
 * The Observer interface represents an object that can observe and receive updates from a subject.
 * Implementing classes must provide an implementation for the update() method.
 */
public interface Observer {
    
    /**
     * This method is called by the subject to notify the observer of a change.
     * Implementing classes should define the specific behavior to be performed when an update is received.
     */
    void update();
}
