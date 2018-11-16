package orca.Mediator;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

//        無名的Boss
        Boss boss = new Boss();

//        各個員工
        PM wei = new PM("小偉");
        Programmer bad = new Programmer("小惡");
        Programmer good = new Programmer("阿仁");

//        把員工加入Boss下面管理
        boss.addMember(wei);
        boss.addMember(bad);
        boss.addMember(good);

//        Boss介紹新來的小惡
        boss.introduce(bad);

//        阿仁自己工作
        good.work();

//        boss請大家專心工作
        boss.workHard();

//        小惡自己做不來
//        PM請老闆幫忙
        wei.bossHelp(bad);


    }
}
