package com.ycli.factory.creator;

import com.ycli.factory.product.*;
import com.ycli.factory.product.newyork.NYStyleCheesePizza;
import com.ycli.factory.product.newyork.NYStyleClamPizza;
import com.ycli.factory.product.newyork.NYStylePepperoniPizza;
import com.ycli.factory.product.newyork.NYStyleVeggiePizza;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
        }
        return null;
    }
}
