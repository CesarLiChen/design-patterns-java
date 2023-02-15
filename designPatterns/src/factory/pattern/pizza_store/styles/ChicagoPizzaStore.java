package factory.pattern.pizza_store.styles;

import factory.pattern.pizza_store.Pizza;
import factory.pattern.pizza_store.PizzaStore;
import factory.pattern.pizza_store.pizza_types.ChicagoCheesePizza;
import factory.pattern.pizza_store.pizza_types.ChicagoClamPizza;
import factory.pattern.pizza_store.pizza_types.ChicagoPepperoniPizza;
import factory.pattern.pizza_store.pizza_types.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			return new ChicagoCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoVeggiePizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoPepperoniPizza();
		} else if (type.equals("clam")) {
			return new ChicagoClamPizza();			
		} else {
			return null;
		}
	}
}
