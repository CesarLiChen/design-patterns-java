package strategy.pattern.duck_simulator;

public class FlyNoWay implements FlyBehaviourInterface {

	@Override
	public void fly() {
		System.out.println("Oh, I can't fly.");
	}

}
