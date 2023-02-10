package decorator.pattern.starbuzz;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Mocha";
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
			cost += 0.10;
		} else if (size == Size.GRANDE) {
			cost += 0.15;
		} else if (size == Size.VENTI) {
			cost += 0.20;
		}
		
		return cost;
	}
}
