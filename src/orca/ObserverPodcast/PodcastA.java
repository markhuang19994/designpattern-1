package orca.ObserverPodcast;

import orca.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class PodcastA implements IObserverable {

    List<IObserver> list = new ArrayList<>();

    String name = "英文廣播";

    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        list.remove(observer);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void notifyObservers() {

        for (IObserver o: list) {
            o.update();
        }
    }

}
