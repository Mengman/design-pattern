package com.ycli.command.garagedoor;

import com.ycli.command.light.Light;

/**
 * Created by yucai on 2017/1/24.
 * Email: yucai.li@hpe.com
 */
public class GarageDoor {
    private Light light;

    public GarageDoor(Light light) {
        this.light = light;
    }

    public void up() {
        System.out.println("Garage door open up");
    }

    public void down() {
        System.out.println("Garage door close down");
    }

    public void stop() {
        System.out.println("Garage door stop");
    }

    public void lightOn() {
        light.on();
    }

    public void lightOff() {
        light.off();
    }
}
