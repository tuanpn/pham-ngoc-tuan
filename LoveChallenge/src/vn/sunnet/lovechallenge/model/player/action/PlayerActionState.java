package vn.sunnet.lovechallenge.model.player.action;

public interface PlayerActionState {

	public void flingup();
	
	public void flingdown();
	
	public void collistionImpedimet();
	
	public void idleRun(float delta);
	
}
