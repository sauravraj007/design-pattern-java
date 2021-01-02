package structural.proxy;

public class MediaHandlerProxy implements MediaHandler {
	
	private MediaHandlerImpl mediaHandler;
	private String role;
	

	public MediaHandlerProxy(MediaHandlerImpl mediaHandler, String role) {
		this.mediaHandler = mediaHandler;
		this.role = role;
	}

	@Override
	public void search() {
		mediaHandler.search();
	}

	@Override
	public void play() {
		mediaHandler.play();
	}

	@Override
	public void pause() {
		mediaHandler.pause();
	}

	@Override
	public void resume() {
		mediaHandler.resume();
	}

	@Override
	public void move() {
		if (role == "Admin") {
			mediaHandler.move();
		}
		else {
			throw new UnsupportedOperationException("Move operation is not allowed for: " + role + " role.");
		}
	}

	@Override
	public void delete() {
		if (role == "Admin") {
			mediaHandler.delete();
		}
		else {
			throw new UnsupportedOperationException("Delete operation is not allowed for: " + role + " role.");
		}
	}

}
