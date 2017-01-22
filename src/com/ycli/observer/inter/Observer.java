package com.ycli.observer.inter;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
