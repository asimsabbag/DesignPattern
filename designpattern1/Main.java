package designpattern1;

public class Main {

	public static void main(String[] args) {
		SingletonEagerInitialization obj1 = SingletonEagerInitialization.singleObject;
        obj1.checkInstance();
        SingletonLazyInitialiazation obj2 = SingletonLazyInitialiazation.getInstance();
        obj2.checkInstance();
        SingletonThreadSafeInitialization obj3 = SingletonThreadSafeInitialization.getInstance();
        obj3.checkInstance();
		//constructed is not visible cause i made that private to ensure single object SingletonEagerInitialization obj4 = new SingletonEagerInitialization();
        
	}

}
