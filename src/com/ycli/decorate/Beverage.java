package com.ycli.decorate;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
