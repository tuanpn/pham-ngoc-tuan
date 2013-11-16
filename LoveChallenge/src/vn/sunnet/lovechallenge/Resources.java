package vn.sunnet.lovechallenge;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Resources {

	private static Resources instance;

	public static Resources getInstance() {
		if (instance == null) {
			instance = new Resources();
		}
		return instance;
	}

	public Resources() {

	}

	public void loadGameScreen(AssetManager manager1, AssetManager manager2) {
		manager1.load("data/bg/bg.png", Texture.class);
	}

	public void unloadGameScreen(AssetManager manager1, AssetManager manager2) {
		manager1.unload("data/bg/bg.png");
	}

	public Sprite bgSprite;

	public void getGameScreen(AssetManager manager1, AssetManager manager2) {
		Texture bgTexture = manager1.get("data/bg/bg.png");
		bgTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		bgSprite = new Sprite(bgTexture);
	}

}
