package com.atguigu.prototype.aaa;

public class PrototypeExample {
    public static void main(String[] args) {
        Sheep originalSheep = new Sheep("Dolly", 2);

        try {
            // 克隆对象
            Sheep clonedSheep = originalSheep.clone();

            System.out.println("Original Sheep: " + originalSheep.getName() + ", " + originalSheep.getAge());
            System.out.println("Cloned Sheep: " + clonedSheep.getName() + ", " + clonedSheep.getAge());

            // 修改克隆对象的属性，不影响原对象
            clonedSheep.setName("Molly");
            clonedSheep.setAge(3);

            System.out.println("Original Sheep after cloning: " + originalSheep.getName() + ", " + originalSheep.getAge());
            System.out.println("Cloned Sheep after modification: " + clonedSheep.getName() + ", " + clonedSheep.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
