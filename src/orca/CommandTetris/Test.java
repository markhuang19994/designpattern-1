package orca.CommandTetris;

import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void test(){

        Tetris tetris = new Tetris();
        ICommandTetris commandLeft = new TurnLeft(tetris);
        ICommandTetris commandRight = new TurnRight(tetris);
        ICommandTetris commandDown= new StraightDown(tetris);

        Invoker invoker = new Invoker(commandLeft);

        invoker.invoke();

        invoker.setCommand(commandRight);

        invoker.invoke();

        invoker.setCommand(commandDown);

        invoker.invoke();



    }

}
