package mclama.com;

public class Options {
	
	private Main game;
	
	
	private int TargetFps=60; //requires restart if changed

	public Options(Main game) {
		this.game = game;
	}
	
	public int getTargetFps() {
		return TargetFps;
	}

	public void setTargetFps(int targetFps) {
		TargetFps = targetFps;
	}

}
