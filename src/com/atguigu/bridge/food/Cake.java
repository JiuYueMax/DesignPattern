package com.atguigu.bridge.food;

/**
 * 2.2、食品类的子类一：蛋糕
 */
public class Cake extends Food{
    @Override
    public void add() {
        fruit.beAdd("蛋糕");
    }
}
