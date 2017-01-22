package com.ycli.decorate.decorator;

import com.ycli.decorate.Beverage;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
