package orca.BuilderMode2;

public class GundamBuilder extends PersonBuilder {
//    略過詳細內容...
    @Override
    public void head() {

    }

    @Override
    public void body() {
        System.out.println("軀幹");
    }

    @Override
    public void lefthand() {

    }

    @Override
    public void righthand() {
        System.out.println("武器");
    }

    @Override
    public void leftleg() {

    }

    @Override
    public void rightleg() {

    }

    @Override
    public void buildFinish() {
        System.out.println("鋼彈建造完成");
    }
}
