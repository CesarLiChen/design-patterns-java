package strategy.pattern;

public class NoQuack implements QuackBehaviourInterface {

	public void quack() {
		System.out.println("<< silence >>");
	}
}
