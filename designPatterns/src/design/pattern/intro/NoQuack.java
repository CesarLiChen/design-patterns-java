package design.pattern.intro;

public class NoQuack implements QuackBehaviourInterface {

	public void quack() {
		System.out.println("<< silence >>");
	}
}
