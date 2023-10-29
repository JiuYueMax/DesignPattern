package com.atguigu.iterator.test;

import java.util.List;

//具体迭代器角色类
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    //用来记录遍历时的位置
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
        //从集合中或者去指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
