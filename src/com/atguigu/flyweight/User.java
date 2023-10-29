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
		// ���Integer.valseOf(x) x �� -128 ~ 127 ֮�䣬����ʹ����Ԫģʽ����
		//������Χ�������new
		//С�᣺
		//1. ��valueOf �����У����ж��Ƿ���IntegerCache�У�������ڣ��ʹ����µ�Integer(new)�����򣬾�ֱ�Ӵӻ���ط���
		//2. valueOf ��������ʹ�õ���Ԫģʽ��
		//3. ���ʹ��valueOf �����õ�һ��Integer ʵ������Χ��-128 ~ 127 ֮�䣬ִ���ٶȱ�newҪ��

		Integer x = Integer.valueOf(127);
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);
		System.out.println(x.equals(y)); // true  �Ƚϴ�С
		System.out.println(x == y ); // false  �Ƚ��ڴ��ַ
		System.out.println((x == z) ); // true �Ƚ��ڴ��ַ����Ϊû�г���Ĭ��
		System.out.println(w == x ); // false �Ƚ��ڴ��ַ
		System.out.println(w == y ); // false �Ƚ��ڴ��ַ

		String cc = new String("a");
		String ccc = new String("a");
		System.out.println(cc.hashCode());
		System.out.println(ccc.hashCode());
	}
	
}
