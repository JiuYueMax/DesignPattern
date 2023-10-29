package com.atguigu.iterator.test;

public class Client {
    public static void main(String[] args) {
        //�����ۺ�(����)����
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        Student student1 = new Student("Tom", "1001");
        Student student2 = new Student("Mike", "1002");
        Student student3 = new Student("Jerry", "1003");
        Student student4 = new Student("Mary", "1004");
        //���Ԫ��
        aggregate.addStudent(student1);
        aggregate.addStudent(student2);
        aggregate.addStudent(student3);
        aggregate.addStudent(student4);

        //ɾ��Ԫ��
        aggregate.removeStudent(student3);

        //�����ۺ϶���
        // 1.��ȡ����������
        StudentIterator iterator = aggregate.getStudentIterator();
        // 2.����
        while (iterator.hasNext()){
            // 3.��ȡԪ��
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
