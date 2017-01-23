package com.ycli.factory.creator;

import com.ycli.factory.creator.ingredient.*;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
