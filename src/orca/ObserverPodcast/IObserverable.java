package orca.ObserverPodcast;

import orca.Observer.Observer;

public interface IObserverable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObservers();
    public String getName();
}
