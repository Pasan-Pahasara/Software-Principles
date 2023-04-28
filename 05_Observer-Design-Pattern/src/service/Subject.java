package service;

/**
 * @author : ShEnUx
 * @time : 5:27 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public interface Subject {
    void register(Observer ob);
    void unregister(Observer ob);
    void notifyAllObservers(String message);
}
