package factory.pattern.pizza_store.pizza_types;

import factory.pattern.pizza_store.Pizza;

public class ChicagoClamPizza extends Pizza{
	
	public ChicagoClamPizza() {
		name = "Chicago Style Deep Dish ClamPizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
