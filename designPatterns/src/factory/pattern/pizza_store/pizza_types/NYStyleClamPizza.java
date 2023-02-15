package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class NYStyleClamPizza extends Pizza{
	
	public NYStyleClamPizza() {
		name = "NY Style Sauce and Clam Pizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
