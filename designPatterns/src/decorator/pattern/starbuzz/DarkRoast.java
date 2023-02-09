package decorator.pattern.starbuzz;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Dark Roast Cofee";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
}
