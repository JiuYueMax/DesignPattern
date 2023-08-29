package com.atguigu.builder.kfc;

/**
 *A 套餐建造者类
 * SubMealBuilderA是具体建造者类,它用于创建A套餐,它是抽象建造者类的子类,实现了在抽象建造者中声明的部件组装方法,该套餐由一个鸡腿堡与一杯可乐组成。
 */
public class SubMealBuilderA extends MealBuilder{


    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
