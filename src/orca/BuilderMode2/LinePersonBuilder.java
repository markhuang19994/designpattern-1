package orca.BuilderMode2;

public class LinePersonBuilder extends PersonBuilder {
    @Override
    public void head() {
        System.out.println("畫圓圈");
    }

    @Override
    public void body() {
        System.out.println("畫直線當身體");
    }

    @Override
    public void lefthand() {
        System.out.println("畫直線當左手");
    }

    @Override
    public void righthand() {
        System.out.println("畫直線當右手");
    }

    @Override
    public void leftleg() {
        System.out.println("畫直線當左腳");
    }

    @Override
    public void rightleg() {
        System.out.println("畫直線當右腳");
    }

    @Override
    public void buildFinish() {
        System.out.println("線條人建造完成");
    }
}
