package ca.meself.object_oriented_programming;

public class WorkingWithAnimals {
	
	public static void main(String[] args) {
		
		Dog clark = new Dog();
		
		clark.setName("Clarky");
		System.out.println(clark.getName());
		clark.digHole();
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says: " + kitty.getSound());
		
		Animal[] animals = new Animal[2];
		animals[0] = doggy;
		animals[1] = kitty;		
		
		for (Animal animal : animals) {
			System.out.println("Which animal sounds like this: " + animal.getSound());
		}
		
		// Below will not work. Because is not defined in Animal, only Dog.
		// doggy.digHole();
		
		((Dog) doggy).digHole();
	}
	
	public static void changeObjectName(Dog dog) {
		dog.setName("Bruce");
	}
}
