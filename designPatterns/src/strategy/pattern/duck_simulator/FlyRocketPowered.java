package strategy.pattern.duck_simulator;

public class FlyRocketPowered implements FlyBehaviourInterface{

	@Override
	public void fly() {
		System.out.println("I fly with the help of a rocket!!");
	}
}
