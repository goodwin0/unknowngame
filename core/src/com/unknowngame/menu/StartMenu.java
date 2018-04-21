package com.unknowngame.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.unknowngame.utils.Consts;

public class StartMenu extends Screen {
    private Texture sky;
    private Texture earth;
    private Texture clouds;
    private Texture title;

    public StartMenu() {
        sky = new Texture(Gdx.files.internal("imgs/start_menu/sky.png"));
        earth = new Texture(Gdx.files.internal("imgs/start_menu/earth.png"));
        clouds = new Texture(Gdx.files.internal("imgs/start_menu/clouds.png"));
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(sky,0,0, Consts.SCREEN_WIDTH, Consts.SCREEN_HEIGHT);
        sb.draw(clouds,-2000,Consts.SCREEN_HEIGHT-(int)(398*0.7), 4000,(int)(398*0.7));
        sb.draw(earth,0,0, Consts.SCREEN_WIDTH, Consts.SCREEN_HEIGHT);
        sb.end();
    }

    @Override
    public void dispose() {
        sky.dispose();
        earth.dispose();
        clouds.dispose();
    }

    @Override
    protected void handleInput() {

    }
}
