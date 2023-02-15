package factory.pattern.pizza_store.styles;

import factory.pattern.pizza_store.Pizza;
import factory.pattern.pizza_store.PizzaStore;
import factory.pattern.pizza_store.pizza_types.NYStyleCheesePizza;
import factory.pattern.pizza_store.pizza_types.NYStyleClamPizza;
import factory.pattern.pizza_store.pizza_types.NYStylePepperoniPizza;
import factory.pattern.pizza_store.pizza_types.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();			
		} else {
			return null;
		}
	}
}
