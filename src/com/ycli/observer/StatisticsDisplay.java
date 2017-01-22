package com.ycli.observer;

import com.ycli.observer.inter.DisplayElement;
import com.ycli.observer.inter.Observer;
import com.ycli.observer.inter.Subject;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure." );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = averageConditionDigits(this.temperature, temp);
        this.humidity = averageConditionDigits(this.humidity, humidity);
        this.pressure = averageConditionDigits(this.pressure, pressure);
        display();
    }

    private float averageConditionDigits(float... conditions) {
        float total = 0;
        for (int i = 0; i < conditions.length; i++) {
            total += conditions[i];
        }
        return total/conditions.length;
    }
}
