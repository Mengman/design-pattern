package com.ycli.state;

import java.io.Serializable;

/**
 * Created by yucai on 2017/3/13.
 * Email: yucai.li@hpe.com
 */
public interface State extends Serializable{
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
