package com.ycli.observer.buildin;

/**
 * Created by yucai on 2017/1/22.
 * Email: yucai.li@hpe.com
 */
public class WS {
    public static void main(String[] args) {
        WData wData = new WData();
        CCDisplay ccDisplay = new CCDisplay(wData);
        wData.setMeaurements(80, 65, 30.4f);
        wData.setMeaurements(82, 70, 29.2f);
        wData.setMeaurements(78, 90, 29.2f);
    }
}
