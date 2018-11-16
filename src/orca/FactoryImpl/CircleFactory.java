package orca.FactoryImpl;

public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        System.out.println("創建一個圓圈");
        return new Circle();
    }
}
