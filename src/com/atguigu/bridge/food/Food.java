package com.atguigu.bridge.food;

/**
 * 2.1������ʳƷ�࣬����Ϊ�����࣬��Ҫ�ṩ���add�ķ�����
 */
public abstract class Food {
    //ˮ��
    Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    /**
     * ����ʱ���
     */
    public abstract void add();

}
