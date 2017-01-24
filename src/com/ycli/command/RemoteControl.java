package com.ycli.command;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 7) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void onButtonWasPushed(int slot) {
        if (slot < 7) {
            onCommands[slot].execute();
        }
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        if (slot < 7) {
            offCommands[slot].execute();
        }
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n-------- Remote Control ----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append(" ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
