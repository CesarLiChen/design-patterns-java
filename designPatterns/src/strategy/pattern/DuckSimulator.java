package strategy.pattern;

public class DuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		
		System.out.println("");
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performQuack();
		rubber.performFly();
		rubber.swim();
		
		System.out.println("");
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehaviour(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
