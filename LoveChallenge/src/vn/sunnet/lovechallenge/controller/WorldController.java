package vn.sunnet.lovechallenge.controller;

import vn.sunnet.lovechallenge.model.World;

public class WorldController {

	private World world;
	private PlayerController playerController;

	public WorldController(World world) {
		this.world = world;

		playerController = new PlayerController(world);
	}

	public void update(float delta) {
		playerController.update(delta);
	}

	public PlayerController getPlayerController() {
		return playerController;
	}

}
