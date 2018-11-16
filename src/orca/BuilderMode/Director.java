package orca.BuilderMode;

public class Director {
    private static Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constructor(){
        builder.build1();
        for(int i = 0 ; i < 5 ; i ++){
            builder.build2();
        }
        builder.build3();
    }

}
