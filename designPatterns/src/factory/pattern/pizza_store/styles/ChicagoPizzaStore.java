package factory.pattern.pizza_store.styles;

import factory.pattern.pizza_store.Pizza;
import factory.pattern.pizza_store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();			
		} else {
			return null;
		}
	}
}
