package strategy.pattern.duck_simulator;

public class FlyWithWings implements FlyBehaviourInterface{

	@Override
	public void fly() {
		System.out.println("I'm FLYINGG (with wings)");
	}

}
