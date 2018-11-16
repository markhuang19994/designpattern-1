package orca.SingletonMod;

public class Lazy {

    private static Lazy instance;

    private Lazy(){}

//    每一次都需要進行synchronized效能比較差不建議用
    public static synchronized Lazy getInstance(){

        if(instance == null){
            instance = new Lazy();
        }

        return instance;
    }
}
