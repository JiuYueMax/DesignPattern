package com.atguigu.composite.learn;

/**
 * 共享接口，所有叶节点和组合节点都实现这个接口
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
