package com.ycli.composite;

import java.util.Iterator;

/**
 * Created by yucai on 2017/3/11.
 * Email: yucai.li@hpe.com
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
