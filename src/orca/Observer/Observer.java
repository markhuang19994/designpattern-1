package orca.Observer;

/**
 *
 * 定義不認真上班的同事
 */

public abstract class Observer {
    protected String name;
    protected Subject sub;
    public Observer(String name,Subject sub){
        this.name = name;
        this.sub = sub;
    }

    public abstract void update(String states);
}
