package orca.AbstractFactory2;

public class SUVFactory extends AbstractFactory {
    @Override
    public Audi createAudi() {
        return new AudiSUV();
    }

    @Override
    public BMW createBMW() {
        return new BMWSUV();
    }
}
