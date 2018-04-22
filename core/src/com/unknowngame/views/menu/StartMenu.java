package com.unknowngame.views.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.unknowngame.utils.Consts;


import java.util.Random;

public class StartMenu extends GameScreen {
    private Texture sky;
    private Texture earth;
    private Texture title;
    private Array<Cloud> clouds;
    private Random random = new Random();

    public StartMenu() {
        sky = new Texture(fileService.findTexture("imgs/start_menu/sky"));
        earth = new Texture(fileService.findTexture("imgs/start_menu/earth"));
        createClouds();
    }

    private void createClouds() {
        clouds = new Array<>();
        for (int i = 0; i <= 3; i++) {
            Cloud cloud = new Cloud(new Vector2(i * Cloud.CLOUD_WIDTH, Consts.SCREEN_HEIGHT - Cloud.CLOUD_HEIGHT - random.nextInt(60)),
                    new Vector2(-0.5f, 0));
            clouds.add(cloud);
        }
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(sky, 0, 0, Consts.SCREEN_WIDTH, Consts.SCREEN_HEIGHT);
        clouds.forEach(c -> {
            c.render(sb);
        });
        sb.draw(earth, 0, 0, Consts.SCREEN_WIDTH, Consts.SCREEN_HEIGHT);
        sb.end();
    }


    @Override
    public void dispose() {
        sky.dispose();
        earth.dispose();
        Cloud.dispose();
    }

    @Override
    protected void handleInput() {

    }

    private static class Cloud {
        private static final int CLOUD_WIDTH = 550;
        private static final int CLOUD_HEIGHT = 230;
        private Vector2 position;
        private Vector2 velocity;
        private static Texture cloudTexture = new Texture(fileService.findTexture("imgs/start_menu/cloud"));
        private Random random = new Random();

        private Cloud(Vector2 position, Vector2 velocity) {
            this.position = position;
            this.velocity = velocity;
        }

        private void update() {
            position.add(velocity);

            if (position.x < -CLOUD_WIDTH) {
                position.x = Gdx.graphics.getWidth() + random.nextInt(100);
            }
            if (position.y > Gdx.graphics.getHeight()) {
                position.y = Gdx.graphics.getHeight() - CLOUD_HEIGHT;
                position.x = Gdx.graphics.getWidth();
            }
        }

        private void render(SpriteBatch sb) {
            sb.draw(cloudTexture, position.x, position.y, CLOUD_WIDTH, CLOUD_HEIGHT);
            update();
        }

        private static void dispose() {
            cloudTexture.dispose();
        }
    }

}
