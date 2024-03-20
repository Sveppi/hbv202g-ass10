package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

/**
 * The Observer interface represents an object that can be notified of changes in a subject.
 * Classes that implement this interface can register themselves as observers and receive updates
 * when the subject's state changes.
 */
public interface Observer {
    /**
     * This method is called by the subject to notify the observer of a change in the subject's state.
     * Implementing classes should define the specific actions to be taken when an update is received.
     */
    void update();
}
