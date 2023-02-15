package factory.pattern.pizza_store.styles;

import factory.pattern.pizza_store.Pizza;
import factory.pattern.pizza_store.PizzaStore;
import factory.pattern.pizza_store.pizza_types.CaliforniaStyleCheesePizza;
import factory.pattern.pizza_store.pizza_types.CaliforniaStyleClamPizza;
import factory.pattern.pizza_store.pizza_types.CaliforniaStylePepperoniPizza;
import factory.pattern.pizza_store.pizza_types.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new CaliforniaStyleVeggiePizza();
		} else if (type.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new CaliforniaStyleClamPizza();			
		} else {
			return null;
		}
	}
}
