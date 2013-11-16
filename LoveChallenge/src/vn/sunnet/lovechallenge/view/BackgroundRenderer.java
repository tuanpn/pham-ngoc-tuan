package vn.sunnet.lovechallenge.view;

import vn.sunnet.lovechallenge.Resources;
import vn.sunnet.lovechallenge.model.World;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BackgroundRenderer {

	OrthographicCamera cam;
	World world;
	Sprite bgSprite1;
	Sprite bgSprite2;

	Sprite bgSprite3;
	Sprite bgSprite4;
	Sprite bgSprite5;

	public BackgroundRenderer(World world, OrthographicCamera cam) {
		this.world = world;
		this.cam = cam;
		bgSprite1 = Resources.getInstance().bgSprite;
		bgSprite2 = new Sprite(bgSprite1);
		bgSprite2.setPosition(bgSprite1.getX() + bgSprite1.getWidth(),
				bgSprite1.getY());
		bgSprite3 = new Sprite(bgSprite1);
		bgSprite3.setPosition(bgSprite2.getX() + bgSprite1.getWidth(),
				bgSprite1.getY());
		bgSprite4 = new Sprite(bgSprite1);
		bgSprite4.setPosition(bgSprite3.getX() + bgSprite1.getWidth(),
				bgSprite1.getY());
		bgSprite5 = new Sprite(bgSprite1);
		bgSprite5.setPosition(bgSprite4.getX() + bgSprite1.getWidth(),
				bgSprite1.getY());
	}

	public void render(SpriteBatch batch, float delta) {
		// if (cam.position.x >= bgSprite1.getWidth() + 400) {
		// world.getPlayer().getPosition().x =
		// world.getPlayer().POSITION_INIT_X;
		// }
		bgSprite1.draw(batch);
		bgSprite2.draw(batch);
		bgSprite3.draw(batch);
		bgSprite4.draw(batch);
		bgSprite5.draw(batch);
//		batch.draw(bgSprite1, 0, 0);
//		batch.draw(bgSprite1, bgSprite1.getWidth(), 0);
//		batch.draw(bgSprite1, 2 * bgSprite1.getWidth(), 0);
	}

}
