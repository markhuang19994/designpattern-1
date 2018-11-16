package orca.BuilderMacbook;

public class MacbookPro_2018 extends MacbookProBuilder {
    @Override
    MacbookPro build() {
        return super.build();
    }

    MacbookPro_2018() {
        super();
    }

    @Override
    MacbookProBuilder buildCPU(MacbookPro.Processor processor) {
        this.macbookPro.setProcessor(processor);
        return this;
    }

    @Override
    MacbookProBuilder buildMemory(MacbookPro.Memory howMuch) {
        this.macbookPro.setMemory(howMuch);
        return this;
    }

    @Override
    MacbookProBuilder buildGraphics(MacbookPro.Graphics name) {
        this.macbookPro.setGraphics(name);
        return this;
    }

    @Override
    MacbookProBuilder buildStorage(MacbookPro.Storage howMuch) {
        this.macbookPro.setStorage(howMuch);
        return this;
    }

    @Override
    MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language) {
        this.macbookPro.setKeyboard(language);
        return this;
    }
}
