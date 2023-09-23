package com.atguigu.bridge.food;

public class TestMain {
    public static void main(String[] args) {

        //µ°¸â
        Fruit mango = new Mango();
        Food cake = new Cake();
        cake.setFruit(mango);
        cake.add();
        //Å£ÄÌ
        Food milk = new Milk();
        milk.setFruit(mango);
        milk.add();
    }

}
