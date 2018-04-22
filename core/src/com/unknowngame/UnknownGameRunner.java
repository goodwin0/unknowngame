package com.unknowngame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.unknowngame.views.menu.Menu;
import com.unknowngame.views.menu.ScreenManager;

public class UnknownGameRunner extends ApplicationAdapter {
	private SpriteBatch batch;
	private ScreenManager screenManager;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		screenManager = new ScreenManager();
		screenManager.setActiveScreen(Menu.START_MENU.getScreen());
		Gdx.gl.glClearColor(0, 0, 0, 1);

	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		screenManager.getActiveScreen().render(batch);

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
