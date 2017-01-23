package com.ycli.factory.product.chicago;

import com.ycli.factory.product.Pizza;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
