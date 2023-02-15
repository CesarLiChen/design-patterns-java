package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {

	public CaliforniaStyleCheesePizza() {
		name = "California Cheese Pizza";
		dough = "Combination of NY and Italian thin crust dough";
		sauce = "Minimal tomatoe sauce";
		
		toppings.add("Artichoke");
		toppings.add("Avocado");
		toppings.add("Goat cheese");
	}
}
