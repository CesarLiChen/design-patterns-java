package decorator.pattern.starbuzz;

import decorator.pattern.starbuzz.Beverage.Size;

public class CoffeeApp {

	public static void main(String[] args) {
		
		Beverage beverage1 = new HouseBlend();
		beverage1.setSize(Size.VENTI);
		System.out.printf("%s $ %.2f\n", beverage1.getDescription(), beverage1.cost());
		
		beverage1 = new Mocha(beverage1);
		System.out.printf("%s $ %.2f\n", beverage1.getDescription(), beverage1.cost());
		
		beverage1 = new Mocha(beverage1);
		System.out.printf("%s $ %.2f\n", beverage1.getDescription(), beverage1.cost());
		
		beverage1 = new Soy(beverage1);
		System.out.printf("%s $ %.2f\n", beverage1.getDescription(), beverage1.cost());
		
		beverage1 = new Whip(beverage1);
		System.out.printf("%s $ %.2f\n", beverage1.getDescription(), beverage1.cost());
		
		System.out.printf("BEVERAGE 1: A %s!\nIt will be: %.2f\n", beverage1.getDescription(), beverage1.cost());
		
		System.out.println("========================");
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		String b2Desc = beverage2.getDescription();
		double b2Cost = beverage2.cost();
		System.out.printf("BEVERAGE 1: A %s!\nIt will be: %.2f\n", b2Desc, b2Cost);
	}

}
