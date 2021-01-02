package structural.proxy;

public interface MediaHandler {

	//Read Operations
	void search();
	void play();
	void pause();
	void resume();
	
	// Write Operations
	void move();
	void delete();
}
