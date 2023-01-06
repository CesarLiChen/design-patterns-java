package strategy.pattern.duck_simulator;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehaviour = new NoQuack();
		flyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duck");
	}
}
