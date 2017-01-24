package com.ycli.command.stereo;

import com.ycli.command.Command;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
