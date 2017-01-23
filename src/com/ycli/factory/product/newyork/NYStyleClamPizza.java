package com.ycli.factory.product.newyork;

import com.ycli.factory.product.Pizza;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Sauce Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
