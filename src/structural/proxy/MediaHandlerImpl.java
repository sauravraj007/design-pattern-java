package structural.proxy;

public class MediaHandlerImpl implements MediaHandler {

	private String mediaName;

	public MediaHandlerImpl(String mediaName) {
		this.mediaName = mediaName;
	}

	@Override
	public void search() {
		System.out.println("Searching for: " + mediaName);
	}

	@Override
	public void play() {
		System.out.println("Playing media: " + mediaName);
	}

	@Override
	public void pause() {
		System.out.println("Paused: " + mediaName);
	}

	@Override
	public void resume() {
		System.out.println("Resuming: " + mediaName);
	}

	@Override
	public void move() {
		System.out.println("Moving: " + mediaName);
	}

	@Override
	public void delete() {
		System.out.println("Deleting: " + mediaName);
	}

}
