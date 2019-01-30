package designpattern1;

public class SingletonLazyInitialiazation {
	private static  SingletonLazyInitialiazation singleObject;
	private SingletonLazyInitialiazation() {
	 
    }
	public static SingletonLazyInitialiazation getInstance() {
		if(singleObject==null)
		{
			singleObject = new SingletonLazyInitialiazation();
		}
		return singleObject;
	}
	public void checkInstance() {
		System.out.println("Instance is created by Lazy");
	}
}
