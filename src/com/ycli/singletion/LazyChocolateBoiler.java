package com.ycli.singletion;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class LazyChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static LazyChocolateBoiler uniqueInstance;

    private LazyChocolateBoiler() {
        empty = true;
        boiled = false;
    }


    public static synchronized LazyChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazyChocolateBoiler();
        }
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
