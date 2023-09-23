package com.atguigu.bridge.food;

/**
 * 2.1、创建食品类，该类为抽象类，主要提供添加add的方法；
 */
public abstract class Food {
    //水果
    Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    /**
     * 制作时添加
     */
    public abstract void add();

}
