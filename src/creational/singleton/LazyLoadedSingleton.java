package creational.singleton;

public class LazyLoadedSingleton {
	
	private static class LazyLoadedSingletonHolder {
		private static final LazyLoadedSingleton INSTANCE = new LazyLoadedSingleton();
	}
	
	public static LazyLoadedSingleton getInstance() {
        return LazyLoadedSingletonHolder.INSTANCE;
    }
}
