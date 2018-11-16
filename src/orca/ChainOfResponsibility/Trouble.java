package orca.ChainOfResponsibility;

public class Trouble {

    private String name;

    private int code;

    public Trouble(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
