package com.ycli.templatemethod;

/**
 * Created by yucai on 2017/2/7.
 * Email: yucai.li@hpe.com
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println('\n');

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
