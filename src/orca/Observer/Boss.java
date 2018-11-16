package orca.Observer;

public class Boss extends Subject {
    @Override
    public void notifyObserver(String states) {
        for(Observer ob : list){
            ob.update(states);
        }
    }
}
