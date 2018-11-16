package orca.TemplateMethod;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        SoftwareManager softwareManager = new SoftwareManager();

        softwareManager.completeSoftware();

        softwareManager.redoSoftware();
    }
}
