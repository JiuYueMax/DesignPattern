package com.atguigu.bridge.food;

/**
 * 2.4、食品类的子类三：奶茶
 */
public class MilkTea extends Food{
    @Override
    public void add() {
        fruit.beAdd("奶茶");
    }
}
