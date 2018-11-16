package orca.BuilderMacbook;


public class MacbookPro {

    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Graphics graphics;
    private Keyboard keyboard;

    MacbookPro(){}

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "{ Macbook : " + "\n" +
                "Processor : " + this.getProcessor().name + "\n" +
                "Memory size : " + this.getMemory().howMuch + "GB" + "\n" +
                "Graphics : " + this.getGraphics().name + "\n" +
                "Storage size : " + this.getStorage().howMuch + "GB" +"\n" +
                "Keyboard language : "+ this.getKeyboard().language +
                " }";
    }

    public static class Processor{
        String name;
        Processor(String name){
            this.name = name;
        }
    }

    public static class Memory{
        int howMuch;
        Memory(int howMuch){
            this.howMuch = howMuch;
        }
    }

    public static class Graphics{
        String name;
        Graphics(String name){
            this.name = name;
        }
    }

    public static class Storage{

        int howMuch;

        Storage(int howMuch){
            this.howMuch = howMuch;
        }

    }
    public static class Keyboard{

        String language;

        Keyboard(String language){
            this.language = language;
        }

    }

}
