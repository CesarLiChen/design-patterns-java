package design.pattern.intro;

public abstract class Duck {
	
	QuackBehaviourInterface quackBehaviour;
	FlyBehaviourInterface flyBehaviour;
	
	public Duck() {}
	
	public abstract void display();
	
	public void setFlyBehaviour(FlyBehaviourInterface fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviourInterface qb) {
		quackBehaviour = qb;
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}	
	
	public void swim() {
		System.out.println("Every duck floats, even fake ones!");
	}
}
