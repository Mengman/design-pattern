package com.ycli.command.light;

import com.ycli.command.Command;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
