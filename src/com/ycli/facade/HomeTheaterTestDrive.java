package com.ycli.facade;

/**
 * Created by yucai on 2017/2/6.
 * Email: yucai.li@hpe.com
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner(amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer(amplifier);
        CdPlayer cdPlayer = new CdPlayer(amplifier);
        Projector projector = new Projector(dvdPlayer);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(
                amplifier, tuner, dvdPlayer, cdPlayer,
                projector, lights, screen, popcornPopper
        );

        theaterFacade.watchMovie("Raiders of the Lost Ark");
        theaterFacade.endMovie();
    }
}
