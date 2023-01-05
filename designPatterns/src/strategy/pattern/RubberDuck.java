package strategy.pattern;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehaviour = new NoQuack();
		flyBehaviour = new FlyNoWay();
	}

	public void display() {
		System.out.println("I'm a rubber duck");
	}
}
