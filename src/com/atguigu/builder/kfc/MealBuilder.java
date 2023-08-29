package com.atguigu.builder.kfc;

/**
 * �ײͽ�������
 * MealBuilder���ײͽ�����,����һ��������,�����˳���Ĳ�����װ���� buildFood()�� buildDrink(),
 * �� MealBuilder �ж�����Meal���͵Ķ���meal,�ṩ�˹������� getMeal()���ڷ���meal����
 */
public abstract class MealBuilder {

    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }

}
