package com.atguigu.builder.kfc;

/**
 * 服务员
 * KFCWaiter类是指挥者类,在KFC套餐制作过程中,它就是KFC的服务员。
 * 在其中定义了一个抽象建造者类型的变量mb,具体建造者类型由客户端指定,
 * 在其construct()方法中调用mb对象的部件组装方法和工厂方法,用于向客户端返回-份包含主食和饮料的完整套餐
 */
public class KFCWaiter {
    private MealBuilder mb;

    public Meal construct(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }

    public void setMb(MealBuilder mb) {
        this.mb = mb;
    }
}
