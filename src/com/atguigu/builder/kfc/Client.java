package com.atguigu.builder.kfc;

/**
 * �ͻ��˲�����
 * �ڿͻ��˲�������,ͨ��new���彨��������������Ի��һ�����彨���߶���mb,
 * Ȼ���䴫��ָ������KFCWaiter�Ķ��� waiter ��,
 * ͨ�� waiter ��construct()�����������ײ͵���ɷ����������ײ͸��ͻ��ˡ�
 */
public class Client {

    public static void main(String[] args) {
        MealBuilder mb = new SubMealBuilderB();
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMb(mb);
        Meal meal = waiter.construct();
        System.out.println("�ײ���ɣ�" + meal.getFood() + meal.getDrink());
    }

}
