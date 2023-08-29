package com.atguigu.builder.kfc;

import java.io.Serializable;

/**
 * 产品类
 * 套餐类Meal是复杂产品对象﹐它包括两个成员属性food 和 drink,其中 food表示主食,drink 表示饮料,在 Meal中还包含成员属性的Getter方法和Setter方法。
 */
public class Meal implements Serializable {

    protected String food;

    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
