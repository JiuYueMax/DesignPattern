package com.atguigu.bridge.food;

/**
 * 1.2、水果接口实现类二：草莓
 */
public class Strawberry implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("草莓" + food);
    }
}
