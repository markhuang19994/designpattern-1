package orca.Memoto;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        ComputerCareTaker careTaker = new ComputerCareTaker();
        ComputerOriginator originator = new ComputerOriginator();

        careTaker.saveMemoto(originator.save());

        System.out.println(careTaker.getSave(0).getSystem());

        originator.setSystem("windows");

        careTaker.saveMemoto(originator.save());

        System.out.println(careTaker.getSave(1).getSystem());

    }
}
