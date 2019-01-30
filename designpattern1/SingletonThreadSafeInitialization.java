package designpattern1;

public class SingletonThreadSafeInitialization {
	private static SingletonThreadSafeInitialization singleObject;
	private SingletonThreadSafeInitialization() {
		
	}
	synchronized public static SingletonThreadSafeInitialization getInstance() {
		if (singleObject==null)
			singleObject = new SingletonThreadSafeInitialization();
		return singleObject;
	}
	public void checkInstance() {
		System.out.println("Instance is created by ThreadSafe");
	}

}
