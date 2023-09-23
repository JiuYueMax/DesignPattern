package com.atguigu.bridge.food;

/**
 * 2.3、食品类的子类二：牛奶
 */
public class Milk extends Food{
    @Override
    public void add() {
        fruit.beAdd("牛奶");
    }
}
