package strategy.pattern.duck_simulator;

public class Squeak implements QuackBehaviourInterface {

	@Override
	public void quack() {
		System.out.println("squeak squeak..");
	}
}
