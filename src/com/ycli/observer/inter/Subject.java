package com.ycli.observer.inter;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
