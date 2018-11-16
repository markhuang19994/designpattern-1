package orca.CommandTetris;

public class Invoker {

    ICommandTetris command;


    public Invoker(ICommandTetris command){
        this.command = command;
    }

    public void setCommand(ICommandTetris command){
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }

}
