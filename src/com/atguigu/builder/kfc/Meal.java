package com.atguigu.builder.kfc;

import java.io.Serializable;

/**
 * ��Ʒ��
 * �ײ���Meal�Ǹ��Ӳ�Ʒ����o������������Ա����food �� drink,���� food��ʾ��ʳ,drink ��ʾ����,�� Meal�л�������Ա���Ե�Getter������Setter������
 */
public class Meal implements Serializable {

    protected String food;

    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
