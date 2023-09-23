package com.atguigu.bridge.food;

/**
 * 1.1、水果接口实现类一：香蕉
 */
public class Banana implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("香蕉" + food);
    }
}
