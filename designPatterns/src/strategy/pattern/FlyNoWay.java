package strategy.pattern;

public class FlyNoWay implements FlyBehaviourInterface {

	@Override
	public void fly() {
		System.out.println("Oh, I can't fly.");
	}

}
