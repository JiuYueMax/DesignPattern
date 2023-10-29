package com.atguigu.iterator.test;

//抽象聚合(容器)角色接口
public interface StudentAggregate {
    //添加学生
    void addStudent(Student stu);

    //删除学生
    void removeStudent(Student stu);

    //获取迭代器对象
    StudentIterator getStudentIterator();
}

