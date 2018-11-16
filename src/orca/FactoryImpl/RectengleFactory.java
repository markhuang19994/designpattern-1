package orca.FactoryImpl;

public class RectengleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectengle();
    }
}
