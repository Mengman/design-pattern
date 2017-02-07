package com.ycli.templatemethod;

/**
 * Created by yucai on 2017/2/7.
 * Email: yucai.li@hpe.com
 */
public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
