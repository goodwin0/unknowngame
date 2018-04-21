package com.unknowngame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.unknowngame.UnknownGameRunner;
import com.unknowngame.utils.Consts;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Consts.SCREEN_WIDTH;
		config.height = Consts.SCREEN_HEIGHT;
		new LwjglApplication(new UnknownGameRunner(), config);
	}
}
