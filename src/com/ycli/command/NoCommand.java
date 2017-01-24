package com.ycli.command;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Do nothing");
    }

    @Override
    public void undo() {
        System.out.println("Do nothing");
    }
}
