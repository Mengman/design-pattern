package com.ycli.command.stereo;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class Stereo {
    public void on() {
        System.out.println("Turn stereo on");
    }

    public void off() {
        System.out.println("Turn stereo off");
    }

    public void setCd() {
        System.out.println("Put CD into the stereo");
    }

    public void setDvd() {
        System.out.println("Put DVD into the stereo");
    }

    public void setVolume(int i) {
        System.out.println("Set volume to " + i);
    }
}
