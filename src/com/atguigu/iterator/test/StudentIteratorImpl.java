package com.atguigu.iterator.test;

import java.util.List;

//�����������ɫ��
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    //������¼����ʱ��λ��
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //�Ӽ����л���ȥָ��λ�õ�Ԫ��
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
