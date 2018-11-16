package orca.SingletonMod;

import java.io.ObjectStreamException;

public class DoubleCheckLock {
    public static DoubleCheckLock instance;

    private DoubleCheckLock(){}

    public static DoubleCheckLock getInstance(){

//        第一層判斷為了避免不必要的同步
        if(instance == null){

            synchronized (DoubleCheckLock.class){
//                第二層判斷為了在null的狀況下建立實例
                if(instance == null){
                    instance = new DoubleCheckLock();
                }
            }

        }

        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
