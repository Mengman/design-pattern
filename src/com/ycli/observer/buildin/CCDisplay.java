package com.ycli.observer.buildin;

import com.ycli.observer.inter.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class CCDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CCDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WData) {
            WData wData = (WData) o;
            this.temperature = wData.getTemperature();
            this.humidity = wData.getHumidity();
            display();
        }
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
