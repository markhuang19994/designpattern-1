package orca.Observer;

/**
 *
 * 櫃檯小妹 通知同事
 *
 */

public class Secretary extends Subject{

    @Override
    public void notifyObserver(String states) {
        for(Observer ob:list){
            ob.update(states);
        }
    }

}
