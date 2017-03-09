package com.ycli.iterator;

import java.util.ArrayList;

/**
 * Created by yucai on 2017/3/9.
 * Email: yucai.li@hpe.com
 */
public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private java.util.Iterator iterator;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.iterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Object next() {
        return this.iterator.next();
    }
}

