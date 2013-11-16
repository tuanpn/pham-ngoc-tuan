package vn.sunnet.lovechallenge.view;

import vn.sunnet.lovechallenge.model.World;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class WorldRenderer {

	private World world;
	private boolean debug;

	SpriteBatch batcher;
	OrthographicCamera cam;

	BackgroundRenderer bgRenderer;

	public WorldRenderer(World world, boolean debug) {
		this.world = world;
		this.debug = debug;

		cam = new OrthographicCamera();
		cam.setToOrtho(false, 800, 480);
		cam.position.set(400, 240, 0);
		cam.update();

		batcher = new SpriteBatch();
		batcher.setProjectionMatrix(cam.combined);

		bgRenderer = new BackgroundRenderer(world, cam);

	}

	public void render(float delta) {
		cam.position.x = world.getPlayer().getPosition().x + 400
				- world.getPlayer().POSITION_INIT_X;
		if (cam.position.x >= 1024*3 + 400) {
			world.getPlayer().getPosition().x = world.getPlayer().POSITION_INIT_X;
		}
		cam.update();
		batcher.setProjectionMatrix(cam.combined);
		batcher.disableBlending();
		batcher.begin();
		bgRenderer.render(batcher, delta);
		batcher.end();

//		if (debug)
//			drawDebug();
	}

	ShapeRenderer renderer = new ShapeRenderer();

	private void drawDebug() {
		renderer.setProjectionMatrix(cam.combined);
		renderer.begin(ShapeType.Line);
		renderer.rect(world.getPlayer().getBounds().x, world.getPlayer()
				.getBounds().y, world.getPlayer().getBounds().width, world
				.getPlayer().getBounds().height);
		renderer.end();
	}

}
