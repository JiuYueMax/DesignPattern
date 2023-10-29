package com.atguigu.composite.learn;

/**
 * ����ӿڣ�����Ҷ�ڵ����Ͻڵ㶼ʵ������ӿ�
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display();

}
