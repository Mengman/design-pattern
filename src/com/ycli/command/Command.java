package com.ycli.command;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public interface Command {
    void execute();

    void undo();
}
