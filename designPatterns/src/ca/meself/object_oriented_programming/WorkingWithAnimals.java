package ca.meself.object_oriented_programming;

public class WorkingWithAnimals {
	
	public static void main(String[] args) {
		
		Dog clark = new Dog();
		
		clark.setName("Clarky");
		System.out.println(clark.getName());
		clark.digHole();	
	}
}
