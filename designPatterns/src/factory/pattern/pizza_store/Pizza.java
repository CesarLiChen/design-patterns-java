package factory.pattern.pizza_store;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Spreading the SAUCE");
		System.out.println("Adding these toppings: ");
		for (String topping : toppings) {
			System.out.println("===> " + topping);
		}
	}
	
	protected void bake() {
		System.out.println("Baking for 25 mins at 350 degrees Fahrenheit");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza.. **slash, slash, slash**");
	}
	
	protected void box() {
		System.out.println("Boxing the pizza");
	}
	
	public String getName() {
		return name;
	}
	
}
