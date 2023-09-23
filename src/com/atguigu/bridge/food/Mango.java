package com.atguigu.bridge.food;

/**
 * 1.3、水果接口实现类三：芒果
 */
public class Mango implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("芒果" + food);
    }
}
