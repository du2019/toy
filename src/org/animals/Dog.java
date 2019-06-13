package org.animals;


public class Dog {

	private int age = 0;
	public int magicNumber = 17;

	public int getAge() {
		return this.age;
	}

	public void takeABreath() {
		System.out.println("...");
	}
	public void barkBark(Dog dog) {
		System.out.println("ruff");
		System.out.println("ruff");
		dog.takeABreath();
		System.out.println("ruff");
		System.out.println("ruff");
		System.out.println("ruff");
	}

}
