package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class ChicagoPepperoniPizza extends Pizza{
	
	public ChicagoPepperoniPizza() {
		name = "Chicago Style Deep Dish Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
