package creational.singleton;

/**
 * Naive Singleton Class
 * 
 * @author Saurav
 *
 */
public class NaiveSingleton {
	private static NaiveSingleton instance;
	
	private NaiveSingleton() {
		
	}
	
	public static synchronized NaiveSingleton getInstance() {
		if (instance == null) {
			instance =  new NaiveSingleton();
		}
		return instance;
	}

}
