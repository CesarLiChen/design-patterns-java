package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class NYStylePepperoniPizza extends Pizza{
	
	public NYStylePepperoniPizza() {
		name = "NY Style Sauce and Pepperoni Pizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
