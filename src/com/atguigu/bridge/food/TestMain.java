package com.atguigu.bridge.food;

public class TestMain {
    public static void main(String[] args) {

        //����
        Fruit mango = new Mango();
        Food cake = new Cake();
        cake.setFruit(mango);
        cake.add();
        //ţ��
        Food milk = new Milk();
        milk.setFruit(mango);
        milk.add();
    }

}
