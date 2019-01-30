package designpattern1;

public class SingletonEagerInitialization {
	public static SingletonEagerInitialization singleObject = new SingletonEagerInitialization();
	private SingletonEagerInitialization() {	
	}
	public void checkInstance() {
		System.out.println("Instance is created by Eager");
	}
}
