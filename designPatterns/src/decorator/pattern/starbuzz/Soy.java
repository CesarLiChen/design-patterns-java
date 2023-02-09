package decorator.pattern.starbuzz;

public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Soy";
	}

	@Override
	public double cost() {
		
		double cost = beverage.cost();
		Size size = beverage.getSize();
		
		if (size == Size.TALL) {
			cost += 0.05;
		} else if (size == Size.GRANDE) {
			cost += 0.10;
		} else if (size == Size.VENTI) {
			cost += 0.15;
		}
		
		return cost;
	}
}
