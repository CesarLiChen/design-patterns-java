package decorator.pattern.starbuzz;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	
	@Override
	public double cost() {
//		return 0.89;
		double cost = 0.0;
		Size size = this.getSize();
		
		switch (size) {
		case TALL: 			
			cost = 0.89;
			break;
		case GRANDE: 
			cost = 0.90;
			break;
		case VENTI:
			cost = 0.92;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + size);
		}
		
//		if (getSize().equals(Size.TALL)) {
//			cost = 0.89;
//		} else if(getSize().equals(Size.GRANDE)) {
//			cost = 0.90;
//		} else {
//			cost = 0.92;
//		}
		
		return cost;
	}
}
