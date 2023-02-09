package decorator.pattern.starbuzz;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Dark Roast Cofee";
	}
	
	@Override
	public double cost() {
		
		double cost = 0.0;
		Size size = this.getSize();
		
		if (size == Size.TALL) {
			cost = 0.99;
		} else if (size == Size.GRANDE) {
			cost = 1.00;
		} else if (size == Size.VENTI) {
			cost = 1.02;
		}
		
		return cost;
	}
}
