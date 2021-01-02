package creational.singleton;

public class EagerLoadedSingleton {
	private static final EagerLoadedSingleton INSTANCE = new EagerLoadedSingleton();
	
	public static EagerLoadedSingleton getInstance() {
		return INSTANCE;
	}

}
