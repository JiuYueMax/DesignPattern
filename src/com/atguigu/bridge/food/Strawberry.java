package com.atguigu.bridge.food;

/**
 * 1.2��ˮ���ӿ�ʵ���������ݮ
 */
public class Strawberry implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("��ݮ" + food);
    }
}
