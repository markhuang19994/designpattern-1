package orca.BuilderMacbook;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        MacbookPro_2018 macbookPro_2018 = new MacbookPro_2018();

        MacBookSeller macBookSeller = new MacBookSeller(macbookPro_2018);

        MacbookPro myMacbook= macBookSeller.lowSpec();

        System.out.println(myMacbook.toString());


        MacbookPro dreamMacbook = macbookPro_2018
                .buildCPU(new MacbookPro.Processor("2.9GHz 6 核心第八代 Intel Core i9 處理器"))
                .buildMemory(new MacbookPro.Memory(32))
                .buildStorage(new MacbookPro.Storage(4096))
                .buildKeyboard(new MacbookPro.Keyboard("英文"))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .build();

        System.out.println(dreamMacbook.toString());

    }
}
