package com.atguigu.builder.kfc;

/**
 * 客户端测试类
 * 在客户端测试类中,通过new具体建造者类的类名可以获得一个具体建造者对象mb,
 * 然后将其传入指挥者类KFCWaiter的对象 waiter 中,
 * 通过 waiter 的construct()方法来调用套餐的组成方法并返回套餐给客户端。
 */
public class Client {

    public static void main(String[] args) {
        MealBuilder mb = new SubMealBuilderB();
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMb(mb);
        Meal meal = waiter.construct();
        System.out.println("套餐组成：" + meal.getFood() + meal.getDrink());
    }

}
