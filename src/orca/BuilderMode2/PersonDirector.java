package orca.BuilderMode2;

public class PersonDirector {

    PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public void drawUpDown(){
        System.out.println("從頭開始畫到腳");
        personBuilder.head();
        personBuilder.body();
        personBuilder.lefthand();
        personBuilder.righthand();
        personBuilder.leftleg();
        personBuilder.rightleg();
    }
    public void drawDownUp(){
        System.out.println("從腳開始畫到頭");
        personBuilder.leftleg();
        personBuilder.rightleg();
        personBuilder.lefthand();
        personBuilder.righthand();
        personBuilder.body();
        personBuilder.head();
    }


}
