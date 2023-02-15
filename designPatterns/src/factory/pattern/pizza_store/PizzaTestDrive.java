package factory.pattern.pizza_store;

import factory.pattern.pizza_store.styles.CaliforniaPizzaStore;
import factory.pattern.pizza_store.styles.ChicagoPizzaStore;
import factory.pattern.pizza_store.styles.NYPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Clark ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Bruce ordered a " + pizza.getName() + "\n");
		
		pizza = californiaStore.orderPizza("cheese");
		System.out.println("Kara ordered a " + pizza.getName() + "\n");
	}

}
