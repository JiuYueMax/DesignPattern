package com.atguigu.composite.learn;

/**
 * 定义叶子构件
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display() {
        System.out.println("Leaf: " + name);
    }

}
