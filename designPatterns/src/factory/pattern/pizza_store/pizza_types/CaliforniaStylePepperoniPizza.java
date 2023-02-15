package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
	
	public CaliforniaStylePepperoniPizza() {
		name = "California Pepperoni Pizza";
		dough = "Combination of NY and Italian thin crust dough";
		sauce = "Minimal tomatoe sauce";
		
		toppings.add("Artichoke");
		toppings.add("Avocado");
		toppings.add("Goat cheese");
	}
}
