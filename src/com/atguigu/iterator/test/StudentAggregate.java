package com.atguigu.iterator.test;

//����ۺ�(����)��ɫ�ӿ�
public interface StudentAggregate {
    //���ѧ��
    void addStudent(Student stu);

    //ɾ��ѧ��
    void removeStudent(Student stu);

    //��ȡ����������
    StudentIterator getStudentIterator();
}

