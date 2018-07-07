package com.sun.effective.java.chapter.one.sfactory;

public class ParameterizedInstance {

	/**
	 * A benefit of this is if you have long and many kind of nested generic types.
	 * For an example: // public static <K,V> HashMap<K,V> getMap() { // return new
	 * HashMap<K,V>(); }, when V is nested K,V pair
	 */
	public static <T> ZooAnimal<T> getZooAnimalInstance() {
		return new ZooAnimal<>();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Tiger animal = new Tiger();
		String someString = new String("notAnAnimalType");

		ZooAnimal<Tiger> sofiaZoo = ParameterizedInstance.getZooAnimalInstance();
		sofiaZoo.sayHello(animal);
		// sofiaZoo.sayHello(string); Compilation failure.

		ZooAnimal<Tiger> leParcZoologiqueDeParis = new ZooAnimal<>();
		leParcZoologiqueDeParis.sayHello(animal);
		// leParcZoologiqueDeParis.sayHello(string); Compilation failure.
	}

}
