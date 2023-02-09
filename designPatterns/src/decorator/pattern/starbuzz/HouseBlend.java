package decorator.pattern.starbuzz;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	
	@Override
	public double cost() {
		
		double cost = 0.0;
		Size size = this.getSize();
		
		if (size == Size.TALL) {
			cost = 0.89;
		} else if (size == Size.GRANDE) {
			cost = 0.90;
		} else if (size == Size.VENTI) {
			cost = 0.92;
		}
		
		return cost;
	}
}
