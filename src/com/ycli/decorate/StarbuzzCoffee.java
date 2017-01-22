package com.ycli.decorate;

import com.ycli.decorate.concrete.DarkRoast;
import com.ycli.decorate.concrete.Espresso;
import com.ycli.decorate.concrete.HouseBlend;
import com.ycli.decorate.decorator.Mocha;
import com.ycli.decorate.decorator.Soy;
import com.ycli.decorate.decorator.Whip;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        serveBeverage(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        serveBeverage(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        serveBeverage(beverage3);
    }

    private static void serveBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
