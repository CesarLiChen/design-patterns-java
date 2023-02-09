package decorator.pattern.starbuzz;

public class CoffeeApp {

	public static void main(String[] args) {
		
		Beverage beverage1 = new HouseBlend();
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		beverage1 = new Soy(beverage1);
		beverage1 = new Whip(beverage1);
		
		System.out.println("A " + beverage1.getDescription() + " is comming!\nIt will be: " + beverage1.cost());
	}

}
