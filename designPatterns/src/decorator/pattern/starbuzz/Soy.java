package decorator.pattern.starbuzz;

public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.description + " + Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .15;
	}
}
