package decorator.pattern.starbuzz;

public class Espresso extends Beverage{
	
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public Size getSize() {
		return this.size;
	}

	@Override
	public double cost() {
		
		double cost = 0.0;
		Size size = this.getSize();
		
		if (size == Size.TALL) {
			cost = 1.99;
		} else if (size == Size.GRANDE) {
			cost = 2.00;
		} else if (size == Size.VENTI) {
			cost = 2.02;
		}
		
		return cost;
	}
	
}
