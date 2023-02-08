package decorator.pattern.starbuzz;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.description + " + Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}
}
