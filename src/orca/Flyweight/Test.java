package orca.Flyweight;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){


        MacbookFactory factory = new MacbookFactory();

        Macbook goodbook = factory.getMacbook(Macbook.Spec.HIGH);

        System.out.println(goodbook.toString());

        CustomSetting superSetting = new CustomSetting();

        superSetting.setCpu("i9");
        superSetting.setMemory(32);
        superSetting.setStorage(1024);

        Macbook superMacbook = factory.getCustomMacbook(superSetting);

        System.out.println(superMacbook.toString());

    }
}
