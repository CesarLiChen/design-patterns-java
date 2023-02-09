package decorator.pattern.starbuzz;

import decorator.pattern.starbuzz.Beverage.Size;

public class CoffeeApp {

	public static void main(String[] args) {
		
		Beverage beverage1 = new HouseBlend();
		beverage1.setSize(Size.VENTI);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Soy(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Whip(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		System.out.println("BEVERAGE 1: A " + beverage1.getDescription() + " is comming!\nIt will be: " + beverage1.cost());
		
		System.out.println("========================");
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("BEVERAGE 2: A " + beverage2.getDescription() + " is comming!\nIt will be: " + beverage2.cost());
	}

}
