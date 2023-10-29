package com.atguigu.composite.learn;

import java.awt.*;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Component root = new Composite("root");
        Component composite1 = new Composite("composite1");
        Component composite2 = new Composite("composite2");
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");

        root.add(leaf1);
        root.add(leaf2);
        root.add(composite1);
        composite1.add(leaf3);
        composite1.add(composite2);

        root.display();
    }
}
