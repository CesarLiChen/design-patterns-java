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
	public double cost() {
//		return beverage.cost() + .20;
		
		double cost = beverage.cost();
		Size size = beverage.getSize();
		
		switch (size) {
		case TALL: 			
			cost += 0.10;
			break;
		case GRANDE: 
			cost += 0.15;
			break;
		case VENTI:
			cost += 0.20;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + size);
		}
		
		return cost;
	}
}
