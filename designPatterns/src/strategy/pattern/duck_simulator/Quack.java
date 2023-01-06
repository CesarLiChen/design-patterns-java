package strategy.pattern.duck_simulator;

public class Quack implements QuackBehaviourInterface {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}
}
