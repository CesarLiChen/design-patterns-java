package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {

	public CaliforniaStyleVeggiePizza() {
		name = "California Vegetarian Pizza";
		dough = "Combination of NY and Italian thin crust dough";
		sauce = "Minimal tomatoe sauce";
		
		toppings.add("Artichoke");
		toppings.add("Avocado");
		toppings.add("Goat cheese");
	}
}
