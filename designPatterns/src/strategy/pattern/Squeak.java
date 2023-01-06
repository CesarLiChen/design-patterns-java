package strategy.pattern;

public class Squeak implements QuackBehaviourInterface {

	@Override
	public void quack() {
		System.out.println("squeak squeak..");
	}
}
