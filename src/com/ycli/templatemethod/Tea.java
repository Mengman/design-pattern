package com.ycli.templatemethod;

/**
 * Created by yucai on 2017/2/7.
 * Email: yucai.li@hpe.com
 */
public class Tea extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
