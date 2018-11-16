package orca.TemplateMethod;


public abstract class BossMethod {


    private String bossThink(){
        return "我覺得呢，這個東西應該要這樣做這樣做。 ： ";
    }

    private String bossRedo(){
        return "你們這個跟我想做得不一樣重新做。";
    }

    abstract String UI_Design();

    abstract String systemAnalysis();

    abstract String systemDesign();

    abstract String programming();

    abstract String test();


    public void completeSoftware(){

        System.out.println(
                bossThink() + UI_Design() + "\n" +
                bossThink() + systemAnalysis() + "\n" +
                bossThink() + systemDesign() + "\n" +
                bossThink() + programming() + "\n" +
                bossThink() + test()
        );

    }

    public void redoSoftware(){
        System.out.println(bossRedo());
        completeSoftware();
    }

}
