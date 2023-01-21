package ca.meself.object_oriented_programming;

public class Animal {

	private String name;
	private int weight;
	private String sound;
	
	/** Getter and Setter for name**/
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	/** Getter and Setter for weight**/
	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	
	public int getWeight() {
		return weight;
	}
	
	/** Getter and Setter for sound**/
	public void setSound(String newSound) {
		sound = newSound;
	}
	
	public String getSound() {
		return sound;
	}
}
