package com.atguigu.iterator.test;

public class Client {
    public static void main(String[] args) {
        //创建聚合(容器)对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        Student student1 = new Student("Tom", "1001");
        Student student2 = new Student("Mike", "1002");
        Student student3 = new Student("Jerry", "1003");
        Student student4 = new Student("Mary", "1004");
        //添加元素
        aggregate.addStudent(student1);
        aggregate.addStudent(student2);
        aggregate.addStudent(student3);
        aggregate.addStudent(student4);

        //删除元素
        aggregate.removeStudent(student3);

        //遍历聚合对象
        // 1.获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();
        // 2.遍历
        while (iterator.hasNext()){
            // 3.获取元素
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
