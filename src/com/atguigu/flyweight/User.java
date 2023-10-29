package com.atguigu.flyweight;

public class User {
	
	private String name;

	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// 如果Integer.valseOf(x) x 在 -128 ~ 127 之间，就是使用享元模式返回
		//超出范围，则进行new
		//小结：
		//1. 在valueOf 方法中，先判断是否在IntegerCache中，如果不在，就创建新的Integer(new)，否则，就直接从缓存池返回
		//2. valueOf 方法，就使用到享元模式。
		//3. 如果使用valueOf 方法得到一个Integer 实例，范围在-128 ~ 127 之间，执行速度比new要快

		Integer x = Integer.valueOf(127);
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);
		System.out.println(x.equals(y)); // true  比较大小
		System.out.println(x == y ); // false  比较内存地址
		System.out.println((x == z) ); // true 比较内存地址，因为没有超出默认
		System.out.println(w == x ); // false 比较内存地址
		System.out.println(w == y ); // false 比较内存地址

		String cc = new String("a");
		String ccc = new String("a");
		System.out.println(cc.hashCode());
		System.out.println(ccc.hashCode());
	}
	
}
