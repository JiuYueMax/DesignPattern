package com.atguigu.builder.kfc;

/**
 * B�ײͽ�������
 * SubMealBuilderBҲ�Ǿ��彨������,�����ڴ���B�ײ�,���ײ���һ���������һ����֭��ɡ�
 */
public class SubMealBuilderB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("һ�������");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("һ����֭");
    }
}
