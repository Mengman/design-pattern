package com.ycli.singletion;

/**
 * Created by yucai on 2017/1/23.
 * Email: yucai.li@hpe.com
 */
public class DoubleCheckedLockingChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static DoubleCheckedLockingChocolateBoiler uniqueInstance;

    public static DoubleCheckedLockingChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingChocolateBoiler();
                }
            }
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
