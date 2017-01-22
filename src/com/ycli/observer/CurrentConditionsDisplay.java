package com.ycli.observer;

import com.ycli.observer.inter.DisplayElement;
import com.ycli.observer.inter.Observer;
import com.ycli.observer.inter.Subject;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
