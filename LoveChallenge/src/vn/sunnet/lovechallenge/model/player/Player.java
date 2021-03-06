package vn.sunnet.lovechallenge.model.player;

import vn.sunnet.lovechallenge.controller.LoadMap;
import vn.sunnet.lovechallenge.model.player.action.ActionJump1;
import vn.sunnet.lovechallenge.model.player.action.ActionJump2;
import vn.sunnet.lovechallenge.model.player.action.ActionRun;
import vn.sunnet.lovechallenge.model.player.action.ActionSit;
import vn.sunnet.lovechallenge.model.player.action.PlayerActionState;
import vn.sunnet.lovechallenge.model.player.state.CollistionImpedimentState;
import vn.sunnet.lovechallenge.model.player.state.DispiritedState;
import vn.sunnet.lovechallenge.model.player.state.FunnyState;
import vn.sunnet.lovechallenge.model.player.state.PlayerState;
import vn.sunnet.lovechallenge.model.player.state.SadState;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Player {

	public final int GRAVITY = LoadMap.player_gravity_y;
	public final int VELOCITY_X = LoadMap.player_velocity_x;
	public final int VELOCITY_Y_JUMP = LoadMap.player_velocity_y;
	public final int POSITION_INIT_X = LoadMap.player_position_x;
	public final int POSITION_INIT_Y = LoadMap.player_position_y;
	public final int WIDTH_RUN = LoadMap.player_width_run;
	public final int HEIGHT_RUN = LoadMap.player_height_run;
	public final int WIDTH_SIT = LoadMap.player_width_sit;
	public final int HEIGHT_SIT = LoadMap.player_height_sit;
	public final int TIME_SIT = LoadMap.player_time_sit;

	private int id;

	private Vector2 position;
	private Vector2 veloctity;
	private Vector2 accelation;
	private Rectangle bounds;

	private boolean alive;

	private boolean countJump;

	// public enum PlayerActionState {
	// RUN, JUMP, SIT, STOP
	// }
	//
	// private PlayerActionState actionState;

	private PlayerState funnyState;
	private PlayerState dispiritedState;
	private PlayerState sadState;
	private PlayerState tiredState;
	private PlayerState collistionImpedimentState;

	private PlayerState state;

	private PlayerActionState runState;
	private PlayerActionState jumpState1;
	private PlayerActionState jumpState2;
	private PlayerActionState sitState;
	private float stateTimeSit;

	private PlayerActionState actionState;

	/**
	 * phần trăm thanh trạng thái
	 */
	private int percentageStateBar;

	private boolean flingUp;
	private boolean flingDown;

	public Player(int id) {
		this.id = id;

		position = new Vector2(POSITION_INIT_X, POSITION_INIT_Y);
		veloctity = new Vector2(VELOCITY_X, 0);
		accelation = new Vector2(0, 0);
		bounds = new Rectangle(POSITION_INIT_X, POSITION_INIT_Y, WIDTH_RUN,
				HEIGHT_RUN);

		funnyState = new FunnyState(this);
		dispiritedState = new DispiritedState(this);
		sadState = new SadState(this);
		tiredState = new SadState(this);
		collistionImpedimentState = new CollistionImpedimentState(this);

		state = funnyState;

		setRunState(new ActionRun(this));
		setJumpState1(new ActionJump1(this));
		setJumpState2(new ActionJump2(this));
		setSitState(new ActionSit(this));

		actionState = runState;
	}

	public void flingup() {
		this.actionState.flingup();
	}

	public void flingdown() {
		this.actionState.flingdown();
	}

	public void collistionImpedimet() {
		this.actionState.collistionImpedimet();
	}

	public void idleRun(float delta) {
		this.actionState.idleRun(delta);
	}

	public void collistionImpediment(int type) {
		this.state.collistionImpediment(type);
	}

	public void increaseStateBar90() {
		this.state.increaseStateBar90();
	}

	public void increaseStateBar80() {
		this.state.increaseStateBar80();
	}

	public void increaseStateBar70() {
		this.state.increaseStateBar70();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Vector2 getVeloctity() {
		return veloctity;
	}

	public void setVeloctity(Vector2 veloctity) {
		this.veloctity = veloctity;
	}

	public boolean isCountJump() {
		return countJump;
	}

	public void setCountJump(boolean countJump) {
		this.countJump = countJump;
	}

	public PlayerActionState getRunState() {
		return runState;
	}

	public void setRunState(PlayerActionState runState) {
		this.runState = runState;
	}

	public PlayerActionState getActionState() {
		return actionState;
	}

	public void setActionState(PlayerActionState actionState) {
		this.actionState = actionState;
	}

	public Vector2 getAccelation() {
		return accelation;
	}

	public void setAccelation(Vector2 accelation) {
		this.accelation = accelation;
	}

	public boolean isFlingUp() {
		return flingUp;
	}

	public void setFlingUp(boolean flingUp) {
		this.flingUp = flingUp;
	}

	public PlayerActionState getJumpState1() {
		return jumpState1;
	}

	public void setJumpState1(PlayerActionState jumpState1) {
		this.jumpState1 = jumpState1;
	}

	public PlayerActionState getJumpState2() {
		return jumpState2;
	}

	public void setJumpState2(PlayerActionState jumpState2) {
		this.jumpState2 = jumpState2;
	}

	public boolean isFlingDown() {
		return flingDown;
	}

	public void setFlingDown(boolean flingDown) {
		this.flingDown = flingDown;
	}

	public PlayerActionState getSitState() {
		return sitState;
	}

	public void setSitState(PlayerActionState sitState) {
		this.sitState = sitState;
	}

	public float getStateTimeSit() {
		return stateTimeSit;
	}

	public void setStateTimeSit(float stateTimeSit) {
		this.stateTimeSit = stateTimeSit;
	}

}
