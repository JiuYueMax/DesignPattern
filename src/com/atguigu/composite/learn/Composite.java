package com.atguigu.composite.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义容器构件
 */
public class Composite extends Component{
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Composite: " + name);
        for (Component component : children) {
            component.display();
        }
    }
}
