package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class ChicagoCheesePizza extends Pizza{
	
	public ChicagoCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
