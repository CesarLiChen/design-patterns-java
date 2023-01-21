package ca.meself.object_oriented_programming;

public class Dog extends Animal {
	
	public Dog() {
		super();
		
		setSound("woof woof");
	}
	
	public void digHole() {
		System.out.println("Dug a hole");
	}
}
