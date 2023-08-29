package com.atguigu.builder.kfc;

/**
 * ����Ա
 * KFCWaiter����ָ������,��KFC�ײ�����������,������KFC�ķ���Ա��
 * �����ж�����һ�������������͵ı���mb,���彨���������ɿͻ���ָ��,
 * ����construct()�����е���mb����Ĳ�����װ�����͹�������,������ͻ��˷���-�ݰ�����ʳ�����ϵ������ײ�
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
