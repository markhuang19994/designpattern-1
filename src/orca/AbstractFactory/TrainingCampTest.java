package orca.AbstractFactory;

import kotlin.test.Asserter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainingCampTest {
    @Test
    public void test(){
        System.out.println("==========抽象工廠模式測試==========");

        //訓練營訓練冒險者
        //先用弓箭手訓練營訓練弓箭手
        TrainingCamp trainingCamp = new ArcherCamp();
        Adventure memberA = trainingCamp.trainAdventure();

        //用鬥士訓練營訓練鬥士
        trainingCamp = new WarriorCamp();
        Adventure memberB = trainingCamp.trainAdventure();

        trainingCamp = new CasterCamp();
        Adventure memberC = trainingCamp.trainAdventure();

        memberA.attack();
        memberB.attack();
        memberC.attack();

        Assertions.assertEquals(memberA.getClass().getSimpleName(),"Archer");
        Assertions.assertEquals(memberB.getClass().getSimpleName(),"Warrior");
        Assertions.assertEquals(memberC.getClass().getSimpleName(),"Caster");


        /**
         *         //看看是不是真的訓練出我們想要的冒險者
         *         Assert.assertEquals(memberA.getType(), "Archer");
         *         Assert.assertEquals(memberB.getType(), "Warrior");
         *
         *         // memberB應該是Warrior不是Knight，因此下面這行會報錯
         *         Assert.assertEquals(memberB.getType(), "Knight");
         *
         */


    }
}
