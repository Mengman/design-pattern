package com.ycli.observer.buildin;

import java.util.Observable;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class WData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WData(){}

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeaurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
