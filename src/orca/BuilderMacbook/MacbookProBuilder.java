package orca.BuilderMacbook;

public abstract class MacbookProBuilder {


    protected MacbookPro macbookPro;

    MacbookProBuilder(){
        macbookPro = new MacbookPro();
    }

    abstract MacbookProBuilder buildCPU(MacbookPro.Processor processor);

    abstract MacbookProBuilder buildMemory(MacbookPro.Memory howMuch);

    abstract MacbookProBuilder buildGraphics(MacbookPro.Graphics name);

    abstract MacbookProBuilder buildStorage(MacbookPro.Storage howMuch);

    abstract MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language);

    MacbookPro build(){
        return macbookPro;
    }

}
