package orca.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 通知不務正業的員工老闆回來了
 *
 */

public abstract class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void attach(Observer observer){
        list.add(observer);
    }
    public void detach(Observer observer){
        list.remove(observer);
    }

    public abstract void notifyObserver(String states);

}
