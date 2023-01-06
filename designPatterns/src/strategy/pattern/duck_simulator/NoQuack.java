package strategy.pattern.duck_simulator;

public class NoQuack implements QuackBehaviourInterface {

	@Override
	public void quack() {
		System.out.println("<< silence >>");
	}
}
