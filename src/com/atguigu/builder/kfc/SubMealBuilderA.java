package com.atguigu.builder.kfc;

/**
 *A �ײͽ�������
 * SubMealBuilderA�Ǿ��彨������,�����ڴ���A�ײ�,���ǳ��������������,ʵ�����ڳ��������������Ĳ�����װ����,���ײ���һ�����ȱ���һ��������ɡ�
 */
public class SubMealBuilderA extends MealBuilder{


    @Override
    public void buildFood() {
        meal.setFood("һ�����ȱ�");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("һ������");
    }
}
