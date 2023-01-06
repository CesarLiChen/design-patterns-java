package strategy.pattern;

public class Quack implements QuackBehaviourInterface {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}
}
