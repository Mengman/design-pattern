package com.ycli.observer;

import com.ycli.observer.inter.DisplayElement;
import com.ycli.observer.inter.Observer;
import com.ycli.observer.inter.Subject;

import java.util.Random;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure." );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = forecast(temp);
        this.humidity = forecast(humidity);
        this.pressure = forecast(pressure);
        display();
    }

    private float forecast(float condition) {
        Random random = new Random();
        return condition + random.nextInt((int)(condition * 0.1));
    }
}
