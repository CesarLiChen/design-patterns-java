package decorator.pattern.starbuzz;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Whip";
	}
	
	@Override
	public Size getSize() {
		return beverage.getSize();
	}

	@Override
	public double cost() {
		
		double cost = beverage.cost();
		Size size = beverage.getSize();
		
		if (size == Size.TALL) {
			cost += 0.00;
		} else if (size == Size.GRANDE) {
			cost += 0.05;
		} else if (size == Size.VENTI) {
			cost += 0.10;
		}
		
		return cost;
	}
}
