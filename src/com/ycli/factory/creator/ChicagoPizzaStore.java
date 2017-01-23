package com.ycli.factory.creator;

import com.ycli.factory.product.*;
import com.ycli.factory.product.chicago.ChicagoStyleCheesePizza;
import com.ycli.factory.product.chicago.ChicagoStyleClamPizza;
import com.ycli.factory.product.chicago.ChicagoStylePepperoniPizza;
import com.ycli.factory.product.chicago.ChicagoStyleVeggiePizza;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
