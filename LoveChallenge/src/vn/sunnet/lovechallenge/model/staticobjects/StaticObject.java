package vn.sunnet.lovechallenge.model.staticobjects;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class StaticObject {

	protected Vector2 position;

	protected Rectangle bounds;
	
	protected float damage;

	public StaticObject() {
		this(new Vector2(), new Rectangle());
	}

	public StaticObject(Vector2 positon) {
		this(positon, new Rectangle());
	}

	public StaticObject(Vector2 position, Rectangle bounds) {
		this.position = position;
		this.bounds = bounds;
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

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}
	
	

}
