package vn.sunnet.lovechallenge.model.staticobjects;

import vn.sunnet.lovechallenge.controller.LoadMap;

public class Banana extends StaticObject {

	public static int BANANA_WIDTH = LoadMap.static_banana_width;
	public static int BANANA_HEIGHT = LoadMap.static_banana_height;

	public Banana() {
		bounds.width = BANANA_WIDTH;
		bounds.height = BANANA_HEIGHT;
	}

}
