package com.sun.effective.java.chapter.one.sfactory;

public class ZooAnimal<T> {

	public ZooAnimal() {
	}

	public void sayHello(T animal) {
		System.out.println(animal.toString());
	}

}
