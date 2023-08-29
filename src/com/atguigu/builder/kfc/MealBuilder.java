package com.atguigu.builder.kfc;

/**
 * 套餐建造者类
 * MealBuilder是套餐建造者,它是一个抽象类,声明了抽象的部件组装方法 buildFood()和 buildDrink(),
 * 在 MealBuilder 中定义了Meal类型的对象meal,提供了工厂方法 getMeal()用于返回meal对象。
 */
public abstract class MealBuilder {

    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }

}
