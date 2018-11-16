package orca.Adapter;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        BlackMan blackMan = new BlackMan("black");

        blackMan.helloEnglish();
        blackMan.selfIntroEnglish();


        TaiwanMan taiwanMan = new TaiwanMan(new BlackmanTranslator(blackMan.name));

        taiwanMan.hello();
        taiwanMan.selfIntro();

    }
}
