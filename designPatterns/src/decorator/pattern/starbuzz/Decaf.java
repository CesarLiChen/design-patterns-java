package decorator.pattern.starbuzz;

public class Decaf extends Beverage{

	public Decaf() {
		description = "Decaffeinated Coffee";
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
			cost = 1.05;
		} else if (size == Size.GRANDE) {
			cost = 1.06;
		} else if (size == Size.VENTI) {
			cost = 1.08;
		}
		
		return cost;
	}
}
