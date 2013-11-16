package vn.sunnet.lovechallenge.model;

import vn.sunnet.lovechallenge.model.player.Player;

public class World {

	private Player player;

	public Player getPlayer() {
		return player;
	}

	public World() {
		player = new Player(0);
	}

//	public void setInit() {
//		player.setPositionInit(new Vector2(LoadMap.player_position_x,
//				LoadMap.player_position_y));
//		player.setPosition(new Vector2(LoadMap.player_position_x,
//				LoadMap.player_position_y));
//		player.setBounds(new Rectangle(player.getPosition().x, player
//				.getPosition().y, LoadMap.player_width_run,
//				LoadMap.player_height_run));
//	}

}
