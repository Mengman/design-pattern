package com.ycli.state;

/**
 * Created by yucai on 2017/3/13.
 * Email: yucai.li@hpe.com
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
