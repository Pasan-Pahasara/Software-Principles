package service.impl;

import service.Observer;
import service.Subject;

import java.util.ArrayList;

/**
 * @author : ShEnUx
 * @time : 5:27 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class Kamali implements Subject {

    ArrayList<Observer> allObservers = new ArrayList<>();

    @Override
    public void register(Observer ob) {
        allObservers.add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        allObservers.remove(ob);
    }

    @Override
    public void notifyAllObservers(String message) {
        for (Observer allObserver : allObservers) {
            allObserver.update(message);
        }
    }
}
