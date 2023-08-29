package com.atguigu.builder.kfc;

/**
 * B套餐建造者类
 * SubMealBuilderB也是具体建造者类,它用于创建B套餐,该套餐由一个鸡肉卷与一杯果汁组成。
 */
public class SubMealBuilderB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("一个鸡肉卷");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯果汁");
    }
}
