package com.ycli.singletion;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class EagerChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static EagerChocolateBoiler uniqueInstance = new EagerChocolateBoiler();

    public static EagerChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
