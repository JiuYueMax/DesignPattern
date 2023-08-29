package com.atguigu.prototype.aaa;

public class Sheep implements Cloneable {

    private String name;
    private int age;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Cloneable �ӿ���Ҫ��д clone() ����
    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
