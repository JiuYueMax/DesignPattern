package com.atguigu.facade;

import java.util.Objects;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这里直接调用。。 很麻烦
		/*HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		
		
		homeTheaterFacade.end();*/
		String a = "hello";
		String b = new String("hello");
		System.out.println(Objects.equals(a,b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}


}
