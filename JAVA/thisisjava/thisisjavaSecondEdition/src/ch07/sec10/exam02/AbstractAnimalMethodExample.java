package ch07.sec10.exam02;

public class AbstractAnimalMethodExample {

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		

	}

}
