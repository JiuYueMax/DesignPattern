package com.atguigu.bridge.food;

/**
 * 1.1��ˮ���ӿ�ʵ����һ���㽶
 */
public class Banana implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("�㽶" + food);
    }
}
