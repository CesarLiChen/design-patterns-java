package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class NYStyleVeggiePizza extends Pizza{
	
	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and Vegetarian Pizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
