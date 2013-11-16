package vn.sunnet.lovechallenge.model.player.action;

import vn.sunnet.lovechallenge.model.player.Player;

public class ActionJump1 implements PlayerActionState {

	Player player;

	public ActionJump1(Player player) {
		this.player = player;
	}

	@Override
	public void flingup() {

		if (player.isFlingUp()) {
			player.getVeloctity().y += player.VELOCITY_Y_JUMP;
			player.setFlingUp(false);
			player.setActionState(player.getJumpState2());
		}

	}

	@Override
	public void flingdown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void collistionImpedimet() {
		// TODO Auto-generated method stub

	}

	@Override
	public void idleRun(float delta) {
		if (player.getPosition().y < player.POSITION_INIT_Y
				&& player.getVeloctity().y < 0) {
			player.getAccelation().y = 0;
			player.getVeloctity().y = 0;
			player.getPosition().y = player.POSITION_INIT_Y;
			player.setActionState(player.getRunState());
		}
	}

}
